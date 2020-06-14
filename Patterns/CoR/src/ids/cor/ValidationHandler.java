package ids.cor;

import java.util.List;

public class ValidationHandler implements Handler {

    Handler successor = new OrderHandler();

    List<String> orders = List.of("hamburger", "coke");

    @Override
    public Response handle(Request request) {
        return orders.contains(request.order)
                ? successor.handle(request)
                : new Response("invalid order");
    }

}
