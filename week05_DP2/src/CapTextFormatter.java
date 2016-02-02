
public class CapTextFormatter implements TextFormatter{
    public static String capText = "[CapTextFormatter]:";

    @Override
    public void format(String text) {
        System.out.println(capText + " " +text.toUpperCase());
    }
}
