package com.example.simple_dictionary.service.impl;

import com.example.simple_dictionary.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Override
    public String convert(String english) {
        String vietsub = "";
        switch (english) {
            case "Lemon":
                vietsub = "Chanh";
                break;
            case "Apple":
                vietsub = "Táo";
                break;
            case "Mango":
                vietsub = "Xoài";
                break;
            default:
                vietsub = "Chưa cập nhật";
                break;
        }
        return vietsub;
    }
}
