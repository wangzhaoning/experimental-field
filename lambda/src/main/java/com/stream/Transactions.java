package com.stream;

import lombok.Data;

import java.util.Date;

/**
 * It's handwritten. of course, you can use annotation '@Builder'
 */
@Data
public class Transactions {
    private final String id;
    private int quota;
    private String time;
    private Traders traders;

private Transactions(Builder builder){
    this.id=builder.id;
    this.quota=builder.quora;
    this.time=builder.time;
    this.traders=builder.traders;
}

    public static class Builder{
        private final String id;
        private String time;
        private int quora;
        private Traders traders;

        public Builder(String id){
            this.id=id;
        }
        public Builder time(String val){
            this.time=val;
            return this;
        }
        public Builder quora(int val){
            this.quora=val;
            return this;
        }

        public Builder traders(Traders val){
            this.traders=val;
            return this;
        }
        public Transactions build(){
            return new Transactions(this);
        }
    }


}
