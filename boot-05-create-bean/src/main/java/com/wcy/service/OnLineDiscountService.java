package com.wcy.service;

public class OnLineDiscountService {
    private int discount=6;
    public double compute(Integer price){
        return price*discount/10;
    }

}
