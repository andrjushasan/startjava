public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("Задача 1 \"Вывод характеристик компьютера\"");
        boolean isUserMan = true;
        byte cpuCores = 4;
        short ramBanks = 2;
        int cpuFrequency = 2_100_000_000;
        long hddCapacity = 249_028_407_296L;
        char firstSignOfBrand = 'H';
        float ramAvailable = 5.5F;
        double hddAvailable = 165.745268987D;
        System.out.println("Пользователь является человеком: " + isUserMan + 
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
        byte minByte = -128;
        byte maxByte = 127;
        short minShort = -32768;
        short maxShort = 32767;
        int minInt = -2147483648;
        int maxInt = 2147483647;
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;
        System.out.println(minByte + " " + maxByte + " " + (++minByte) + " " + (--maxByte));
        System.out.println(minShort + " " + maxShort + " " + (++minShort) + " " + (--maxShort));
        System.out.println(minInt + " " + maxInt + " " + (++minInt) + " " + (--maxInt));
        System.out.println(minLong + " " + maxLong + " " + (++minLong) + " " + (--maxLong));

        System.out.println("\nЗадача 5 \"Перестановка значений переменных\"");
        int firstOne = 2;
        int secondOne = 5;
        int thirdOne = 0;
        System.out.print("с помощью третьей переменной; исходные " + "первая = " + firstOne + 
                ", вторая = " + secondOne);
        thirdOne = firstOne;
        firstOne = secondOne;
        secondOne = thirdOne;
        System.out.println("; измененные " + "первая = " + firstOne + ", вторая = " + secondOne);
        System.out.print("с помощью арифметических операций; исходные " + "первая = " + firstOne + 
                ", вторая = " + secondOne);
        firstOne += secondOne;
        secondOne = firstOne - secondOne;
        firstOne -= secondOne;
        System.out.println("; измененные " + "первая = " + firstOne + ", вторая = " + secondOne);
        System.out.print("с помощью побитовой операции ^; исходные " + "первая = " + firstOne + 
                ", вторая = " + secondOne);
        firstOne ^= secondOne;
        secondOne ^= firstOne;
        firstOne ^= secondOne;
        System.out.println("; измененные " + "первая = " + firstOne + ", вторая = " + secondOne);

        System.out.println("\nЗадача 6 \"Вывод символов и их кодов\"");
        byte codeOne = 35;
        byte codeTwo = 38;
        byte codeThree = 64;
        byte codeFour = 94;
        byte codeFive = 95;
        char charOne = (char) codeOne;
        char charTwo = (char) codeTwo;
        char charThree = (char) codeThree;
        char charFour = (char) codeFour;
        char charFive = (char) codeFive;
        System.out.println(codeOne + " " + charOne);
        System.out.println(codeTwo + " " + charTwo);
        System.out.println(codeThree + " " + charThree);
        System.out.println(codeFour + " " + charFour);
        System.out.println(codeFive + " " + charFive);

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
        int units = srcNumber % 10;
        int product = hundreds * tens * units;
        int sum = hundreds + tens + units;
        System.out.println("Число " + srcNumber + " содержит:\n" + 
                hundreds + " сотен\n" + tens + " десятков\n" + units + " единиц\n" + 
                "Сумма его цифр = " + sum + "\nПроизведение = " + product);

        System.out.println("\nЗадача 9 \"Вывод времени\"");
        int srcTimeSec = 86399;
        int hours = srcTimeSec / 3600;
        int minutes = (srcTimeSec % 3600) / 60;
        int seconds = srcTimeSec % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}