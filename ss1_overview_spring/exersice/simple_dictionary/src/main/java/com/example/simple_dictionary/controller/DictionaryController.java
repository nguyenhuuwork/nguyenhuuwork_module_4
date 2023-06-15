package com.example.simple_dictionary.controller;

import com.example.simple_dictionary.service.impl.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("")
    public String show() {
        return "list";
    }

    @PostMapping("/convert")
    public String convert(@RequestParam String english, Model model) {
        model.addAttribute("english", dictionaryService.convert(english));
        return "list";
    }
}
