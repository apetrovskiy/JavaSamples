import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by alexa_000 on 18/09/2015.
 */
public class UrlParserTest {

    @Test
    public void test_basic_http_protocol() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk");
        assertTrue(p.getProtocol().equals("http"));
    }

    @Test
    public void test_basic_ftp_protocol() {
        UrlParser p = new UrlParser("ftp://ftp.essex.ac.uk");
        assertTrue(p.getProtocol().equals("ftp"));
    }

    @Test
    public void test_basic_generic_protocol() {
        UrlParser p = new UrlParser("xyz://www.abc.com");
        assertTrue(p.getProtocol().equals("xyz"));
    }

    @Test
    public void test_simple_site() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk");
        assertTrue(p.getSite().equals("www.essex.ac.uk"));
    }

    @Test
    public void test_simple_site_with_pathname() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk/index.html");
        assertTrue(p.getSite().equals("www.essex.ac.uk"));
    }

    @Test
    public void test_simple_site_with_slash() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk/");
        assertTrue(p.getSite().equals("www.essex.ac.uk"));
    }

    @Test
    public void test_simple_pathname() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk/csee");
        assertTrue(p.getPathname().equals("csee"));
    }

    @Test
    public void test_complex_pathname() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk/csee/staff/rpoli.html");
        assertArrayEquals("csee/staff/rpoli.html".getBytes(), p.getPathname().getBytes());
    }

    @Test
    public void test_simple_empty_pathname() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk");
        assertTrue(p.getPathname().equals(""));
    }

    @Test
    public void test_simple_single_slash_pathname() {
        UrlParser p = new UrlParser("http://www.essex.ac.uk/");
        assertTrue(p.getPathname().equals(""));
    }
}