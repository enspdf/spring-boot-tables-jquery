package me.shackox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by SHACKOX on 20/12/16.
 */

@Controller
public class EmployeeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String goHome() {
        return "index";
    }
}
