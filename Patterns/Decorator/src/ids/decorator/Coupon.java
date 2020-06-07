package ids.decorator;

/**
 * Coupon class represents ConcreteDecorator
 * on Decorator solution. It applies a discount
 * to the Sellable item contained.
 */
public class Coupon extends SellableDecorator {

    private final float discount = 0.75f;

    /**
     * Pass the item where to add responsibilities
     * @param sellable sellable
     */
    public Coupon(Sellable sellable) {
        super(sellable);
    }

    @Override
    public float getPrice() {
        return this.item.getPrice() * discount;
    }

}
