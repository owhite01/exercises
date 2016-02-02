
public class CapTextFormatter implements TextFormatter{
    String capText = "[CapTextFormatter]:";

    @Override
    public void format(String text) {
        System.out.println(capText + " " +text.toUpperCase());
    }
}
