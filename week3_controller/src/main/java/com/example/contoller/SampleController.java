package com.example.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {
    //ioc 컨테인너를 통해서 bean의 관리를 받는다
    private static final Logger logger
            = LoggerFactory.getLogger(SampleController.class);

    @GetMapping(
            value = "/hello" //path
    )
    public String hello(@RequestParam(name = "id", required = false, defaultValue = "") String id) {
        logger.info("Path:Hello");
        logger.info("Query Param id: " + id);
        return "hello.html";
    }

    @GetMapping("hello/{id}")
    //pathvariable 값
    public String helloPath(@PathVariable("id") String id) {
        logger.info("Path Variable is: " + id);
        return "/hello.html";
    }


    //바디로 값을 받는 방법 ResponseBody
    @GetMapping("/get-profile")
    public @ResponseBody
    SamplePayload getProfile() {
        return new SamplePayload("nana", 25, "develover");
    }


}
