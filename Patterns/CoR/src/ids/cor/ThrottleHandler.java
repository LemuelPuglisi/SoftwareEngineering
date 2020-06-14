package ids.cor;

import java.util.HashMap;
import java.util.Map;

public class ThrottleHandler implements Handler{

    Handler successor = new ValidationHandler();

    /** maximum number of requests accepted by an ip */
    private int throttleLimit = 10;

    Map<String, Integer> throttleTable = new HashMap();

    @Override
    public Response handle(Request request) {
        if (!throttleLimitReached(request.ip)) {
            increaseRequestRate(request.ip);
            return successor.handle(request);
        }
        else return new Response("throttle limit reached.");
    }

    private boolean throttleLimitReached(String ip) {
        return throttleTable.containsKey(ip) && throttleTable.get(ip) < throttleLimit;
    }

    private void increaseRequestRate(String ip) {
        throttleTable.put(ip, throttleTable.getOrDefault(ip, 0) + 1);
    }

}
