package com.mytest;
import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        get("/hello", (req, res) -> "Hello World");
    }
}
