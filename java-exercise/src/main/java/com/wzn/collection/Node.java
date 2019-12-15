package com.wzn.collection;

import lombok.Data;

@Data
public class Node {
    private Node head;
    private Node end;
    private Integer val;

//    @Override
//    public String toString() {
//        if (val != null) {
//            return val.toString() + ", ";
//        }
//        return " ";
//    }
}
