import java.util.Arrays;

public class RomanNumbers implements Validation{
    static String[] romanNums = {"I","II","III","VI","V","VI","VII","VIII","XI","X"};
    static String[] romanNumDec= {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
    static int lenNums = romanNums.length;
    static int lenDec = romanNumDec.length;
    static int lenAll = lenNums * lenDec;
    static String[] romanNumsAll = new String [lenAll];

    public boolean isInputValueIsDigit(String value) {
        return Arrays.asList(romanNums).contains(value);
    }

    static String calculateRomanNumbers(String value1, String value2, String operator){
        for (int j = 0;j < lenDec;j++){
            for (int i = 0;i < lenNums;i++){
                if (i == 9) romanNumsAll[j * 10 + 1] = romanNumDec[j + 1];
                else romanNumsAll[j * 10 + 1] = romanNumDec[j] + romanNums[i];
            }
        }
        String val1ToArabic = Integer.toString(Arrays.binarySearch(romanNums, value1) + 1);
        String val2ToArabic = Integer.toString(Arrays.binarySearch(romanNums, value2) + 1);

        int resArabic = ArabicNumbers.calculateArabicNumbers(val1ToArabic, val2ToArabic, operator);

        String result = null;

        return result;
    }
}
