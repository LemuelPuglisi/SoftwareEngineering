
import ids.email.Email;
import ids.email.EmailSubscriber;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Context {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(1);
        SubmissionPublisher<Email> publisher = new SubmissionPublisher<>(executor, Flow.defaultBufferSize());

        EmailSubscriber suba = new EmailSubscriber("a-example@domain.com");
        EmailSubscriber subb = new EmailSubscriber("b-example@domain.com");
        EmailSubscriber subc = new EmailSubscriber("c-example@domain.com");

        publisher.subscribe(suba);
        publisher.subscribe(subb);
        publisher.subscribe(subc);

        Email exampleEmailA = new Email("[a] Hello world");
        Email exampleEmailB = new Email("[b] Hello world");
        Email exampleEmailC = new Email("[c] Hello world");

        publisher.submit(exampleEmailA);
        publisher.submit(exampleEmailB);
        publisher.submit(exampleEmailC);

        executor.shutdown();
    }

}
