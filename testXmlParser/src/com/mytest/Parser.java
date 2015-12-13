package com.mytest;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by alexa_000 on 07/12/2015.
 */
public class Parser {
    String path;
    DocumentBuilder builder;
    Document document;
    Element root;

    public Parser(String path) throws ParserConfigurationException {
        this.path = path;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
    }

    public void Parse() throws IOException, SAXException {
        loadDocument();
        root = document.getDocumentElement();
        // System.out.println(root);
        listSections();
    }

    void loadDocument() throws IOException, SAXException {
        File xmlFile = new File(path);
        document = builder.parse(xmlFile);
    }

    private void listSections() {
        NodeList children = root.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node child = children.item(i);
            if (child instanceof Element) {
                System.out.println(child);
            }
        }
    }
}
