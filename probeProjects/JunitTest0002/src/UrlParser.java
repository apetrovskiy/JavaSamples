/**
 * Created by alexa_000 on 18/09/2015.
 */
public class UrlParser {
    private String protocol;
    private String site;
    private String pathname;

    public UrlParser(String url) {
        String[] protocol_site = url.split("://");
        protocol = protocol_site[0];
        String[] site_pathname = protocol_site[1].split("/",2);
        site = site_pathname[0];
        if (site_pathname.length>1)
            pathname = site_pathname[1];
        else
            pathname = "";
    }

    public int dummy() {
        return 1;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getSite() {
        return site;
    }

    public String getPathname() {
        return pathname;
    }
}
