package example;

// import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alexa_000 on 18/09/2015.
 */
public class UrlParserTest {

    @Test
    public void test_basic_http_protocol(){
        UrlParser p = new UrlParser("http://www.essex.ac.uk");
    }
}