package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Divider implements Operation{
    @Override
    public double getResult(double a, double b) {
        if (b!=0) return a / b;
        else return 0;
    }
}
