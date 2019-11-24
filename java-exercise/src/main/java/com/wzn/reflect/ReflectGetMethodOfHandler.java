package com.wzn.reflect;

import com.wzn.reflect.CreateHandler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectGetMethodOfHandler {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CreateHandler handler = new CreateHandler();
        Method method = handler.getClass().getMethod("getTest");
        method.invoke(handler);

//        Method method = stu.getClass().getMethod("getName");
//        String name = (String) method.invoke(stu);
    }
}
