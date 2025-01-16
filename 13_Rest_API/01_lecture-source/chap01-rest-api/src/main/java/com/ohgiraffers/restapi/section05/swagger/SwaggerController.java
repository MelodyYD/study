package com.ohgiraffers.restapi.section05.swagger;

import com.ohgiraffers.restapi.section02.responseentity.ResponseMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// @Tag : 관련 있는
@Tag(name = "Spring Boot Swagger 연동(USER 관련 기능)")
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

    private List<UserDTO> users;

    public SwaggerController() {
        users = new ArrayList<>();
        users.add(new UserDTO(1, "user01", "pass01", "푸바오", LocalDate.now()));
        users.add(new UserDTO(2, "user02", "pass02", "후이바오", LocalDate.now()));
        users.add(new UserDTO(3, "user03", "pass03", "루이바오", LocalDate.now()));
    }

    /* comment.
    *   @Operation 란?
    *    해당하는 API 의 정보를 기술하는 어노테이션
    *    속성
    *    - summary : 해당 API 의 간단한 요약을 제공
    *    - description : 해당 API 의 상세한 설명 제공
    * */
    @Operation(summary = "전체 회원 조회", description = "우리 사이트 전체 회원 목록 조회입니다.")
    @GetMapping("/users")
    public ResponseEntity<ResponseMessage> findAllUsers() {

        HttpHeaders headers = new HttpHeaders();
        // 응답 할 데이터의 양식 지정
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("users", users);

        ResponseMessage responseMessage =
                new ResponseMessage(200, "조회 성공", responseMap);

        return new ResponseEntity<>(responseMessage, headers, HttpStatus.OK);
    }

    @Operation(
            summary = "회원 번호로 회원 조회",
            description = "회원 번호를 통해 특정 회원을 조회합니다.",
            parameters = {@Parameter(name = "userNo", description = "사용자 화면에서 넘어오는 user 의 PK")}
    )
    @GetMapping("/users/{userNo}")
    public List<UserDTO> findUserByNo(@PathVariable int userNo) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        UserDTO foundUser =
                users.stream()
                        .filter(user -> user.getNo() == userNo)
                        .collect(Collectors.toList())
                        .get(0);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("user", foundUser);

        return users;
    }

    /* comment.
     *   form 태그로 데이터 전달 받는 것과
     *   javaScript 로 데이터 전달 받는 것이 다르다.
     *  */
    @Operation(
            summary = "신규 회원 등록",
            description = "사용자 화면에서 받는 데이터로 신규 회원을 등록합니다.",
            parameters = {@Parameter(name = "newUser", description = "회원가입 관련 정보 DTO")}
    )
    @PostMapping("/user/regist")
    public ResponseEntity<?> regist(@RequestBody UserDTO newUser) {

        System.out.println("Json 데이터 @RequestBody 로 들어오니 : " + newUser);

        // List 에 들어있는 마지막 no 가져오기
        int lastNo = users.get(users.size() - 1).getNo();
        newUser.setNo(lastNo + 1);

        return ResponseEntity
                // 201 상태코드 -> 등록 관련(자원 생성 관련) 상태코드
                .created(URI.create("/swagger/users/" + users.get(users.size() -1).getNo()))
                .build();
    }

    /* 수정 */
    @Operation(summary = "회원 정보 수정")
    @PutMapping("/users/{userNo}")
    public ResponseEntity<?> modifyUser(@PathVariable int userNo, @RequestBody UserDTO modifyInfo) {
        // 회원 정보 수정을 위한 유저 특정하기
        UserDTO foundUser =
                users.stream().filter(user -> user.getNo() == userNo)
                        .collect(Collectors.toList()).get(0);

        // id, pwd, name 수정하기
        foundUser.setId(modifyInfo.getId());
        foundUser.setPwd(modifyInfo.getPwd());
        foundUser.setName(modifyInfo.getName());

        return ResponseEntity.created(URI.create("/swagger/users/" + userNo)).build();
    }

    /* comment.
    *   @ApiResponses
    *    응답에 따라 상태코드와 상태에 대한 설명을 추가할 수 있다.
    * */
    @Operation(summary = "회원 정보 삭제")
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "회원 정보 삭제 성공!"),
            @ApiResponse(responseCode = "400", description = "잘못된 파라미터")
    })
    @DeleteMapping("/users/{userNo}")
    public ResponseEntity<?> removeUser(@PathVariable int userNo) {

        // userNo 1명 특정
        UserDTO foundUser =
                users.stream().filter(user -> user.getNo() == userNo)
                        .collect(Collectors.toList()).get(0);

        // 특정한 유저 객체 배열에서 삭제
        users.remove(foundUser);

        // 자원 삭제 관련 noContent
        return ResponseEntity.noContent().build();
    }

}
