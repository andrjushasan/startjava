public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1 \"Подсчет суммы четных и нечетных чисел\"");
        int start = -10;
        int finish = 21;
        int sumEvens = 0;
        int sumOdds = 0;
        int counter = start;
        do {
            if (counter % 2 == 0) {
                sumEvens += counter;
            } else {
                sumOdds += counter;
            };
            counter++;
        } while (counter <= finish);
        System.out.println("в промежутке [" + start + ", " + finish + 
                "] сумма четных чисел = " + sumEvens + ", а нечетных = " + sumOdds);

        System.out.println("\nЗадача 2 \"Вывод чисел в интервале (min и max) в порядке убывания\"");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        if (number2 > number1 && number2 > number3) {
            max = number2;
        } else if (number3 > number1 && number3 > number2) {
            max = number3;
        }
        int min = number1;
        if (number2 < number1 && number2 < number3) {
            min = number2;
        } else if (number3 < number1 && number3 < number2) {
            min = number3;
        }
        for (int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3 \"Вывод реверсивного числа и суммы его цифр\"");
        int givenNumber = 1234;
        int sumDigits = 0;
        while (givenNumber > 0) {
            int digit = givenNumber % 10;
            System.out.print(digit);
            sumDigits += digit;
            givenNumber /= 10;
        }
        System.out.println(", сумма цифр = " + sumDigits);

        System.out.println("\nЗадача 4 \"Вывод чисел на консоль в несколько строк\"");
        int start4 = 1;
        int finish4 = 24;
        int numberDigitsInLine = 5;
        int digitPrint = start4;
        int counter4 = start4;
        while (counter4 < finish4) {
            for (int i = 0; i < numberDigitsInLine; i++) {
                System.out.printf("%2d ", digitPrint);
                counter4 += 2;
                if (counter4 < finish4) {
                    digitPrint = counter4;
                } else {
                    digitPrint = 0;
                }
            }
            System.out.println();
        }

        System.out.println("\nЗадача 5 \"Проверка количества двоек на четность/нечетность\"");
        int givenNumber5 = 3242592;
        int countTwos = 0;
        System.out.print("число " + givenNumber5);
        while (givenNumber5 > 0) {
            if (givenNumber5 % 10 == 2) {
                countTwos++;
            }
            givenNumber5 /= 10;
        }
        System.out.print(" содержит " + countTwos);
        if (countTwos % 2 == 0) {
            System.out.print(" (четное)");
        } else {
            System.out.print(" (нечетное)");
        }
        System.out.println(" количество двоек");

        System.out.println("\nЗадача 6 \"Отображение фигур в консоли\"");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        int numberSymbols = 5;
        while (numberSymbols > 0) {
            System.out.printf("%." + numberSymbols + "s%n", "#####");
            numberSymbols --;
        }
        System.out.println();
        numberSymbols = 1;
        do {
            System.out.printf("%." + numberSymbols + "s%n", "$$$$");
            numberSymbols ++;
        } while (numberSymbols < 3);
        do {
            System.out.printf("%." + numberSymbols + "s%n", "$$$$");
            numberSymbols --;
        } while (numberSymbols > 0);

        System.out.println("\nЗадача 7 \"Отображение ASCII-символов\"");
        System.out.printf("%7s%10s%n", "DECIMAL", "CHARACTER");
        for (int i = 0; i < '0'; i++) {
            if(i % 2 != 0) {
                System.out.printf("%7d%10s%n", i, (char) i);
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if(i % 2 == 0) {
                System.out.printf("%7d%10s%n", i, (char) i);
            }
        }

        System.out.println("\nЗадача 8 \"Проверка, является ли число палиндромом\"");
        int givenNumber8 = 1234321;
        int copyNumber8 = givenNumber8;
        int reverseNumber = 0;
        while (copyNumber8 > 0) {
            reverseNumber = reverseNumber * 10 + copyNumber8 % 10;
            copyNumber8 /= 10;
        }
        System.out.print("число " + givenNumber8);
        if (givenNumber8 != reverseNumber) {
            System.out.print(" не");
        }
        System.out.println(" является палиндромом");

        System.out.println("\nЗадача 9 \"Определение, является ли число счастливым\"");
        int givenNumber9 = 123456;
        int copyNumber9 = givenNumber9;
        int sumDigitsLast = 0;
        int sumDigitsFirst = 0;
        int counter9 = 0;
        while (copyNumber9 > 0) {
            if (counter9 < 3) {
                sumDigitsLast += copyNumber9 % 10;
            } else {
                sumDigitsFirst += copyNumber9 % 10;
            }
            copyNumber9 /= 10;
            counter9++;
        }
        System.out.printf("%s%.3s%s%d%n", "Сумма цифр ", givenNumber9, " = ", sumDigitsFirst);
        System.out.printf("%14d%s%d\r%s%n", givenNumber9, " = ", sumDigitsLast, "Сумма цифр ");
        System.out.print("число");
        if (sumDigitsFirst != sumDigitsLast) {
            System.out.print(" не");
        }
        System.out.println(" является счастливым");

        System.out.println("\nЗадача 10 \"Вывод таблицы умножения Пифагора\"");
        System.out.printf("%s%n", "   |  2  3  4  5  6  7  8  9");
        System.out.printf("%s", "---|------------------------");
        for (int i = 2; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                if (j == 0) {
                    System.out.printf("%n%2d", i);
                } else if (j == 1) {
                    System.out.printf("%2s", "|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
        }
    }
}