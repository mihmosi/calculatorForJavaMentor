import java.util.Scanner;

/**
 * Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.
 * Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число
 * и арифмитеческая операция передаются с новой строки считаются неверными.
 * Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами.
 * Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.
 * На выходе числа не ограничиваются по величине и могут быть любыми.
 * Калькулятор умеет работать только с целыми числами.
 * Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
 * при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение и прекратить свою работу.
 * При вводе римских чисел, ответ должен быть выведен римскими цифрами, соответственно,
 * при вводе арабских - ответ ожидается арабскими.
 * При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
 * При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
 * приложение выбрасывает исключение и завершает свою работу.
 */

public class Calculation {
    public static void main(String[] args) {
        System.out.println("> ");
        String[] s = (new Scanner(System.in).nextLine().trim().split(" "));

        try {
            if (ArabicNumbers.isInputValueIsDigit(s[0]) && ArabicNumbers.isInputValueIsDigit(s[2]) && Operations.isInputValueIsSign(s[1])) {
                System.out.println(ArabicNumbers.calculateArabicNumbers(s[0], s[2], s[1]));
            } else if (RomanNumbers.isInputValueIsDigitRoman(s[0]) && RomanNumbers.isInputValueIsDigitRoman(s[2]) && Operations.isInputValueIsSign(s[1])) {
                if (RomanNumbers.calculateRomanNumbers(s[0], s[2], s[1]) != null)
                    System.out.println(RomanNumbers.calculateRomanNumbers(s[0], s[2], s[1]));
            } else throw new Exception();
        } catch (Exception e) {
            System.out.println("Ошибка!!! Проверьте правильность введенных данных");
        } finally {
            System.out.println("Программа завершена!");
        }
    }
}
