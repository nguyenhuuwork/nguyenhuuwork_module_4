package com.example.currency_exchange.controller;

import com.example.currency_exchange.service.impl.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("")
    public String show() {
        return "list";
    }

    @PostMapping("/currency")
    public String exchange(@RequestParam double usd, Model model) {
        model.addAttribute("vnd", currencyService.vnd(usd)) ;
        return "list";
    }
}
