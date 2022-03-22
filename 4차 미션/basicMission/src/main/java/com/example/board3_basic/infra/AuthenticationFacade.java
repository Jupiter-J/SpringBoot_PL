package com.example.board3_basic.infra;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacade {
    public Authentication getAuthentication() {
        //홈컨트롤러에서 정의하고 사용
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public String getUserName(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
