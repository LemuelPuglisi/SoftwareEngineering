package ids.cor;

/**
 * Chain of Responsibility Handler interface
 */
public interface Handler {

    public Response handle (Request request);

}
