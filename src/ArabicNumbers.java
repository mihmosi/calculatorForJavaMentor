import java.util.Arrays;

/**
 * работаем только с арабскими числами
 */
public class ArabicNumbers {
    public static String[] arabicNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static boolean isInputValueIsDigit(String value) {
        return Arrays.asList(arabicNumbers).contains(value);
    }

    public static int calculateArabicNumbers(String value1, String value2, String operator) {
        int num1 = Integer.parseInt(value1);
        char operation = operator.charAt(0);
        int num2 = Integer.parseInt(value2);
        int res = 0;
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
        }
        ;

        return res;
    }
}
