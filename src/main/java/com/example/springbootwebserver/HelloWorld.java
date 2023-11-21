package com.example.springbootwebserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是 HelloWorld 类的描述。
 */
@RestController
public class HelloWorld {
    /*
    静态文件只要放在 static 下面就可以依照路径寻找到
    比如: http://localhost:8080/ 和 http://localhost:8080/index.html(两个路径访问的是同一个资源)
    比如: http://localhost:8080/website/index.html
     */
    /**
     * 返回 "Hello, World!" 字符串的方法。
     */
    @GetMapping("/hello1")
    public String helloWorld1() {
        return "hello world----@Controller----@GetMapping(\"/hello1\")";
    }
    /**
     * 返回 "Hello, World!" 字符串的方法。
     */
    @GetMapping("/hello2")
    public String helloWorld2() {
        return "hello world----@Controller----@GetMapping(\"/hello2\")";
    }

    /**
     * 返回 "Hello, World!" 字符串的方法。
     */
    @GetMapping("/hello3")
    public String helloWorld3() {
        return "hello world----@Controller----@GetMapping(\"/hello3\")";
    }

}
