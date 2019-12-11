package com.wzn.reflect;


import java.lang.reflect.Method;

public class ReflectGetMethod {

    public static void main(String[] args) throws Exception {
        BeanOfStudent stu = new BeanOfStudent();
//        stu.setAge(1);
//        stu.setName("lin");

        //1.无参
        Method method = stu.getClass().getMethod("getName");
        String name = (String) method.invoke(stu);
        System.out.println("name = "+name);
        //2.一参
        Method method2 = stu.getClass().getMethod("setName",Class.forName("java.lang.String"));
        method2.invoke(stu, "meng");

        //3.多参
        Method method3 = stu.getClass().getMethod("method1",int.class,Class.forName("java.lang.String"));//后两个参数获得的都是class对象
        method3.invoke(stu,15, "zhang");
    }
}
