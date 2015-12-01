import org.springframework.web.client.RestTemplate;

/**
 * Created by alexa_000 on 18/09/2015.
 */
public class RestRequestCreator {
    public RestTemplate GetRestTemplate() {
        return new RestTemplate();
    }
}
