package com.wcy.service;

public class OffLineDiscountService {
    private int discount=8;
    public double compute(Integer price){
        return price*discount/10;
    }

}
