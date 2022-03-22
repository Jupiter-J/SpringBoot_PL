package com.example.board3_basic.community.controller;


import com.example.board3_basic.infra.AuthenticationFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {
    private final AuthenticationFacade authFacede;
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    public HomeController(
            @Autowired AuthenticationFacade authFacede) {
        this.authFacede = authFacede;
    }


    //누가 접속을 했는지 확인
    @GetMapping
    public String home(){
        try {
            /*    (1) principal : 접속한 사용자의 정보를 담게 한다
              logger.info("connected user: {}", principal.getName());
                  (2) authentication : 여러가지 로그인 방법에 따라서도 적용 가능
              logger.info("connected user: {}", authentication.getName());
                  (3) SecurityContextHolder.getContext() : component, service등 어노테이션이 많을때
                   SecurityContextHolder.getContext().getAuthentication().getName());
            */
            logger.info("connected user: {}",
                    authFacede.getUserName());
            logger.info(authFacede.getAuthentication().getClass().toString());
        }catch (NullPointerException e){
            logger.info("no user logged in");
        }
        return "index";
    }



}
