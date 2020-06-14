package ids.cor;

import java.util.Map;

public class AuthorizationHandler implements Handler{

    Handler successor = new ThrottleHandler();

    /**
     * Registered users map, where the key
     * represents the email and the value
     * is the user password.
     */
    Map usersRoles = Map.of(
            "test1@example.com", "admin",
            "test2@example.com", "user"
    );

    @Override
    public Response handle(Request request) {
        return checkUserPermissions(request.email, request.role)
                ? successor.handle(request)
                : new Response("authorization failed");
    }

    public boolean checkUserPermissions(String email, String role) {
        return usersRoles.containsKey(email) && usersRoles.get(email) == role;
    }

}
