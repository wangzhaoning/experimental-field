package com.concurrency;

import java.util.Scanner;

public class Lader
{
    private static double above;
    private static double bottom;
    private static double height;
    private static double s = 0;

    public Lader(){
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("请输出梯形的上底");
        above=in.nextInt();
        System.out.print("请输出梯形的下底");
        bottom=in.nextInt();
        System.out.print("请输出梯形的高");
        height=in.nextInt();
        Area();
    }
    private static void Area()
    {
        s=(above+bottom)*height/2;
        System.out.println(s);
    }
}