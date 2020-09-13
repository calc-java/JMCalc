import java.util.HashMap;

public class Roman
{
    public static boolean isRoman(String s) //проверка на римские символы
    {
        return s.matches("[CLXVI]+");
    }

    public static int romanToArabic(String value)
    {
        HashMap<String, Integer> numList = new HashMap<String, Integer>();

        numList.put("I", 1);
        numList.put("II", 2);
        numList.put("III", 3);
        numList.put("IV", 4);
        numList.put("V", 5);
        numList.put("VI", 6);
        numList.put("VII", 7);
        numList.put("VIII", 8);
        numList.put("IX", 9);
        numList.put("X", 10);
        numList.put("XI", 11);
        numList.put("XII", 12);
        numList.put("XIII", 13);
        numList.put("XIV", 14);
        numList.put("XV", 15);
        numList.put("XVI", 16);
        numList.put("XVII", 17);
        numList.put("XVIII", 18);
        numList.put("XIX", 19);
        numList.put("XX", 20);
        numList.put("XXI", 21);
        numList.put("XXIV", 24);
        numList.put("XXV", 25);
        numList.put("XXVII", 27);
        numList.put("XXVIII", 28);
        numList.put("XXX", 30);
        numList.put("XXXII", 32);
        numList.put("XXXV", 35);
        numList.put("XXXVI", 36);
        numList.put("XL", 40);
        numList.put("XLII", 42);
        numList.put("XLV", 45);
        numList.put("XLVIII", 48);
        numList.put("XLIX", 49);
        numList.put("L", 50);
        numList.put("LIV", 54);
        numList.put("LVI", 56);
        numList.put("LX", 60);
        numList.put("LXIII", 63);
        numList.put("LXIV", 64);
        numList.put("LXX", 70);
        numList.put("LXXII", 72);
        numList.put("LXXX", 80);
        numList.put("LXXXI", 81);
        numList.put("XC", 90);
        numList.put("C", 100);

        return numList.get(value);
    }

    public static String ArabicToRoman(Integer value)
    {
        HashMap<Integer, String> numList = new HashMap<Integer, String>();

        numList.put(1, "I");
        numList.put(2, "II");
        numList.put(3, "III");
        numList.put(4, "IV");
        numList.put(5, "V");
        numList.put(6, "VI");
        numList.put(7, "VII");
        numList.put(8, "VIII");
        numList.put(9, "IX");
        numList.put(10, "X");
        numList.put(11, "XI");
        numList.put(12, "XII");
        numList.put(13, "XIII");
        numList.put(14, "XIV");
        numList.put(15, "XV");
        numList.put(16, "XVI");
        numList.put(17, "XVII");
        numList.put(18, "XVIII");
        numList.put(19, "XIX");
        numList.put(20, "XX");
        numList.put(21, "XXI");
        numList.put(24, "XXIV");
        numList.put(25, "XXV");
        numList.put(27, "XXVII");
        numList.put(28, "XXVIII");
        numList.put(30, "XXX");
        numList.put(32, "XXXII");
        numList.put(35, "XXXV");
        numList.put(36, "XXXVI");
        numList.put(40, "XL");
        numList.put(42, "XLII");
        numList.put(45, "XLV");
        numList.put(48, "XLVIII");
        numList.put(49, "XLIX");
        numList.put(50, "L");
        numList.put(54, "LIV");
        numList.put(56, "LVI");
        numList.put(60, "LX");
        numList.put(63, "LXIII");
        numList.put(64, "LXIV");
        numList.put(70, "LXX");
        numList.put(72, "LXXII");
        numList.put(80, "LXXX");
        numList.put(81, "LXXXI");
        numList.put(90, "XC");
        numList.put(100, "C");

        return numList.get(value);
    }
}