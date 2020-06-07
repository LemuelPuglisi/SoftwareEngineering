package ids.decorator;

/**
 * SellableDecorator represents the Decorator
 * component in the Decorator solution. It adds
 * a responsibility to the object
 */
public abstract class SellableDecorator implements Sellable{

    /**
     * Adding by composition a Sellable object
     * to the Decorator abstract class
     */
    protected Sellable item;

    /**
     * Pass the item where to add responsibilities
     * @param sellable sellable
     */
    public SellableDecorator(Sellable sellable) {
        item = sellable;
    }

    /**
     * Dynamically subtract responsibilities
     * to the object getting the inner Sellable item.
     * @return Sellable item
     */
    public Sellable getSellableItem() {
        return item;
    }

    public abstract float getPrice();
}
