import java.util.Scanner;

public class Main extends MyExc
{
    public static void main(String[] args) throws IncorrectChar, IncorrectNum, NumOutOfRange
    {
        Scanner reader = new Scanner(System.in);

        while (true)
        {
            System.out.println("Введите выражение:");

            String str = reader.nextLine(); //считываем строку

            if (str.toUpperCase().equals("STOP")) break;

            String[] split = str.split(" "); //из строки записали в массив (разделение через пробел)

            String num1 = split[0]; //первый аргумент
            String num2 = split[2]; //второй аргумент
            String znak = split[1]; //знак

            if (!znak.matches("[+-/*]")) // проверка соответствия знака любому в [скобках]
            {
                throw new IncorrectChar();
            }

            if (!Roman.isRoman(num1) && !Roman.isRoman(num2)) //если цифры не римские выводим результат
            {
                System.out.println(Calc.calculate(Integer.parseInt(num1), Integer.parseInt(num2), znak)); //перевод строки в число
            }

            else if (Roman.isRoman(num1) && Roman.isRoman(num2)) // если цифры римские выводим результат
            {
                System.out.println(Calc.calculate(split[0], split[2], znak));
            }

            else
                {
                    throw new IncorrectNum();
                }
        }
    }
}