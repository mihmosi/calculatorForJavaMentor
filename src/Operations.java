import java.util.Arrays;

public class Operations implements Validation{

    public static String[] operations = {"+","-","*","/"};

    @Override
    public boolean isInputValueIsDigit(String value) {
        return Arrays.asList(operations).contains(value);
    }
}
