package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/14 0:22
 * @description:
 */
@Slf4j
@RestController
public class HelloController {
//    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String toHello(String a,Integer b) {
//        logger.info("访问到了");

            log.trace("trance日志...");
            log.debug("调试日志");
            log.info("info日志...");
            log.warn("警告日志...");
            log.error("错误日志...");
            log.info("信息a:"+a+",信息b:"+b);

        return "你好啊";
    }
}
