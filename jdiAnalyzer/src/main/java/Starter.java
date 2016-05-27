import com.test.mytest.Analyzer;

/**
 * Created by Alexander_Petrovskiy on 5/26/2016.
 */
public class Starter {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();

        // analyzer.setUseWebElementAsSourceForJdiElement(true);
        analyzer.setUseWebElementAsSourceForJdiElement(false);

        // Class type = analyzer.GetElementType("http://cnn.com", "//ul[*[@data-analytics='News and buzz_list-hierarchical-xs_']]/article");
        // Class type = analyzer.GetElementType("http://edition.cnn.com", "//ul[*[@data-analytics='Top stories_list-hierarchical-xs_']]/article//*[@class='cd__headline-text']");
        // Class type = analyzer.GetElementType("http://edition.cnn.com", "//*[@class=\"cd__headline-text\"]");
        // Class type = analyzer.GetElementType("http://localhost/1/index.htm", "//a[@href=\"index.htm\"]");
        // Class type = analyzer.GetElementType("http://localhost/1/index.htm", "//*[@class=\"dropdown-toggle\"][@href=\"#\"]");
        // String xpath = "//*[@class=\"icon-search\"]";
        // String xpath = "//h3";
        // "http://localhost/1/index.htm"
        // String urlPath = "http://google.com";
        // String xpath = "//input[@id=\"q\"]";
        // String xpath = "//input[@id='lst-ib']";
        // String urlPath = "about:blank";
        // String xpath = "//input[@id=\"q\"]";
        // String urlPath = "chrome://version/";
        // String xpath = "//*[@id=\"company\"]";
        String urlPath = "http://yandex.ru";
        String xpath = "//*[1][@type='submit'][@role='button']";
        Class type = analyzer.GetElementType(urlPath, xpath);
        System.out.println(type.getName());
    }
}
