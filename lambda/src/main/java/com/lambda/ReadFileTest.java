package com.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
    @FunctionalInterface
    public interface readFileProcess{
         String process(BufferedReader br) throws IOException;
    }
    private static String  readFile(readFileProcess file) throws IOException {
            try(BufferedReader br=new BufferedReader(new FileReader("test.txt"))){
                    return file.process(br);
            }
    }

    public static void main(String[] args) throws IOException {
        String oneLine = readFile((BufferedReader::readLine));
        System.out.println(oneLine);
    }
}
