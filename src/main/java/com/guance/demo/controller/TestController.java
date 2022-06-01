package com.guance.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyj
 * @since 2022/5/31 8:41
 */
@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/ping")
    public String getPing(){
        logger.info("调用ping");
        return "pong";
    }

    @GetMapping("errorTest")
    public String getError(){
        logger.info("调用 error");
        int i = 0;
        int j = 10 / i;
        return "error Test";
    }
}
