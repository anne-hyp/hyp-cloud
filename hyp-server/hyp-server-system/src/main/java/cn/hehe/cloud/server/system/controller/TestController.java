package cn.hehe.cloud.server.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author hyp
 * @title: TestController
 * @projectName hyp-cloud
 * @description: 测试前端控制器
 * @date 2022/6/17 18:53
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(String name) {
        return "hello" + name;
    }

    @GetMapping("info")
    public String test(){
        return "hyp-server-system";
    }

//    @GetMapping("user")
//    public Principal currentUser(Principal principal) {
//        return principal;
//    }
}
