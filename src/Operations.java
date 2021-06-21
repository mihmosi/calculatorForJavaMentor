import java.util.Arrays;

public class Operations {

    public static String[] operations = {"+","-","*","/"};

    public static boolean isInputValueIsSign(String value) {
        return Arrays.asList(operations).contains(value);
    }
}
