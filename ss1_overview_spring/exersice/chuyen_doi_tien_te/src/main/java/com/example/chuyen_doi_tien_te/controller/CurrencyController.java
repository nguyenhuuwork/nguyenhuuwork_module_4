package com.example.chuyen_doi_tien_te.controller;


import com.example.chuyen_doi_tien_te.service.impl.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @GetMapping("")
    public String show() {
        return "list";
    }

    @PostMapping("currency")
    public String exchange(@RequestParam double usd, Model model) {
        model.addAttribute("vnd", currencyService.vnd(usd));
        return "list";
    }
}
