package cn.hehe.cloud.server.test.controller;

import cn.hehe.cloud.server.test.service.ISystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author hyp
 * @title: TestController
 * @projectName hyp-cloud
 * @description: 测试前端控制器
 * @date 2022/6/18 9:31
 */
@RestController
public class TestController {

    @Autowired
    private ISystemService systemService;

    @GetMapping("hello")
    public String hello(String name){
        return this.systemService.hello(name);
    }

    @GetMapping("test1")
    @PreAuthorize("hasAnyAuthority('user:add')")
    public String test1(){
        return "拥有'user:add'权限";
    }

    @GetMapping("test2")
    @PreAuthorize("hasAnyAuthority('user:update')")
    public String test2(){
        return "拥有'user:update'权限";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }
}
