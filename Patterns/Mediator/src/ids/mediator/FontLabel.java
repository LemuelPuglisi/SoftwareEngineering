package ids.mediator;

public class FontLabel extends DialogWidget {

    private String labelText = "";

    public String getLabelText () {
        return labelText;
    }

    public void setLabelText (String labelText) {
        this.labelText = labelText;
    }

    public void printLabelText () {
        System.out.println("Selected font: " + labelText);
    }
}
