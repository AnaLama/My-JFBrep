package homework;

public class HW6 {

    public static int num1(int num) {
        return num;
    }

    public static void print(String task) {
        System.out.println(task);
    }

    public static void line(String line) {
        System.out.println(line);
    }

// 10 Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных
// чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.

    public static void seq(double start, double end, double step) {
        if(start < end && step > 0){
            for (start = start; start < end; start += step) {
            System.out.println(start);
            }
        } else if(start > end && step < 0){
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    // 11 Написать метод, который принимает параметр l и печатает  последовательность четных чисел от нуля. Длина последовательности = l.
    public static void seq1(int l) {
        int end = 0;
        for (double i = 0; end < l; i += 2) {
            System.out.println(i);
            end++;
        }
    }

    // 12 Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
    public static void pow(int n) {
        int a = 2;
        for (int i = 1; i < (n + 1); i++) {
            System.out.println(Math.pow(a, i));
        }
    }

// 16 Написать метод, который принимает параметры n, m,l, и печатает последовательность нечетных чисел начиная с числа n, с шагом m,
// длина последовательности l.
    public static void seq2 (int n, int m, int l){
        int e = 0;
        for(int i = n; e < l; i +=m){
            if(i%2==1){
                System.out.println(i);
                e++;
            }
        }
    }
// 17 Сгенерируйте и распечатайте последовательность по формуле: n + 1 = n + 2
    public static void seq3 (int n){
        int l = n +5;
        for(; n < l; n++){
            System.out.println("[" + (n + 1) + "] = " + (n + 2));
        }
    }

// 18 Написать метод, который принимает параметры l, n, и печатает последовательность чисел, начиная с числа n, по формуле для n + 1 члена последовательности:
//n + 1 = 2n Длина последовательности l.
    public static void seq4 (int n, int l){
        if(n < l){
            System.out.println("[" + (n + 1) + "] = " + n);
                for(; n < l; n++) {
                    System.out.println("[" + (n + 1) + "] = " + (n * 2));
                }
        }else {
                System.out.println("Invalid data");
            }
        }


// 20
    public static void sistem(double x){
        if (x > 1.5){
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if(x<=1.5 && x >= 0){
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int num = 1;
        num++;
        String line = "\n ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \u001B[0m";
        String task = "\u001B[33m Task # ";

         sistem(-0.5);

        // task 1
        print(task + num1(num));
        line(line);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

// 2  Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        print(task + num1(num ));
        line(line);

        for (int i = 9; i > -1; i--) {
            System.out.println(i);
        }
// 3 Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
        print(task + num1(num + 2));
        line(line);

        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);
        }
        // 4 Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
        print(task + num1(num + 3));
        line(line);

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
// 5 Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
        print(task + num1(num + 4));
        line(line);

        for (double i = 12; i < 14; i += 0.1) {
            System.out.println(String.format("%.1f", i));
        }
// 6 Распечатать последовательность четных чисел от 215 до 237 включительно
        print(task + num1(num + 5));
        line(line);

        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
// 7 Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        print(task + num1(num + 6));
        line(line);

        for (int i = 7; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
// 8 Распечатать последовательность которая начинается с минимального значения типа данных short и заканчивается
// максимальным значением short. Числа в последовательности должны быть кратны 15001.
        print(task + num1(num + 7));
        line(line);

        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }
// 9 Распечатать последовательность чисел в промежутке от -10 до 34 включительно. Числа, кратные 11, должны быть
// распечатаны синим цветом. Числа, кратные 12, должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.
        print(task + num1(num + 8));
        line(line);

        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            }
        }
// 10 Написать метод, который принимает на вход параметры start,  end, step, и печатает последовательность десятичных
// чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.
        print(task + num1(num + 9));
        line(line);

        seq(10.5, 20.75, 1.29);   //happy path
        seq(15.9, 0, -1.45);      // happy path
        seq(15.9, 0, 1);          // negative

        print(task + num1(num + 10));
        line(line);
           seq1(5);

        print(task + num1(num + 11));
        line(line);

        int n = 5;
        pow(n);

// 13 Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
        print(task + num1(num + 12));
        line(line);

        for (int i = 0; i < 12; i++) {
            if (i < 10) {
                System.out.print(i);
            }
            if (i == 10) {
                System.out.print("00");
            }

            for (i = 11; i < 111; i += 11) {
                if (i < 100) {
                    System.out.print(i);
                }
                if (i == 110) {
                    System.out.print("000");
                }
            }
            for (i = 111; i < 1111; i += 111) {
                if (i < 1000) {
                    System.out.print(i);
                }
                if (i == 1110) {
                    System.out.print("0000");
                }

            }
            for (i = 1111; i < 11110; i += 1111) {
                if (i < 10000) {
                    System.out.print(i);
                }
            }
        }
// 14 Распечатайте последовательность чисел: 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        print("\n" + task + num1(num + 13));
        line(line);
        for(int i = 0; i< 6; i+=1){
            System.out.print(i +", ");
            if(i>0){
            System.out.print(i*(-1) + ", ");
            }
        }
// 15 Распечатать последовательность чисел: 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
        print("\n" + task + num1(num + 14));
        line(line);
        for(int i = 0; i < 26; i++){
            if(i%3 == 0 || i % 5 == 0)
            System.out.print(i + ", ");
        }

        print("\n" + task + num1(num + 15));
        line(line);

        seq2(2, 3, 5);

// 17 Сгенерируйте и распечатайте последовательность по формуле: n + 1 = n + 2
        print(task + num1(num + 16));
        line(line);

        seq3(1);

//18
        print(task + num1(num + 17));
        line(line);

        seq4(2, 5);

// 19 Сгенерируйте последовательность целых положительных  двузначных чисел, в которых разница между первой цифрой (десятки) и
// второй цифрой (единицы) не превышает 3.
        print(task + num1(num + 18));
        line(line);
        for(int i = 10; i < 100; i++){
            if(Math.abs((i / 10 -  i%10))  < 4){
                System.out.print(i + ", ");
            }
        }

        print("\n" + task + num1(num + 19));
        line(line);

        sistem(2);

    }
}
