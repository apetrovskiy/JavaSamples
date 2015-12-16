package com.mytest;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RestApiLoader loader = new RestApiLoader("http://192.168.129.173/netwrix/api/v1/activity_records/enum");
        loader.Load();
    }
}
