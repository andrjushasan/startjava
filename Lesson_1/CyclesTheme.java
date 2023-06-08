public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("Задача 1 \"Подсчет суммы четных и нечетных чисел\"");
        int minSection = -10;
        int maxSection = 21;
        int evenCount = 0;
        int oddCount = 0;
        int counter = minSection;
        do {
            if(counter % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            };
            counter++;
        } while(counter <= maxSection);
        System.out.println("в промежутке [" + minSection + "," + maxSection + 
                "] сумма четных чисел = " + evenCount + ", а нечетных = " + oddCount);

        System.out.println("\nЗадача 2 \"Вывод чисел в интервале (min и max) в порядке убывания\"");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int minValue = 0;
        int maxValue = 0;
        if(number1 > number2) {
            if(number1 > number3) {
                maxValue = number1;
            } else {
                maxValue = number3;
            }
        } else {
            if(number2 > number3) {
                maxValue = number2;
            } else {
                maxValue = number3;
            }
        }
        if(number1 < number2) {
            if(number1 < number3) {
                minValue = number1;
            } else {
                minValue = number3;
            }
        } else {
            if(number2 < number3) {
                minValue = number2;
            } else {
                minValue = number3;
            }
        }
        for(int i = (maxValue - 1); i > minValue; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадача 3 \"Вывод реверсивного числа и суммы его цифр\"");
        int givenNumber = 1234;
        int digit = 0;
        int sumDigits = 0;
        while(givenNumber > 0) {
            digit = givenNumber % 10;
            System.out.print(digit);
            sumDigits += digit;
            givenNumber /= 10;
        }
        System.out.println(", сумма цифр = " + sumDigits);

        System.out.println("\nЗадача 4 \"Вывод чисел на консоль в несколько строк\"");
        int minInterval = 1;
        int maxInterval = 24;
        int stepIteration = 2;
        int numberDigitsInLine = 5;
        int digitPrint = minInterval;
        int counter4 = minInterval;
        while(counter4 < maxInterval) {
            for(int i = 0; i < numberDigitsInLine; i++) {
                System.out.printf("%2d ", digitPrint);
                counter4 += stepIteration;
                if(counter4 < maxInterval) {
                    digitPrint = counter4;
                } else {
                    digitPrint = 0;
                }
            }
            System.out.println();
        }

        System.out.println("\nЗадача 5 \"Проверка количества двоек на четность/нечетность\"");
        int givenNumber5 = 3242592;
        int digit5 = 0;
        int counterOfTwo = 0;
        System.out.print("число " + givenNumber5);
        while(givenNumber5 > 0) {
            digit5 = givenNumber5 % 10;
            if(digit5 == 2) {
                counterOfTwo++;
            }
            givenNumber5 /= 10;
        }
        System.out.print(" содержит " + counterOfTwo);
        if(counterOfTwo % 2 == 0) {
            System.out.print(" (четное)");
        } else {
            System.out.print(" (нечетное)");
        }
        System.out.println(" количество двоек");

        System.out.println("\nЗадача 6 \"Отображение фигур в консоли\"");

    }
}