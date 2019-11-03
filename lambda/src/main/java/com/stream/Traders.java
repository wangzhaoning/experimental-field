package com.stream;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Traders {
    private  String id;
    private String name;
    private int age;
    private String university;
    private String city;

}
