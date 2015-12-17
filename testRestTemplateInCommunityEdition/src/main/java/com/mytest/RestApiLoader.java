package com.mytest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

/**
 * Created by alexa_000 on 09/12/2015.
 */
public class RestApiLoader {
    RestTemplate restTemplate;
    public RestApiLoader(String basePath) {
        restTemplate = new RestTemplate(new ClientHttpRequestFactory() {
            public ClientHttpRequest createRequest(URI uri, HttpMethod httpMethod) throws IOException {
                return null;
            }
            /*
            public ClientHttpRequest createRequest(URI uri, HttpMethod httpMethod) throws IOException {
                ClientHttpRequest request = new ClientHttpRequest() {
                    public ClientHttpResponse execute() throws IOException {
                        return null;
                    }

                    public OutputStream getBody() throws IOException {
                        return null;
                    }

                    public HttpMethod getMethod() {
                        return null;
                    }

                    public URI getURI() {
                        return null;
                    }

                    public HttpHeaders getHeaders() {
                        return null;
                    }
                };
            }
            */
        });
    }

    public void Load() {

    }
}
