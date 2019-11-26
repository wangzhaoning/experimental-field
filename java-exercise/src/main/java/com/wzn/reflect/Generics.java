package com.wzn.reflect;

import lombok.Data;

//@Data
public class Generics<A, T> {
    A column;
    T row;

    public static void main(String[] args) {
        Generics<String, Integer> coordinate = new Generics<>();
        coordinate.setColumn("1");
        System.out.println(coordinate);
    }

    public void setColumn(A column) {
        this.column = column;
    }

    public void setRow(T row) {
        this.row = row;
    }

    public A getColumn() {
        return column;
    }

    public T getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "column = " + column + ", row = " + row;
    }
}

class Main {
    public static void main(String[] args) {
        Generics<String, Integer> coordinate = new Generics<>();
        coordinate.setColumn("1");
        System.out.println(coordinate);
    }
}
