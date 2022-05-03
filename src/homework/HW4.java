package homework;

import com.sun.source.util.SourcePositions;

public class HW4 {
    public static void print(String text) {
        System.out.println(text);
    }

    public static int devision(int a, int b) {
       int res = a / b;
    return res ;}

    public static int reminder(int a, int b) {
        int remind = a % b;
    return remind;}

    public static void main(String[] args) {

        String tk = "\n  Task " + "\u001B[0m";
        String line = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n";
        String line1 = "___________________________________________________________________";

        //    public static final String ANSI_RESET = ;
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";


        print("\u001B[33m" + tk + 1);
        print(line + "\u001B[0m");

        print("\u001B[33m" + tk + 3);
        print(line + "\u001B[0m");
        //1) (2 = 2) И (7 = 7);
        int i = 2;
        int ii = 7;
        if ((i == 2) && (ii == 7)) {
            System.out.println("1)" + "true");
        }

//2) Не(15 < 3);
        int x = 15;
        int x1 = 3;
        Boolean boo = !(x < x1) == (x > x1);
        System.out.println("2)" + boo);

        //"Сосна = Дуб или Вишня = клен";
        String pine = "Сосна";
        String cherry = "Вишня";
        if (pine == "Дуб" && cherry == "Клен") {
            print("3)" + "True");
        } else {
            print("3)" + "False");
        }

        //"He (Сосна = Дуб)

        String text5 = "1 * 1 = 1 (true)";
        String text6 = "(6/2 = 3) || (7 * 5 = 20) -> 1 + 0 = 1 (true or false)";

        //6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        String eye = "Видеть";
        int et = 3;
        int et1 = 2;
        if (eye == "Видеть" && et > et1) {
            print("6)" + "True");
        }


        print("\u001B[33m" + tk + 4);
        print(line + "\u001B[0m");

        System.out.println();

        print("\u001B[33m" + tk + 5);
        print(line + "\u001B[0m");
        ;

        int and = 30;
        int sve = 25;
        int nat = 27;

        if (and > sve && nat > sve) {
            System.out.println("a)" + "Андрей старше Светы. Наташа старше Светы");
        } else {
            System.out.println("Fail");
        }

//б) На полке стоят учебники, а на столе лежат справочники.
        String shelv = "стоят учебники";
        String table = "лежат справочники";

        if (shelv.equals("стоят учебники") && table.equals("лежат справочники")) {
            print("б) На полке стоят учебники, а на столе лежат справочники");
        } else {
            print("False");
        }

//в) БОльшая часть детей — девочки. Остальные - мальчики.
        int children = 100;
        int girls = 60;
        int boys = children - girls;
        if (girls + boys == children && girls > (children / 2)) {
            print("в) БОльшая часть детей — девочки");
        } else {
            print("БОльшая часть детей — мальчики");
        }

        print("\u001B[33m" + tk + 9);
        print(line + "\u001B[0m");

//Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age = 6;
        String adult = "Adult";
        String child = "Child";

        if (age > 0) {
            if (age >= 18) {
                print(adult);
            } else {
                print(child);
            }
        } else {
            print("Ошибка");
        }

//Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String ground = "dry";

        if (ground == "dry") {
            print("Если земля сухая, значит нет дождя");
        } else {
            print("Если земля мокрая, то идет дождь");
        }
//Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String ground1 = "wet8";
        String ground2 = "0";
        if (ground2 == "dry") {
            print("Если земля сухая, значит, нет дождя");
        } else if (ground1 == "wet") {
            print("Если земля мокрая, то идет дождь");
        } else {
            print("идет снег");
        }

        //Если сегодня суббота, значит, завтра воскресенье.
        // Если сегодня пятница, значит, вчера был четверг. Иначе вчера был не четверг, а завтра - не воскресенье
        String today = "Sat";
        String tomorrow = "Sunday";
        String today1 = "Fri";
        String yesterday = "Thursday";

        if (today == "Saturday") {
            print(tomorrow);
            if (today1 == "Friday") {
                print(yesterday);
            }
        } else {
            print("вчера был не четверг, а завтра - не воскресенье");
        }

//Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
        int chAge = 139;
        String edu = "ты  закончил школу";

        if (chAge > 0 && chAge < 120) {
            if (chAge >= 18 || edu.equals("ты закончил школу")) {
                print("Ты можешь не жить с родителями");
            } else {
                print("живи с родителями");
            }
        } else {
            print("Ошибка возраста");
        }


        print("\u001B[34m" + tk + 10);
        print(line + "\u001B[0m");
//Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.

        int a = 5;
        if (a % 2 == 0) {
            a = a * 2;
        } else {
            a = a * a;
        }
        ;
        System.out.println(a);
        System.out.println("If-Else");

        print("\u001B[34m" + tk + 11);
        print(line + "\u001B[0m");
//Голосовать можно с 18 лет, Машину можно водить с 16 лет, В школу можно идти с 5 лет

        int age1 = 32;
        String s1 = "Можно идти в школу";
        String s2 = "Можно водить машину";
        String s3 = "Можно голосовать";

        if (age >= 5) {
            print(s1);
        }
        if (age >= 16) {
            print(s2);
        }
        if (age >= 18) {
            print(s3);
        }

        System.out.println("If-Then");

        print("\u001B[34m" + tk + 12);
        print(line + "\u001B[0m");

        int score = 3;
        String t1 = "Выдать похвальную грамоту";
        String t2 = " Перевести в следующий класс";
        String t3 = "Дать задание на лето и";
        String t4 = "Вызвать родителей и оставить на второй год";

        if (score == 5) {
            print(t1);
        }
        if (score == 4) {
            print(t2);
        }
        if (score == 3) {
            print(t3 + t2);
        }
        if (score == 2) {
            print(t4);
        }

        System.out.println("If-Then");

        print("\u001B[34m" + tk + 13);
        print(line + "\u001B[0m");
        int b, c;
        b = -5;
        c = 30;
        int result = 0;

        if (b % 3 == 0 && c % 3 == 0) {
            result = b + c;
            System.out.println(result);
        } else if (b % 5 == 0 && c % 5 == 0) {
            result = (b - c);
            System.out.println(result);
        } else if (b % 2 == 0 && c % 2 == 0) {
            if (b > 0 || c > 0) {
                result = b * c;
                System.out.println(result);
            } else {
                result = result * (-1);
                System.out.println(result);
            }
        } else {
            print("Ошибка");

        }

        print("\u001B[34m" + tk + 14);
        print(line + "\u001B[0m");
//Результат деления k на l = …, а остаток от деления  = …
//Результат деления k на m = …, а остаток от деления  = …
//Результат деления l на m = …, а остаток от деления  = …
//Результат деления m на k = …, а остаток от деления  = …

        String text1 = "Результат деления";
        String text2 = ", а остаток от деления  =";
        int k = 14;
        int l = 7;
        int m = 2;
        System.out.println(text1 + " k на l =" + devision(k, l) + text2 + reminder(k,l));
        System.out.println(text1 + " k на m =" + devision(k, m) + text2 + reminder(k,m));
        System.out.println(text1 + " l на m =" + devision(l, m) + text2 + reminder(l,m));
        System.out.println(text1 + " m на k =" + devision(m, k) + text2 + reminder(m,k));

        print("\u001B[34m" + tk + 15);
        print(line + "\u001B[0m");

//Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.

        int apple = 60;
        int student = 40;

        System.out.println("Если " + apple + " яблок(а) поделить на " + student + " учеников, то каждый ученик получит по " + devision(apple, student)
                + " яблок(a), и " + reminder(apple, student) + " яблок(а) останется учителю");

        print("\u001B[35m" + tk + 16);
        print(line + "\u001B[0m");
        


    }


}
