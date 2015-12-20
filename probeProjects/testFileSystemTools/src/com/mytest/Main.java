package com.mytest;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        // FileInputStream fin = new FileInputStream("/C:/Program Files/Far Manager/ServiceControl.cs");
        // FileInputStream fin = new FileInputStream("/D:/Manuals/EWS1054SDU/245680umRU.pdf");
        // FileInputStream fin = new FileInputStream("D:/Manuals/EWS1054SDU/245680umRU.pdf");
        // FileInputStream fin = new FileInputStream("/D/Manuals/EWS1054SDU/245680umRU.pdf");
        // FileInputStream fin = new FileInputStream("E:\\HW\\20151120\\IMG_20151120_150536.jpg");
        Path path = FileSystems.getDefault().getPath("E:/HW/20151120/IMG_20151120_150536.jpg");
        try (InputStream fin = new FileInputStream("E:/HW/20151120/IMG_20151120_150536.jpg");) {
            int whatHaveBeenRead = fin.read();
            System.out.println("have been read at first: " + whatHaveBeenRead);
            System.out.println("available: " + fin.available());

            int bytes;
            while ((bytes = fin.read()) != -1) System.out.println("reading further ... " + fin.available());

            fin.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        File f1 = new File("/");
        File f2 = new File("/", "autoexec.bat" ) ;
        File fЗ = new File(f1, "autoexec.bat") ;
    }
}
