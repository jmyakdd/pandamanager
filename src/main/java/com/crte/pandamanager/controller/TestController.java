package com.crte.pandamanager.controller;

import com.crte.pandamanager.bean.User;
import com.crte.pandamanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(Model model) {
        List<User> users = userService.getUserList();
        model.addAttribute("user", "jmy");
        model.addAttribute("pass", "123456");
        model.addAttribute("users",users);
        return "test";
    }
}
