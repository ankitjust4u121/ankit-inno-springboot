package com.ankit.InnoDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InnoController {
    @GetMapping("/inno")
    public String innoMind() {
        return "Demon is necessary for us.";
    }
}
