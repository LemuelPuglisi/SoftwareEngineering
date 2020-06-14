package ids.cor;

public class App {

    private static Handler bootstrapHandler = new AuthenticationHandler();

    public static void serve(Request request) {
        Response response = bootstrapHandler.handle(request);
        System.out.println(response.message);
    }

}
