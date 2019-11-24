package com.wzn.stream;

import lombok.Data;

/**
 * It's handwritten. of course, you can use annotation '@Builder'
 */
@Data
public class BeanOfTransactions {
    private final String id;
    private int quota;
    private String time;
    private BeanOfTraders traders;

private BeanOfTransactions(Builder builder){
    this.id=builder.id;
    this.quota=builder.quora;
    this.time=builder.time;
    this.traders=builder.traders;
}

    public static class Builder{
        private final String id;
        private String time;
        private int quora;
        private BeanOfTraders traders;

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

        public Builder traders(BeanOfTraders val){
            this.traders=val;
            return this;
        }
        public BeanOfTransactions build(){
            return new BeanOfTransactions(this);
        }
    }


}
