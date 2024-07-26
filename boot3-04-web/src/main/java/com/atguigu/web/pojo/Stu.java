package com.atguigu.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/15 13:36
 * @description:
 */
//@Component("xue")
//@Controller("xue")
//@Service("xue")
@Repository
//普通javabean给值，上面这4个注解都可以。但是适配服务端渲染只能用@Controller @RestController
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    @Value("小哥哥")
    private String name;
    @Value("21")
    private Integer age;
}
