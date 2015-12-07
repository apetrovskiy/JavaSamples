package com.mytest;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
	// write your code here
        Parser parser = new Parser("C:/Projects/NW/NMC/NwxDataMining/NwxCommonConfiguration/bin/Release/CommonSettings.xml");
        parser.Parse();
    }
}
