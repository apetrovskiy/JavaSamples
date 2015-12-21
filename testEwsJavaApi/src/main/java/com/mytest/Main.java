package com.mytest;

import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.enumeration.misc.ExchangeVersion;
import microsoft.exchange.webservices.data.credential.ExchangeCredentials;
import microsoft.exchange.webservices.data.credential.WebCredentials;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        ExchangeService service = new ExchangeService(ExchangeVersion.Exchange2010_SP2);
        ExchangeCredentials credentials = new WebCredentials("report_reader@SPALab.at.local", "Lock12Lock");
        // ExchangeCredentials credentials = new WebCredentials("report_reader@RoboticLab.at.local", "Lock12Lock");
        service.setCredentials(credentials);
        service.setUrl(new URI("https://192.168.129.3/EWS/Exchange.asmx"));
        // service.autodiscoverUrl("report_reader@SPALab.at.local");
        String s = service.getUrl().toString();
        System.out.println(s);
    }
}
