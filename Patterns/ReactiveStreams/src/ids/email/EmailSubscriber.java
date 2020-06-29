package ids.email;

import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Flow.Subscriber;

public class EmailSubscriber implements Subscriber<Email> {

    String address;
    Subscription subscription;

    public EmailSubscriber (String address) {
        this.address = address;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(Email item) {
        System.out.println("["+address+"] " + item.message);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("All emails have been sent to " + address);
    }
}
