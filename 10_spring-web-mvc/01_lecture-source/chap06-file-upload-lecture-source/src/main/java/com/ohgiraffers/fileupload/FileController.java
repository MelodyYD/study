package com.ohgiraffers.fileupload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class FileController {

    @Autowired
    // yml 파일에 작성한 value 를 읽을 준비
    private ResourceLoader resourceLoader;

    @PostMapping("single-file")
    public String singleFileTest(@RequestParam MultipartFile singleFile, String description, Model model) throws IOException {

        /*
        *   @RequestParam 어노테이션은 우리가 요청한 데이터를 받아올 수 있게 하는 어노테이션이다.
        *   하지만 매개변수 명이 일치한다면 생략이 가능하다.
        * */

        System.out.println("singleFile = " + singleFile);
        System.out.println("description = " + description);

        // 1. 파일을 저장할 위치 설정
        Resource resource = resourceLoader.getResource("classpath:static/img/single");

        String filePath = null;

        // 위에서 지정한 파일 저장 위치가 존재하지 않는다면
        if(!resource.exists()) {
            String root = "src/main/resources/static/img/single";
            File file = new File(root);
            // make directory 의 약자
            // 우리가 지정한 경로대로 디랙토리를 만들어준다.
            file.mkdirs();

            // 만든 폴더의 경로를 filePath 변수에 담아주기
            filePath = file.getAbsolutePath();
        } else {
            // 디렉토리가 만들어진 적이 있다면
            filePath = resourceLoader.getResource("classpath:static/img/single")
                    .getFile().getAbsolutePath();
        }

        // 2. 파일 데이터 받아오고 저장할 경로 가져왔으니
        //    데이터 변경 처리 시작

        // 원본 파일명 담기
        String originFileName = singleFile.getOriginalFilename();

        // 확장자 제거
        String ext = originFileName.substring(originFileName.lastIndexOf("."));
        System.out.println("ext = " + ext);

        // 파일의 고유한 이름 부여
        // 고유 번호를 부여해주는 UUID 클래스
        String saveName = UUID.randomUUID().toString().replace("-", "") + ext;
        System.out.println("saveName = " + saveName);

        // 3. 고유한 파일 식별번호 및 파일 저장경로 생성 완료.
        //    파일을 저장 경로에 저장
        // 전달 받은 파일 객체를 변환
        singleFile.transferTo(new File(filePath + "/" + saveName));
        model.addAttribute("message", "파일 업로드 성공!!");
        model.addAttribute("img", "static/img/single/" + saveName);

        return "result";

    }

    @PostMapping("multi-file")
    public String multiFile(@RequestParam List<MultipartFile> multiFile, String description, Model model) throws IOException {

        // 1. 파일을 저장할 위치 설정
        Resource resource = resourceLoader.getResource("classpath:static/img/multi");

        String filePath = null;

        // 위에서 지정한 파일 저장 위치가 존재하지 않는다면
        if(!resource.exists()) {
            String root = "src/main/resources/static/img/multi";
            File file = new File(root);
            // make directory 의 약자
            // 우리가 지정한 경로대로 디랙토리를 만들어준다.
            file.mkdirs();

            // 만든 폴더의 경로를 filePath 변수에 담아주기
            filePath = file.getAbsolutePath();
        } else {
            // 디렉토리가 만들어진 적이 있다면
            filePath = resourceLoader.getResource("classpath:static/img/multi")
                    .getFile().getAbsolutePath();
        }

        // 2. 멀티 파일 변경 처리
        List<FileDTO> files = new ArrayList<>();
        List<String> savedFiles = new ArrayList<>();

        for(MultipartFile file : multiFile) {

            String originFileName = file.getOriginalFilename();
            String ext = originFileName.substring(originFileName.lastIndexOf("."));
            String savedName = UUID.randomUUID().toString().replace("-", "") + ext;

            files.add(new FileDTO(originFileName, savedName, filePath, description));
            file.transferTo(new File(filePath + "/" + savedName));
            savedFiles.add("static/img/multi/" + savedName);

        }

        model.addAttribute("message", "파일들 업로드 성공!!");
        model.addAttribute("imgs", savedFiles);

        return "result";
    }

}
