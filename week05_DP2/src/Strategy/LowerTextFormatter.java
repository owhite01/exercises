package Strategy;

public class LowerTextFormatter implements TextFormatter {
    public static String lowText = "[LowTextFormatter]:";

    @Override
    public void format(String text) {
        System.out.println(lowText + " " +text.toLowerCase());
    }
}
