public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задача 1 \"Перевод псевдокода на язык Java\"");
        int age = 34;
        boolean maleGender = true;
        double height = 1.82;
        char nameLetterFirst = "Андрей".charAt(0);
        if (age > 20) {
            System.out.println("Возраст больше 20 лет.");
        } else {
            System.out.println("Возраст меньше 20 лет.");
        }
        if (!maleGender) {
            System.out.println("Пол женский.");
        } else {
            System.out.println("Пол мужской.");
        }
        if (height > 1.8) {
            System.out.println("Рост больше 1 метра 80 сантиметров.");
        } else {
            System.out.println("Рост меньше 1 метра 80 сантиметров.");
        }
        if (nameLetterFirst == 'М') {
            System.out.println("Первая буква имени - М.");
        } else if (nameLetterFirst == 'И') {
            System.out.println("Первая буква имени - И.");
        } else {
            System.out.println("Первая буква имени - не М и не И.");
        }

        System.out.println("\nЗадача 2 \"Поиск max и min числа\"");
        int number1 = 123;
        int number2 = 345;
        if (number1 > number2) {
            System.out.println("Число 1 = " + number1 + ", оно больше числа 2 = " + number2);
        } else if (number1 < number2) {
            System.out.println("Число 1 = " + number1 + ", оно меньше числа 2 = " + number2);
        } else {
            System.out.println("Число 1 = " + number1 + " и число 2 = " + number2 + " равны");
        }

        System.out.println("\nЗадача 3 \"Проверка числа\"");
        int anyNumber = 10;
        if (anyNumber != 0) {
            System.out.print("Исходное число " + anyNumber + " является");
            if (anyNumber % 2 == 0) {
                System.out.print(" чётным");
            } else {
                System.out.print(" нечётным");
            }
            if (anyNumber < 0) {
                System.out.println(" отрицательным");
            } else {
                System.out.println(" положительным");
            }
        }

        System.out.println("\nЗадача 4 \"Поиск одинаковых цифр в числах\"");
        int srcNumber1 = 123;
        int srcNumber2 = 321;
        System.out.print("Исходные числа: " + srcNumber1 + " и " + srcNumber2);
        int hundreds1 = srcNumber1 / 100;
        int tens1 = (srcNumber1 % 100) / 10;
        int ones1 = srcNumber1 % 10;
        int hundreds2 = srcNumber2 / 100;
        int tens2 = (srcNumber2 % 100) / 10;
        int ones2 = srcNumber2 % 10;
        if ((hundreds1 != hundreds2) & (tens1 != tens2) & (ones1 != ones2)) {
            System.out.println(", равных цифр в них нет");
        } else {
            if (ones1 == ones2) {
                System.out.print(", \nодинаковая " + ones1 + " в разряде 1");
            }
            if (tens1 == tens2) {
                System.out.print(", \nодинаковая " + tens1 + " в разряде 2");
            }
            if (hundreds1 == hundreds2) {
                System.out.print(", \nодинаковая " + hundreds1 + " в разряде 3");
            }
        }

        System.out.println("\n\nЗадача 5 \"Определение символа по его коду\"");
        char char5 = '\u0057';
        System.out.print(char5);//
        if (char5 >= 'a' && char5 <= 'z') {
            System.out.println(", маленькая буква");
        } else if (char5 >= 'A' && char5 <= 'Z') {
            System.out.println(", большая буква");
        } else if (char5 >= '0' && char5 <= '9') {
            System.out.println(", число");
        } else {
            System.out.println(", не буква и не число");
        }

        System.out.println("\nЗадача 6 \"Подсчет суммы вклада и начисленных банком %\"");
        int vklad = 300_000;
        int percent = 0;
        int calcPercent = 0;
        int totalSum = 0;
        if (vklad < 100_000) {
            percent = 5;
        } else if (vklad <= 300_000) {
            percent = 7;
        } else {
            percent = 10;
        }
        calcPercent = vklad * percent / 100;
        totalSum = vklad + calcPercent;
        System.out.println("Сумма вклада = " + vklad + 
                "\nНачисленный % = " + calcPercent + 
                "\nИтоговая сумма с % = " + totalSum);

        System.out.println("\nЗадача 7 \"Определение оценки по предметам\"");
        int percentHistory = 59;
        int percentProgramming = 91;
        int markHistory = 0;
        int markProgramming = 0;
        if (percentHistory <= 60) {
            markHistory = 2;
        } else if (percentHistory <= 73) {
            markHistory = 3;
        } else if (percentHistory <= 91) {
            markHistory = 4;
        } else {
            markHistory = 5;
        }
        if (percentProgramming <= 60) {
            markProgramming = 2;
        } else if (percentProgramming <= 73) {
            markProgramming = 3;
        } else if (percentProgramming <= 91) {
            markProgramming = 4;
        } else {
            markProgramming = 5;
        }
        System.out.println(markHistory + " - история\n" + markProgramming + " - программирование\n" + 
                (float) (markHistory + markProgramming) / 2 + 
                " - средний балл оценок по предметам\n" + 
                (float) (percentHistory + percentProgramming) / 2 + " - средний % по предметам");

        System.out.println("\nЗадача 8 \"Расчет прибыли за год\"");
        int rentMonthly = 5000;
        int incomeAverage = 13000;
        int costPrice = 9000;
        int profitAnnual = (incomeAverage - costPrice - rentMonthly) * 12;
        if (profitAnnual <= 0) {
            System.out.printf("%s%d%s", "прибыль за год: ", profitAnnual, " руб.\n");
        } else {
            System.out.printf("%s%+d%s", "прибыль за год: ", profitAnnual, " руб.\n");
        }

        System.out.println("\nЗадача 9 \"Подсчет количества банкнот\"");
        int sumRequested = 567;
        int hundredsAvailable = 10;
        int tensAvailable = 5;
        int onesAvailable = 5;
        int hundredsRequired = 0;
        int tensRequired = 0;
        int onesRequired = 0;
        int sumProcessed = sumRequested;
        if (sumRequested > (hundredsAvailable * 100 + tensAvailable * 10 + onesAvailable)) {
            System.out.println("Не хватает банкнот для выдачи суммы");
        } else {
            if (sumProcessed / 100 < hundredsAvailable) {
                hundredsRequired = sumProcessed / 100;
                hundredsAvailable -= hundredsRequired;
                sumProcessed -= hundredsRequired * 100;
                if (sumProcessed / 10 < tensAvailable) {
                    tensRequired = sumProcessed / 10;
                    tensAvailable -= tensRequired;
                    onesRequired = sumProcessed - tensRequired * 10;
                    onesAvailable -= onesRequired;
                } else {/*if 10 bankn is NOT enough!!!!*/
                    tensRequired = tensAvailable;
                    tensAvailable -= tensRequired;
                    sumProcessed -= tensRequired * 10;
                    onesRequired = sumProcessed;
                    onesAvailable -= onesRequired;
                }
            } else {
                hundredsRequired = hundredsAvailable;
                hundredsAvailable -= hundredsRequired;
                sumProcessed -= hundredsRequired * 100;
                if (sumProcessed / 10 < tensAvailable) {
                    tensRequired = sumProcessed / 10;
                    tensAvailable -= tensRequired;
                    onesRequired = sumProcessed - tensRequired * 10;
                    onesAvailable -= onesRequired;
                } else {
                    tensRequired = tensAvailable;
                    tensAvailable -= tensRequired;
                    sumProcessed -= tensRequired * 10;
                    onesRequired = sumProcessed;
                    onesAvailable -= onesRequired;
                }
            }
            System.out.printf("%s","Номиналы и количества");
            System.out.printf("%n%10s%10s%10s", "100 USD", "10 USD", "1 USD");
            System.out.printf("%n%10d%10d%10d", hundredsRequired, tensRequired, onesRequired);
            System.out.printf("%n%s%d%s", "Выдаваемая сумма: ", sumRequested, " USD");
        }
    }
}