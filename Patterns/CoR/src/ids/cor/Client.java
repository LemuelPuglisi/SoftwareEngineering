package ids.cor;

public class Client {

    public static void main(String[] args) {

        Request req     = new Request();
        req.email       = "test1@example.com";
        req.password    = "secret";
        req.ip          = "151.22.1.43";
        req.role        = "admin";
        req.order       = "hamburger";

        App.serve(req);
    }

}
