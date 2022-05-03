package homework;

public class HW5 {

    public static void print(String text) {
        System.out.println(text);
    }

    //создать метод с названием verifyEquals(expectedResult, actualResult)
    public static String verifyEquals(String expectedResult, String actualResult) {
        String text;
        if (expectedResult.equals(actualResult)) {
            text = ("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            text = ("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        return text;
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    // 2 Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
    public static String weeksday(int day) {
        String message1 = "";
        if (day > 0 && day < 8) {
            if (day == 1) {
                message1 = "Monday";
            }
            if (day == 2) {
                message1 = "Tuesday";
            }
            if (day == 3) {
                message1 = "Wednesday";
            }
            if (day == 4) {
                message1 = "Thursday";
            }
            if (day == 5) {
                message1 = "Friday";
            }
            if (day == 6) {
                message1 = "Saturday";
            }
            if (day == 7) {
                message1 = "Sunday";
            }
        } else {
            message1 = "Error";
        }

        return message1;

    }

// 3 Given three values x, y, z determine the largest value and assign this value to the variable largest

    public static int determineLargest(int x, int y, int z) {
        int largest;
        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        if (largest < z) {
            largest = z;
        }
        return largest;
    }
// 4 Using nested if statements, write a fragment of code that prints the smallest value contained in the variables a, b, c

    public static int determineSmallest(int a, int b, int c) {
        int smallest;
        if (a < b) {
            smallest = a;
        } else {
            smallest = b;
        }
        if (smallest > c) {
            smallest = c;
        }
        return smallest;
    }

// 5 Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

    public static Double averageTemperature(double t1, double t2, double t3, double t4, double t5) {

        double averageOf5 = (t1 + t2 + t3 + t4 + t5) / 5;

        return averageOf5;
    }

    public static String message(double t1, double t2, double t3, double t4, double t5) {
        double tMin = 36.5;
        double tMax = 39.1;
        String message1;
        if (t1 > tMin || t2 > tMin || t3 > tMin || t4 > tMin || t5 > tMin
                || t1 < tMax || t2 < tMax || t3 < tMax || t4 < tMax || t5 < tMax) {
            averageTemperature(t1, t2, t3, t4, t5);
            message1 = "Средняя температура = " + averageTemperature(t1, t2, t3, t4, t5);
            System.out.println(message1);
        } else {
            message1 = "Fail";
            System.out.println(message1);
        }
        return message1;

    }

    // 6 Написать метод, который принимает на вход десятичное число (например, 10.75), и возвращает строку “10 руб 75 коп”.
    public static String price(double p) {

        int rub = (int) Math.floor(p);
        int kop = (int) ((p - rub) * 100);
        String message2 = rub + " рублей " + kop + " копеек";

        return message2;
    }
// 7 Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

    public static String weightKg(double w) {
        int kg = (int) Math.floor(w);
        int gr = (int) ((w - kg) * 1000);
        String message3 = kg + " килограмм " + gr + " грамм";

        return message3;
    }

// 8 Написать метод, который принимает на вход 2 параметра -  цену и количество товара (может быть вес товара,
// или количество в штуках). Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static String purchasePrice(double pr, double wg) {
        double ppr = pr * wg;

        return "Стоимость покупки " + ppr + " руб.";
    }

// 9 Написать метод, который принимает на вход необходимые параметры, и печатает чек.

    public static String appleCheck(double price, double quantity) {
        double appleQuantity = price * quantity;

        return "Яблоки" + "\n"
                + "Цена за 1 кг \t \t \t \t " + price(price) + "\n"
                + "Количество \t \t \t \t \t" + weightKg(quantity) + "\n"
                + "___________________________________________________\n"
                + "Сумма к оплате\t\t\t\t" + price(appleQuantity);
    }
// 10 Написать метод, который принимает на вход количество часов работы в день
// и стоимость одного часа работы, и возвращает заработную плату в месяц.

    public static String monthlySalary(double pph, int hours, int days) {
        double salary = pph * hours * days;

        return price(salary);
    }

// 11 Написать метод, который принимает на вход необходимые параметры и печатает
// строку ведомости выдачи зарплаты сотрудникам.

    public static String salarySheet(String name, double pph, int hours, int days) {

        return name + monthlySalary(pph, hours, days);
    }

    // 12
    public static String compareToZero(double x) {
        String message3;
        if (x < 0) {
            message3 = (x + " is negative");
        } else {
            if (x > 0) {
                message3 = (x + " is positive");
            } else {
                message3 = (x + " is zero");
            }
        }
        return message3;
    }

    // 13
//Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число
// рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
    public static int happyNumber(int year) {
        int taus = year / 1000;
        int hund = (year % 1000) / 100;
        int ten = (year % 100) / 10;
        int uni = year % 10;
        int sum = taus + hund + ten + uni;
        if (hund < 100) {
            hund = 0;
        }
        if (ten < 10) {
            ten = 0;
        }
        if (sum > 9) {
            sum = (sum / 10) + (sum % 10);
        }
        return sum;
    }

    // 14 а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.Если разница больше 2,
// необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
    public static String averageVSmedian(double a, double b, double c) {
        double average = (a + b + c) / 3;
        double median;
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            median = b;
        } else if ((b <= a && a <= c) || (c <= a && a <= b)) {
            median = a;
        } else {
            median = c;
        }
        double subs = average - median;
        if (subs > 2) {
            return "Среднее значение " + average + " отличается от медианы " + median + " на " + subs;
        } else {
            return "Среднее значение = " + average + ", медиана = " + median;
        }
    }
//   b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
// 15 Написать метод, который использует методы класса Math, принимает на вход сумму к оплате
// (например, 10.75) и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
    public static String roundPrice(double bank) {
         int bank1 =(int) Math.floor(bank);
         return bank1 + " руб 00 коп";
    }
// 16 Посчитать с помощью методов класса Math
//a = 3
//b = 4
//c = 20
//
//((a * b + c) * ab)
//Вернуть значение с округлением в бОльшую сторону.

    public static double squerRoot(int a1, int b1, int c1){
        double sq = (a1* b1 + c1) * Math.pow(a1,b1);
        sq = Math.sqrt(sq) / Math.PI;
        return Math.ceil(sq);
    }

    public static boolean isLeapYear (int year1){
        boolean leapYear = (year1 % 4)==0;

        return leapYear;
    }
       public static void main(String[] args) {

        String tk = "\n  Task ";
        String line = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";

        print("\u001B[33m" + tk + 2);
        print(line + "\u001B[0m");

        int day = 5;

        System.out.println("Today is " + weeksday(5));
           System.out.println(verifyEquals("Today is Friday", "Today is Friday"));

        print("\u001B[33m" + tk + 3);
        print(line + "\u001B[0m");

        int x = 15;
        int y = 34;
        int z = 6;
//        determineLargest(x, y, z);
        System.out.println(" The largest value = " + determineLargest(x, y, z));
           System.out.println(verifyEquals(" The largest value = " + determineLargest(x, y, z), " The largest value = 34"));
        print("\u001B[33m" + tk + 4);
        print(line + "\u001B[0m");

        //       determineSmallest(8, 14, -21);
        System.out.println("The smallest value = " + determineSmallest(8, 14, -21));
        System.out.println(verifyEquals("The smallest value = " + determineSmallest(8, 14, -21), "The smallest value = -21"));

        print("\u001B[33m" + tk + 5);
        print(line + "\u001B[0m");

        //       averageTemperature(36.7, 38.2, 39.0, 35.8, 37.2);
        System.out.println(averageTemperature(36.7, 38.2, 39.0, 35.8, 37.2));

        print("\u001B[33m" + tk + 6);
        print(line + "\u001B[0m");

        double p = 0.11;
        System.out.println(price(p));

        print("\u001B[33m" + tk + 7);
        print(line + "\u001B[0m");

        double w = 10.013;  //врет 1, 4, 7, 8, 10,11,13
        System.out.println(weightKg(w));

        print("\u001B[33m" + tk + 8);
        print(line + "\u001B[0m");


        System.out.println(purchasePrice(180.50, 1.576));

        print("\u001B[33m" + tk + 9);
        print(line + "\u001B[0m");

        System.out.println(appleCheck(50.13, 3.4));

        print("\u001B[33m" + tk + 10);
        print(line + "\u001B[0m");

        System.out.println(monthlySalary(109.50, 7, 21));

        print("\u001B[33m" + tk + 11);
        print(line + "\u001B[0m");

        String name = "Смирнова Мария Ивановна";
        System.out.println("Март 2022 \n");
        System.out.println(name + "\t\t\t\t\t" + monthlySalary(274.00, 8, 21));
        name = "Серебряков Иван Петрович";
        System.out.println(name + "\t\t\t\t" + monthlySalary(374.00, 8, 21));

        print("\u001B[33m" + tk + 12);
        print(line + "\u001B[0m");

        System.out.println(compareToZero(-5.12));
        String expectedResult = "-5.12 is negative";
        String actualResult = compareToZero(-5.12);
        System.out.println(verifyEquals(expectedResult, actualResult));

        print("\u001B[34m" + tk + 13);
        print(line + "\u001B[0m");

        System.out.println("Happy number - " + happyNumber(1989));

        print("\u001B[34m" + tk + 14);
        print(line + "\u001B[0m");

        System.out.println(averageVSmedian(12, 8, 15));

        print("\u001B[34m" + tk + 15);
        print(line + "\u001B[0m");

        System.out.println(roundPrice(10.75));

        print("\u001B[34m" + tk + 16);
        print(line + "\u001B[0m");

        System.out.println(squerRoot(3,4,20));

           print("\u001B[34m" + tk + 20);
           print(line + "\u001B[0m");

           System.out.println(isLeapYear(2021));
    }

}
