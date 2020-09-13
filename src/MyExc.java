public class MyExc extends java.lang.Exception

{
    public static class IncorrectChar extends Throwable
    {
        @Override
        public String toString()
        {
            return "Неверный знак операции!";
        }
    }

    public static class IncorrectNum extends Throwable
    {
        @Override
        public String toString()
        {
            return "Не корректные числа!";
        }
    }

    public static class NumOutOfRange extends Throwable
    {
        @Override
        public String toString()
        {
            return "Число вне диапазона от 1 до 10!";
        }
    }
}
