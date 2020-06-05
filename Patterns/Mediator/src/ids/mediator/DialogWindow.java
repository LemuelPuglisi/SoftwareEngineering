package ids.mediator;

/**
 * ConcreteMediator implementation (Gamma n.1 variant)
 * Coordinates interactions between font-selector widget
 * and font-label.
 */
public class DialogWindow {

    /**
     * Well known colleagues
     */
    private FontSelect select = new FontSelect();
    private FontLabel label = new FontLabel();

    /**
     * Setting colleagues mediator as itself
     */
    public DialogWindow() {
        select.setMediator(this);
        label.setMediator(this);
    }

    /**
     * Method used by the client to interact with
     * the FontSelect widget and select a font.
     */
    public void selectFontFromList (int choice) {
        this.select.selectFont(choice);
    }

    /**
     * Event emitted by FontSelect widget. User selected a
     * font, so it needs to be displayed on the font label.
     */
    public void fontHasBeenSelected () {
        this.label.setLabelText(this.select.getSelectedFont());
    }

    /**
     * Print all the widgets in the dialog.
     */
    public void displayDialogWindow () {
        System.out.println("|---------------- _ X --|");
        this.select.printAvailableFonts();
        this.label.printLabelText();
        System.out.println("|-----------------------|");
    }

}
