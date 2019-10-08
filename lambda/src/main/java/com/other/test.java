package com.other;

public class test {
    public static void main(String[] args) {
            int i=0;
        try{
            try{
                i=1;
                throw  new Exception();
            }catch(Exception e){
            }
        }catch (Exception e){
            System.out.println("error");
        }
        System.out.println("i >"+i);
    }
}
