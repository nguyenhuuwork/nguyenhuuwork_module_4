package com.example.chuyen_doi_tien_te.service.impl;

import com.example.chuyen_doi_tien_te.service.ICurrencyService;

public class CurrencyService implements ICurrencyService {
    @Override
    public double vnd(double usd) {
        return usd * 23000;
    }
}
