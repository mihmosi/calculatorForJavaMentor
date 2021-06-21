import java.util.Arrays;

public class RomanNumbers extends ArabicNumbers{
    static String[] romanNums = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String[] romanNumDec = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
    static int lenNums = romanNums.length;
    static int lenDec = romanNumDec.length;
    static int lenAll = lenNums * lenDec;
    static String[] romanNumsAll = new String[lenAll];

    public static boolean isInputValueIsDigitRoman(String value) {
        return Arrays.asList(romanNums).contains(value);
    }

    static String calculateRomanNumbers(String value1, String value2, String operator) {
        for (int j = 0; j < lenDec - 1; j++) {
            for (int i = 0; i < lenNums; i++) {
                if (i == 9) romanNumsAll[j * 10 + i] = romanNumDec[j + 1];
                else romanNumsAll[j * 10 + i] = romanNumDec[j] + romanNums[i];
            }
        }
        String val1ToArabic = Integer.toString(Arrays.binarySearch(romanNums, value1) + 1);
        String val2ToArabic = Integer.toString(Arrays.binarySearch(romanNums, value2) + 1);

        int resArabic = ArabicNumbers.calculateArabicNumbers(val1ToArabic, val2ToArabic, operator);

        String result = null;

        try {
            result = romanNumsAll[resArabic - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Римская цифра не может быть менше единицы!");
        }
        return result;
    }

    public  static int findIndex(String[] list, String value){
        int len = list.length;
        int index = 0;
        for (int i = 0;i < len;i++){
            if (list[i].equals(value))
                index = i;
        }
        return index;
    }
}
