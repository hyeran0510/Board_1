package com.example.Board_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {

    @GetMapping("/1")
    @ResponseBody
    public String Main() {

        return "야호 시작";

    }
}