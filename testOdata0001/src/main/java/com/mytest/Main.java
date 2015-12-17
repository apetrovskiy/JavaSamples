package com.mytest;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final String url = "http://192.168.129.173/ReportServer?%2FNetwrix%20Auditor%2FNetwrix%20Auditor%20for%20File%20Servers%2FChange%20Reports%2FAll%20File%20Server%20Activity&amp;Managed_Object=coll0001&amp;Interval=0&amp;Date_From=12%2F14%2F2015%2000%3A00%3A01&amp;Date_To=12%2F15%2F2015%2023%3A59%3A59&amp;ReportName=All%20File%20Server%20Activity&amp;ProductName=Netwrix%20Auditor&amp;ReportDescription=Shows%20activity%20(changes%2C%20failed%20modifications%2C%20reads%20and%20failed%20read%20attempts)%20on%20all%20audited%20file%20servers.&amp;Who_Changed=%25&amp;Who_Ex_Changed_Param=&amp;What_Changed=%25&amp;Where_Changed=%25&amp;Object_Type=%25&amp;HideRunningValues=True&amp;Action_Type=CHANGES&amp;Action_Type=FAILED%20ATTEMPTS&amp;Action_Type=READS&amp;Sort_By=When&amp;rs%3AParameterLanguage=&amp;rs%3ACommand=Render&amp;rs%3AFormat=ATOM&amp;rc%3AItemPath=MainTable";
        Client client = new Client(url);
        client.Connect();
        client.LoadSchemata();
    }
}
