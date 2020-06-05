package ids.mediator;

import java.util.List;

public class FontSelect extends DialogWidget {

    /**
     * Collection of available fonts
     */
    private final List<String> fonts = List.of(
        "SanSerif", "Microsoft", "Times new Roman"
    );

    /**
     * User-selected font that will be emitted
     */
    private String selectedFont;

    /**
     * Return the selected font
     * @return String
     */
    public String getSelectedFont() {
        return selectedFont;
    }

    /**
     * Select a font from the list
     * @param choice [arbitrary integer]
     */
    public void selectFont (int choice) {
        this.selectedFont = fonts.get(choice % fonts.size());
        this.mediator.fontHasBeenSelected();
    }

    /**
     * Print all the available fonts in the list
     */
    public void printAvailableFonts () {
        System.out.println("Available fonts:");
        fonts.forEach(System.out::println);
    }

}
