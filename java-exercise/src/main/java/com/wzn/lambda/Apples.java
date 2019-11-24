package com.wzn.lambda;

import lombok.Data;

@Data
public class Apples {
    Integer weight;
    String color;
    public Apples(Integer weight, String color){
        this.color=color;
        this.weight=weight;
    }
}
