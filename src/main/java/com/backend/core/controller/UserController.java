package com.backend.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sok Lina
 * Date     : 2/1/2021, 5:10 PM
 * Email    : lina.sok@prasac.com.kh
 */
@RestController
public class UserController {

    @GetMapping("hello/")
    public String getString(){
        return "hello";
    }
}
