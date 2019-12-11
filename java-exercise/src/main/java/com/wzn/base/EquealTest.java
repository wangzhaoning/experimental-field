package com.wzn.base;

import com.wzn.reflect.BeanOfStudent;

import java.awt.*;
import java.util.*;

public class EquealTest {

    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>();
        map.put(1L,"test");
        Set<Long> set = map.keySet();
        System.out.println(new ArrayList<>(Collections.singletonList("1")).equals(set));

        try{
            String str = null;
            assert str != null;
            str.toString();
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
