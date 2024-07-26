package com.atguigu.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 17:33
 * @description:
 */
@Aspect
@Component
public class OneAspect {
    @Before("execution(* *(..))")
    public void logBeforeServiceMethods() {
        System.out.println("前置通知执行...");
    }
}
