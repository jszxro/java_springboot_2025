package com.jsz.spring03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 이제부터 SpringBoot에서 컨트롤러로 동작할 거라고 지칭해주는 주석(어노테이션)
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello") // 웹 서비스에서 사용할 길(/hello)을 하나 만듦
    @ResponseBody
    public String helloSpring() {
        logger.info("hello URL 오픈"); 
        // 문제 발생 시 로그
        logger.debug("디버그 시 필요한 로그입니다.");
        logger.trace("디버그 시 필요한 로그입니다.");

        logger.warn("경고 표시시 나타내는 로그입니다.");
        logger.error("오류 표시시 나타내는 로그입니다.");
        
        return "Hello SpringBoot";
    }

}
