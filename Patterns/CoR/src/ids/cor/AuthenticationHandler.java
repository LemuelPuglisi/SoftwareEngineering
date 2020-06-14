package ids.cor;

import java.util.Map;

public class AuthenticationHandler implements Handler {

    /**
     * CoR successor
     */
    Handler successor = new AuthorizationHandler();

    /**
     * Registered users map, where the key
     * represents the email and the value
     * is the user password.
     */
    Map users = Map.of(
            "test1@example.com", "secret",
            "test2@example.com", "secret"
    );
    @Override
    public Response handle(Request request) {
        return attemptAuthentication(request.email, request.password)
                ? successor.handle(request)
                : new Response("authentication failed");
    }

    private boolean attemptAuthentication (String email, String password) {
        return users.containsKey(email) && users.get(email) == password;
    }

}
