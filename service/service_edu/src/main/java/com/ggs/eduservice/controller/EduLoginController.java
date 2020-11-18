package com.ggs.eduservice.controller;

import com.ggs.commonutils.R;
import org.springframework.web.bind.annotation.*;

/**
 *  @Author Starbug
 *  @Date 2020/11/18 20:30
 */
@RestController
@CrossOrigin
@RequestMapping("/eduservice/user")
public class EduLoginController {

    //login
    @PostMapping("login")
    public R login() {
        return R.ok().data("token", "admin");
    }


    //info
    @GetMapping("info")
    public R info() {
        return R.ok().data("roles",new String[]{"admin"})
                .data("name","admin")
                .data("avatar","https://cn.vuejs.org/images/logo.png");
    }

}
