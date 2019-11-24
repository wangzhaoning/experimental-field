package com.wzn.realtime.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserCmd {

    private static final String path = "C:\\Users\\wangzhaoning\\Desktop\\qxypellet\\lib";

    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> files = getFiles(path);
        System.out.println(files);
        List<List<String>> newNamesResult = processBuilderCommand(files);
        useMvnCommand(newNamesResult.get(0), newNamesResult.get(1));
        printDep(newNamesResult.get(1));
    }

    private static void printDep(List<String> newNames) {
        for (String newName : newNames) {

            System.out.println(" <dependency>  \n" +
                    "      <groupId>" + newName + "</groupId>  \n" +
                    "      <artifactId>" + newName + "</artifactId>  \n" +
                    "      <version>1.0</version>  \n" +
                    "    </dependency>  ");
        }
    }

    private static void useMvnCommand(List<String> newNames, List<String> newNamesPro) throws IOException, InterruptedException {
        for (int i = 0; i < newNames.size(); i++) {
        List<String> commands = new ArrayList<>();
            commands.add("cmd.exe");
            commands.add("/c");
            System.out.println("mvn install:install-file -Dfile=" + newNames.get(i) + " -DgroupId=" + newNamesPro.get(i) +
                    " -DartifactId=" + newNamesPro.get(i) + " -Dversion=1.0 -Dpackaging=jar");
            commands.add("mvn install:install-file -Dfile=" + newNames.get(i) + " -DgroupId=" + newNamesPro.get(i) +
                    " -DartifactId=" + newNamesPro.get(i) + " -Dversion=1.0 -Dpackaging=jar");
            ProcessBuilder pb = new ProcessBuilder(commands);
            pb.directory(new File(path));
            Process process = pb.start();
            int status = process.waitFor();
            InputStream in = process.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
//            Thread.sleep(10000);
        }
    }


    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                String fileName = tempList[i].getName();
                files.add(fileName);
            }
        }
        return files;
    }


    private static List<List<String>> processBuilderCommand(List<String> files) throws IOException, InterruptedException {
        List<String> newNames = new ArrayList<>();
        List<String> newNamesPro = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        for (String file : files) {
            List<String> commands = new ArrayList<>();
            commands.add("cmd.exe");
            commands.add("/c");
            String[] fileName = file.split("-");
            String newFileName;
            if (fileName.length > 2) {
                newFileName = fileName[0].trim() + "-" + fileName[1].trim() + "-1.0.jar";
                newNamesPro.add(fileName[0] + "-" + fileName[1]);
            } else {
                newFileName = fileName[0] + "-1.0.jar";
                newNamesPro.add(fileName[0]);
            }
            System.out.println("newFileName >" + newFileName);
            commands.add("rename " + "\"" + file + "\"" + " " + newFileName);
            newNames.add(newFileName);
            ProcessBuilder pb = new ProcessBuilder(commands);
            pb.directory(new File(path));
            Process process = pb.start();
            int status = process.waitFor();
            InputStream in = process.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        result.add(newNames);
        result.add(newNamesPro);
        return result;
    }
}
