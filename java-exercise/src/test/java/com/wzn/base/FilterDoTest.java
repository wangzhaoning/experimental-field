package com.wzn.base;

import org.junit.Assert;
import org.junit.Test;

import java.math.RoundingMode;
import java.text.NumberFormat;


public class FilterDoTest {
    @Test
    public void test(){
        FilterDo filterDo = new FilterDo();
        Assert.assertEquals(filterDo.add(),2);
    }

    @Test
    public void test_node(){
        int ram = 16;
        int shard = 8;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.UP);
        System.out.println(nf.format((double) ram /shard));
    }


}