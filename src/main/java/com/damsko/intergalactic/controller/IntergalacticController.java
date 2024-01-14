package com.damsko.intergalactic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntergalacticController {

    @GetMapping
    public String intergalactic(){
        return "intergalactic";
    }
}
