package Weather.application.Model;

public class Condition {
    private String text;

    public Condition(){}

    public Condition(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
