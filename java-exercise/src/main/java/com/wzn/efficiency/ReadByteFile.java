package com.wzn.efficiency;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReadByteFile {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\fileTest.txt");
        List lines = FileUtils.readLines(f, "GBK");
        System.out.println(lines);
    }

}
