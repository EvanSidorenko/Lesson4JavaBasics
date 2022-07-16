package Lesson4;

public class Main {
    public static void main(String[] args) {
        // Целые числа
        char uniChar = '\u039A'; // 2 байта
        byte aByte = 127; // 1 байт
        short bShort= 22; //  2 байта
        int cInt = 128;   // 4 байта
        long longNumber = 10000L; // 8 байт

        // Числа с плавающей точкой
        float floatNumber = 3.14F; // 4 байта
        double doubleNumber = 123.321D; // 8 байт

        // Строка
        String string = "Here is String"; // по умолчанию null

        // Массив чисел
        int[] numbers = new int [4];
           numbers[0] = 1;
           numbers[1] = 2;
           numbers[2] = 3;
           for (int i = 0; i < 4; i++){
            System.out.println("Выводим данные массива: " + numbers[i]);
        }
        // Примеры операций над разными типами данных
        System.out.println("Складываем : uniChar + cInt = " + (uniChar + cInt));
        System.out.println("Вычитаем : bShort - cInt = " + (uniChar - cInt));
        System.out.println("Умножаем : aByte * floatNumber = " +  (aByte*floatNumber));
        System.out.println("Делим : longNumber / aByte  = " +  (longNumber/aByte));
        System.out.println("Остаток от деления: bShort % aByte = " + (bShort % aByte));

        // Преобразование int в byte (восходящее преобразование типов)
            cInt = aByte;
        System.out.println("Все в порядке, переменной cInt присваивается значение aByte, которое входит в диапозон int; " + cInt);

        // Преобразование aByte в int(нисходящее преобразование типов)
        int dInt = 128;
        aByte = (byte) dInt;
        System.out.println("Переменной aByte типа byte присваивается значение переменной cInt типа int вне диапозона byte:" + aByte);

        if (string != null && string.equals("Evan")) {
            System.out.println("string не равен нулю и varString равен Evan");
        } else {
            System.out.println("string равен нулю или varString не равен Evan");
        }
        int maxValue = getMaxIntNumber();
        System.out.println("maxValue: " + maxValue);
        System.out.println("Результат сложения метода summ, который возвращает нам значение суммы переменных first, second: "+ summ(15,17));


    }

    static int getMaxIntNumber() {
        return  Integer.MAX_VALUE;
    }
    static int summ(int first, int second) {
        return first + second;
    }
}
