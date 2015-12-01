import java.io.IOException;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        get("/hello", (req, res) -> "Hello World!");
        // awaitInitialization();
        // System.in.read();
    }
}
