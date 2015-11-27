package com.mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
        FileInputStream fin = new FileInputStream("E:/HW/20151120/IMG_20151120_150536.jpg");
        /*
        while (fin.available()) {
            fin.read();
        }
        */
        // fin.close();

        File f1 = new File("/");
        File f2 = new File("/", "autoexec.bat" ) ;
        File fЗ = new File(f1, "autoexec.bat") ;
    }
}
