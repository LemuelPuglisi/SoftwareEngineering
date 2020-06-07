package ids.decorator;

/**
 * Ticket is the representation of
 * a ConcreteComponent in the Decorator
 * solution. It has a cost that can be
 * reduced by applying coupons.
 */
public class Ticket implements Sellable {

    private final float price = 120.50f;

    @Override
    public float getPrice() {
        return price;
    }

}
