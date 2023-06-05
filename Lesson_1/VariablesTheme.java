public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("Задача 1 \"Вывод характеристик компьютера\"");
        boolean maleGender = true;
        byte cpuCores = 4;
        short ramBanks = 2;
        int cpuFrequency = 2_100_000_000;
        long hddCapacity = 249_028_407_296L;
        char firstSignOfBrand = 'H';
        float ramAvailable = 5.5F;
        double hddAvailable = 165.745268987D;
        System.out.println("Пользователем является мужчина?: " + maleGender + 
                "\nЧисло ядер процессора: " + cpuCores + 
                "\nЧисло банков оперативной памяти: " + ramBanks + 
                "\nЧастота процессора в Гц: " + cpuFrequency + 
                "\nЁмкость жёсткого диска в байтах: " + hddCapacity +
                "\nПервая буква бренда компьютера: " + firstSignOfBrand + 
                "\nДоступно оперативной памяти, Гб: " + ramAvailable + 
                "\nДоступно места на жёстком диске, Гб: " + hddAvailable);

        System.out.println("\nЗадача 2 \"Расчет стоимости товара со скидкой\"");
        int costPen = 100;
        int costBook = 200;
        int discount = 11;
        System.out.println("Общая стоимость ручки и книги " + (costPen + costBook) + " руб\n" + 
                "Сумма скидки " + discount + "%\n" + 
                "Стоимость ручки и книги со скидкой " + 
                ((costPen + costBook) * (100 - discount) / 100) + " руб");

        System.out.println("\nЗадача 3 \"Вывод слова JAVA\"");
        System.out.println("   J    a  v     v  a        \n   J   a a  v   v  a a       \n" + 
                "J  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\nЗадача 4 \"Вывод min и max значений целых числовых типов\"");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        System.out.println(maxByte + " " + (++maxByte) + " " + (--maxByte));
        System.out.println(maxShort + " " + (++maxShort) + " " + (--maxShort));
        System.out.println(maxInt + " " + (++maxInt) + " " + (--maxInt));
        System.out.println(maxLong + " " + (++maxLong) + " " + (--maxLong));

        System.out.println("\nЗадача 5 \"Перестановка значений переменных\"");
        int number1 = 2;
        int number2 = 5;
        int temp = number1;
        System.out.print("с помощью третьей переменной; исходные " + "первая = " + number1 + 
                ", вторая = " + number2);
        number1 = number2;
        number2 = temp;
        System.out.println("; измененные " + "первая = " + number1 + ", вторая = " + number2);
        System.out.print("с помощью арифметических операций; исходные " + "первая = " + number1 + 
                ", вторая = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("; измененные " + "первая = " + number1 + ", вторая = " + number2);
        System.out.print("с помощью побитовой операции ^; исходные " + "первая = " + number1 + 
                ", вторая = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("; измененные " + "первая = " + number1 + ", вторая = " + number2);

        System.out.println("\nЗадача 6 \"Вывод символов и их кодов\"");
        char sharp = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore1 = '_';
        System.out.println((int) sharp + " " + sharp);
        System.out.println((int) ampersand + " " + ampersand);
        System.out.println((int) at + " " + at);
        System.out.println((int) caret + " " + caret);
        System.out.println((int) underscore1 + " " + underscore1);

        System.out.println("\nЗадача 7 \"Вывод в консоль ASCII-арт Дюка\"");
        char slash = '/';
        char backSlash = '\\';
        char parenthOpen = '(';
        char parenthClose = ')';
        char underscore = '_';
        System.out.println("    " + slash + backSlash + 
                "\n   " + slash + "  " + backSlash + 
                "\n  " + slash + underscore + parenthOpen + " " + parenthClose + backSlash + 
                "\n " + slash + "      " + backSlash + 
                "\n" + slash + underscore + underscore + underscore + underscore + slash +
                backSlash + underscore + underscore + backSlash);

        System.out.println("\nЗадача 8 \"Вывод количества сотен, десятков и единиц числа\"");
        int srcNumber = 123;
        int hundreds = srcNumber / 100;
        int tens = (srcNumber % 100) / 10;
        int ones = srcNumber % 10;
        int product = hundreds * tens * ones;
        int sum = hundreds + tens + ones;
        System.out.println("Число " + srcNumber + " содержит:\n" + 
                hundreds + " сотен\n" + tens + " десятков\n" + ones + " единиц\n" + 
                "Сумма его цифр = " + sum + "\nПроизведение = " + product);

        System.out.println("\nЗадача 9 \"Вывод времени\"");
        int srcTimeSec = 86399;
        int hours = srcTimeSec / 3600;
        int minutes = (srcTimeSec / 60) % 60;
        int seconds = srcTimeSec % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}