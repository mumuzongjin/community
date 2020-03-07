package com.practice.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: Victor
 * @Date: 2020/3/3 20:59
 */
@Controller
public class TeacherController {

    @RequestMapping(path = "/school", method = RequestMethod.GET)
    public String getSchool(Model model) {
        model.addAttribute("name", "school");
        model.addAttribute("age", 80);
        return "demo/view";
    }
}
