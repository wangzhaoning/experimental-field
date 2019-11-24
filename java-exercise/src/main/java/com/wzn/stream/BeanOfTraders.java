package com.wzn.stream;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BeanOfTraders {
    private  String id;
    private String name;
    private int age;
    private String university;
    private String city;

}
