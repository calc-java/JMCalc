public class Calc
{
    public static int calculate(int a, int b, String znak) throws MyExc.NumOutOfRange // вычисление арабских чисел
    {
        if ((a >= 1 & a <= 10) & (b >= 1 & b <= 10)) //проверка диапазона
        {
            switch (znak) {
                case ("*"):
                    return multiply(a, b);

                case ("/"):
                    return division(a, b);

                case ("+"):
                    return adding(a, b);

                default:
                    return subtraction(a, b);
            }
        }

        else throw new MyExc.NumOutOfRange();
    }

    public static String calculate(String a, String b, String znak) throws MyExc.NumOutOfRange // вычисление римских чисел
    {

        int num1 = Roman.romanToArabic(a); //переводим из римских в арабские
        int num2 = Roman.romanToArabic(b);

        if ((num1 >= 1 & num1 <= 10) & (num2 >= 1 & num2 <= 10)) //проверка диапазона
        {
            int result = calculate(num1, num2, znak);
            if (result < 1) return " ";   // в римских цифрах нет нуля и отрицательных значений

            return Roman.ArabicToRoman(result);
        }

        else throw new MyExc.NumOutOfRange();
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int division(int a, int b) {
        return a / b;
    }

    private static int adding(int a, int b) {
        return a + b;
    }

    private static int subtraction(int a, int b) {
        return a - b;
    }
}