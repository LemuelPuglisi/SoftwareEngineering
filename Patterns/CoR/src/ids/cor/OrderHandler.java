package ids.cor;

import java.util.ArrayList;
import java.util.List;

public class OrderHandler implements Handler {

    Handler successor = null;

    List<Request> acceptedRequest = new ArrayList<>();

    @Override
    public Response handle(Request request) {
        acceptedRequest.add(request);
        return new Response("Request accepted.");
    }
}
