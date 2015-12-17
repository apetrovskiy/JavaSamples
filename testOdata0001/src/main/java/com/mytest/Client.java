package com.mytest;

import org.apache.olingo.client.api.communication.request.retrieve.ODataEntityRequest;
import org.apache.olingo.client.api.communication.request.retrieve.ODataEntitySetIteratorRequest;
import org.apache.olingo.client.api.communication.request.retrieve.ODataEntitySetRequest;
import org.apache.olingo.client.api.communication.request.retrieve.ODataServiceDocumentRequest;
import org.apache.olingo.client.api.communication.response.ODataRetrieveResponse;
import org.apache.olingo.client.api.domain.ClientServiceDocument;
import org.apache.olingo.client.core.ODataClientFactory;
import org.apache.olingo.client.api.*;
import org.apache.olingo.client.core.communication.request.retrieve.ODataEntitySetRequestImpl;

import java.net.URI;
// import org.apache.olingo.client.core.serialization.*;

/**
 * Created by alexa_000 on 15/12/2015.
 */
public class Client {
    String _url;
    ODataClient _client;
    public Client(String url) {
        _url = url;
    }

    public boolean Connect() {
        _client = ODataClientFactory.getClient();
        return true;
    }

    public boolean LoadSchemata() {
        // String serviceRoot = "http://services.odata.org/V4/Northwind/Northwind.svc";
        String serviceRoot = _url;
                ODataServiceDocumentRequest req =
                _client.getRetrieveRequestFactory().getServiceDocumentRequest(serviceRoot);
        // ODataRetrieveResponse<ClientServiceDocument> res = req.execute();

        /*
String serviceRoot = "http://services.odata.org/V4/Northwind/Northwind.svc";
URI customersUri = client.newURIBuilder(serviceRoot)
                 .appendEntitySetSegment("Customers").build();

ODataRetrieveResponse<ODataEntitySetIterator<ODataEntitySet, ODataEntity>> response
     = client.getRetrieveRequestFactory().getEntitySetIteratorRequest(customersUri).execute();
        */
        ODataRetrieveResponse<ODataEntitySetIteratorRequest<ODataEntitySetRequestImpl, ODataEntityRequest>> response
                = _client.getRetrieveRequestFactory().getEntitySetIteratorRequest(URI.create(_url)).execute();

        return  true;
    }
}
