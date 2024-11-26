package com.ohgiraffers.sessionsecurity.user.model.service;

import com.ohgiraffers.sessionsecurity.user.model.dao.UserMapper;
import com.ohgiraffers.sessionsecurity.user.model.dto.LoginUserDTO;
import com.ohgiraffers.sessionsecurity.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int regist(SignupDTO signupDTO) {

        /* 필기.
        *   Service 계층은 본격적으로 DB에 값을 넣기 위한 데이터를 가공하는 계층이다.
        *   현재 signupDTO 에 userPass 필드는 아직 비밀번호가 암호화 되어있지 않다.
        *   따라서 DB 에 insert 하기 전 비밀번호를 암호화할 것이다.
        * */

        signupDTO.setUserPass(encoder.encode(signupDTO.getUserPass()));

        int result = userMapper.regist(signupDTO);

        return result;

    }

    public LoginUserDTO findByUsername(String username) {

        LoginUserDTO login = userMapper.findByUsername(username);

        if (login == null) {
            return null;
        } else {
            return login;
        }

    }
}
