package ids.mediator;

/**
 * Colleague interface that knows about ConcreteMediator
 * called DialogWindow.
 */

public class DialogWidget {

    /**
     * Mediator instance
     */
    protected DialogWindow mediator;

    /**
     * Set a new mediator to the Colleague
     * @param mediator
     */
    public void setMediator (DialogWindow mediator) {
        this.mediator = mediator;
    }

}
