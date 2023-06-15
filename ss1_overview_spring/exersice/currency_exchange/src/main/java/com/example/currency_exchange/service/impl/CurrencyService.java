package com.example.currency_exchange.service.impl;

import com.example.currency_exchange.service.ICurrencyService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService implements ICurrencyService {


    @Override
    public double vnd(double usd) {
        return usd * 23000;
    }
}
