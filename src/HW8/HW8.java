package HW8;

import utils.Utils;

import java.awt.event.TextEvent;
import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {
    // 4  Импортировать статичные методы класса Utils, которые вы будете использовать во время выполнения HW8
// 5 Создать объекты типа Integer, Double, String и присвоить им такие же значения, как и переменным класса HW8_1
    static Integer intHW = 5;
    static Double doubHW = 5.5;
    static String strHW = "Spring";

    public static int[] getArray5(int a, int b, int c, int d, int e) {

        return new int[]{a, b, c, d, e};
    }

    // 8 Написать метод, который принимает на вход 5 чисел типа double,  и возвращает массив из этих же чисел
    public static double[] getArray5(double a, double b, double c, double d, double e) {

        return new double[]{a, b, c, d, e};
    }

    // 9 Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов
    public static String[] getArray5(String s1, String s2, String s3, String s4, String s5) {

        return new String[]{s1, s2, s3, s4, s5};
    }

    // 10 Написать метод, который принимает на вход массив целых чисел,  и возвращает массив тех же чисел, умноженных на 2.5
    public static double[] getNewArray(int[] arrNum5) {
        double[] newArray = new double[arrNum5.length];
        for (int i = 0; i < arrNum5.length; i++) {
            newArray[i] = arrNum5[i] * 2.5;
        }

        return newArray;
    }

    // 11 Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает количество четных чисел в этом массиве
    public static int getEvenNum(int[] arrNum) {
        int countEven = 0;
        if (arrNum.length > 0) {
            for (int i = 0; i < arrNum.length; i++) {
                if (arrNum[i] % 2 == 0) {
                    countEven++;
                }
            }
        }
        return countEven;
    }

    // 12 Написать метод, который принимает на вход массив целых положительных чисел,  и возвращает массив нечетных чисел
    public static int[] getOddArray(int[] arrNum) {
        int countOdd = 0;
        if (arrNum.length > 0) {
            for (int i = 0; i < arrNum.length; i++) {
                if (arrNum[i] < 0) {
                    System.out.println("Error - negative number");
                } else if (arrNum[i] % 2 != 0) {
                    countOdd++;
                }
            }
        }
        int[] oddArray = new int[countOdd];
        countOdd = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] % 2 != 0) {
                oddArray[countOdd] = arrNum[i];
                countOdd++;
            }
        }
        return oddArray;
    }

    // 13 Написать метод, который принимает на вход масив целых чисел,  и возвращает массив значений true или false, если числа больше 10
    public static String[] getBoolArray(int[] arrNum) {
        String[] boolArray = new String[arrNum.length];
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] > 10) {
                boolArray[i] = "true";
            } else {
                boolArray[i] = "false";
            }
        }
        return boolArray;
    }

    // 14 Написать метод, который принимает на вход массив слов,  и возвращает строку, состоящую из этих слов
    public static String getString(String[] getArray5) {
        if (getArray5 ==null|| getArray5.length==0){
            return null;
        }
            String str = getArray5[0] + getArray5[1] + getArray5[2] + getArray5[3] + getArray5[4];

        return str;
    }
    public static String  world (String[] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];

        }
        return result;

    }

    // 15 Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
    public static int getSum(int[] array15) {
        int sum = 0;
        for (int i = array15.length / 2; i < array15.length; i++) {
                sum += array15[i];
        }
        return sum;
    }

    // 16 Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно, и возвращает
// таблицу умножения на это число в виде массива. Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
    public static int[] getMultipliedNumArr(int m) {
        int[] multiNumArray = new int[11];
        if (m > 1 && m < 10) {
            for (int i = 0; i < multiNumArray.length; i++) {
                multiNumArray[i] = i * m;
                //   multiNumArray[i]++;
            }
        } else {
            return new int []{};
        }
        return multiNumArray;
    }

    // 17 Написать метод, который принимает массив целых чисел и возвращает массив четных чисел, если четных чисел больше,
// или массив нечетных чисел, если нечетных чисел больше.
    public static int[] getMoreNumArrays(int[] array17) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array17.length; i++) {
            if (array17[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        int[] arrayEven = new int[countEven];
        int[] arrayOdd = new int[countOdd];
        countEven = 0;
        countOdd = 0;
        for (int i = 0; i < array17.length; i++) {
            if (array17[i] % 2 == 0) {
                arrayEven[countEven] = array17[i];
                countEven++;
            } else {
                arrayOdd[countOdd] = array17[i];
                countOdd++;
            }
        }
        if (arrayEven.length > (array17.length / 2) && arrayEven.length != arrayOdd.length) {

            return arrayEven;
        } else if (arrayEven.length == arrayOdd.length) {

            return new int[]{};
        } else {

            return arrayOdd;
        }
    }

    // 18 Написать метод, который принимает на вход длину массива и генерирует массив случаейных положительных чисел от 0 до 100 исключительно.
    public static int[] getRandomArray(int l) {
        int[] randomArray = new int[l];
        if (l > 0) {
            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = Utils.getRandomInt(99, 1);
            }
        } else {
            System.out.println("Error");
        }
        return randomArray;
    }
// 19 Написать метод, который принимает на вход длину массива l и количество знаков d (однозначные, двузначные, трехзначные и тд числа),
// и генерирует массив случайных целых положительных чисел длины l, в котором все числа имеют количество знаков d

    public static int[] getRandomNumArray(int l, int d) {
        int[] randomArray2 = new int[l];
        if (l > 0) {
            for (int i = 0; i < randomArray2.length; i++) {
                randomArray2[i] = (int) ((Math.random() * (0.9 - 0.1) + 0.1) * (Math.pow(10.0, d)));
            }
        } else {
            return null;
        }
        return randomArray2;

    }

    // 20 Написать метод, который принимает на вход массив целых положительных чисел, и возвращает массив только двузначных чисел.
// ПРоверить работу метода на массиве из задания 18.
    public static int[] getTwoDigitArray(int[] array18) {
        int countTDNum = 0;
        if (array18.length > 0) {
            for (int i = 0; i < array18.length; i++) {
                if (array18[i] > 9 && array18[i] < 100) {
                    countTDNum++;
                }
            }
        }
        int[] twoDigitArray = new int[countTDNum];
        countTDNum = 0;
        for (int i = 0; i < array18.length; i++) {
            if (array18[i] > 9 && array18[i] < 100) {
                twoDigitArray[countTDNum] = array18[i];
                countTDNum++;
            }
        }

        return twoDigitArray;
    }

    // 21 Написать метод, который принимает на вход массив целых положительных двузначных чисел, и возвращает массив разниц между десятками и единицами
    public static int[] getDifferenceArray(int[] array20) {
        int[] differenceArray = new int[array20.length];
        if (array20.length > 0) {
            for (int i = 0; i < array20.length; i++) {
                int diff = (int) ((Math.floor(array20[i] / 10)) - (array20[i] % 10));
                differenceArray[i] = diff;
            }
        }
        return differenceArray;
    }

    // 22 Написать метод, который принимает массив из 11 целых положительных чисел от 0 до 9, и возвращает массив, который содержит номер телефона,
// состоящий из этих чисел,  и название страны, которой номер принадлежит.
    public static String[] getPhoneNumber(int[] array21) {
        if(array21 == null || array21.length == 0){
            return null;
        }
        String[] phoneNumber = new String[2];

            for (int i = 0; i < array21.length; i++) {
                if (array21[i] >= 0){
                phoneNumber[1] = "\""+ array21[0] + "(" + array21[1] + array21[2] + array21[3] + ")" + array21[4] + array21[5] +
                       + array21[6] + "-" + array21[7] + array21[8] + "-" + array21[9] + array21[10] + "\"";
                if (array21[0] == 1) {
                    phoneNumber[0] = "USA";
                } else if (array21[0] == 7){
                    phoneNumber[0] ="Russia";
                } else {
                    return null;
                }

            }

        }
        return phoneNumber;
    }

    // 23 Написать метод, который принимает массив целых положительных чисел больше 0, и возвращает массив уникальных чисел.
    public static int[] getUniNumArray(int[] array23) {

        if(array23 == null && array23.length == 0){ return null;
        }
        for (int i = 0; i < array23.length; i++) {
            if (array23[i] < 0) {
                return null;
            }
        }
        int countUn = 0;
        for (int i = 0; i < array23.length; i++) {
            boolean isUnic = true;
            for(int j = 0; j < array23.length; j++){
            if (array23[i] == array23[j] && i !=j) {
                isUnic = false;
                break;
            }
            }
            if (isUnic){
                countUn ++;
            }
        }
        int[] uniNumArray = new int[countUn];
        countUn = 0;
        for (int i = 0; i < array23.length; i++) {
            boolean isUnic = true;
            for(int j = 0; j < array23.length; j++){
            if (array23[i] == array23[j] && i != j) {
           isUnic = false;
           break;
            }
            }
            if(isUnic){
                uniNumArray[countUn] = array23[i];
                countUn++;
            }
        }
        return uniNumArray;
    }

    // 25 Написать метод, который принимает на вход массив целых положительных чисел, и 2 целых положительных числа (значения индексов).
    // Метод возвращает массив, который содержит только числа из первого массива в промежутке между индексами.
    //Например:        //method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
    public static int[] getGapNumber(int[] array25, int start, int end) {
        int[] gapNumber = new int[(end - start) + 1];
        int index = 0;
        if (array25.length > 0 && start >= 0 && start < end && end < array25.length) {
            for (int i = start; i < gapNumber.length +1 ; i++) {
                gapNumber[index] = array25[i];
                index++;

            } return gapNumber;
        } else {
          return null;
        }

    }

   //23 Другое решение (более правильное)
    public static int[] getUni (int[]array){
        int[]getUni = {};
        int count = 0;
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if (array[i]==array[j]){
                    array[j] = Integer.MIN_VALUE;           //отсекаем повторяющиеся числа, присваивая им какое-то невозможное значение

                }
            }
        }
       for(int i = 0; i < array.length; i++){
           if(array[i] == Integer.MIN_VALUE){
               count++;
           }
       }
       getUni = new int [array.length - count];
       count = 0;
       for(int i = 0; i < getUni.length; i++){
           if (array[i] != Integer.MIN_VALUE){
           getUni[count] = array[i];
           count++;
           }
       }
       return getUni;
    }

// 24 Написать метод, который принимает на вход массив целых положительных чисел, и возвращает количество уникальных и неуникальных
// элементов в этом массиве
   public static int [] getNumberOfUniNotuni(int[]array){
        int count = 0;
        if(array.length > 0){
            for (int i = 0; i < array.length; i++){
                if(array[i] >= 0){
                for (int j = i + 1; j < array.length; j++){
                    if(array[i] == array[j]) {
                        array [j] = -1;
                        count++;
                    }
                    }
                }
            }
            return new int []{array.length - count, count};
        }
        else return new int[]{};
   }

    public static int sumArray(int[]array) {
        if (array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
              //  if(array[i] >= 0){
                sum += array[i];
//            } else {
//                 sum = array[i]
                }
            return sum;
      //  }
        }
        return 0;
    }


    public static void main(String[] args) {

// 6 Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички:
        print(task + 6);
        line(line);

        tabLine();
        System.out.println("|\t\tHW8\t\t|\t\t\tHW8_1\t\t|\t\t\tareEquals?\t\t\t|");
        tabLine();
        System.out.println("|\t\t" + intHW + "\t\t|\t\t\t" + HW8_1.intHW1 + "\t\t\t|\t\t\t\t" + intHW.equals(HW8_1.intHW1) + "\t\t\t|");
        tabLine();
        System.out.println("|\t\t" + doubHW + "\t\t|\t\t\t" + HW8_1.doubHW1 + "\t\t\t|\t\t\t\t" + doubHW.equals(HW8_1.doubHW1) + "\t\t\t|");
        tabLine();
        System.out.println("|\t" + strHW + "\t\t|\t\t\t" + HW8_1.strHW1 + "\t\t|\t\t\t\t" + strHW.equals(HW8_1.strHW1) + "\t\t\t|");
        tabLine();

        print(task + 7);
        line(line);

        System.out.println(Arrays.toString(getArray5(3, 4, 7, 2, 6)));
        // System.out.println(arrNum5[3]);

        print(task + 8);
        line(line);
        System.out.println(getArray5(4, 5, 3, 2, 1)[0]);
        System.out.println(Arrays.toString(getArray5(2.3, 4.6, 1.3, 9.9, 0.3)));

        print(task + 9);
        line(line);

        System.out.println(Arrays.toString(getArray5("Please", "help", "me", "with", "Java")));
        //System.out.println(Arrays.toString(world( String [] arr = new String[]{"Please", "help", "me", "with", "Java"})));
        print(task + 10);
        line(line);

        System.out.println(Arrays.toString(getNewArray(getArray5(3, 4, 2, 6, 7))));

        print(task + 11);
        line(line);

        System.out.println(getEvenNum(getArray5(2, 4, 7, 1, 8)));

        print(task + 12);
        line(line);
        System.out.println(Arrays.toString(getOddArray(getArray5(2, 5, 9, 4, 7))));

        print(task2 + 13);
        line(line);
        System.out.println(Arrays.toString(getBoolArray(getArray5(2, 16, 44, 1, 38))));

        print(task2 + 14);
        line(line);
        System.out.println(getString(getArray5("Please ", "help ", "me ", "with ", "Java!")));

        print(task2 + 15);
        line(line);
        System.out.println(getSum(new int[]{12, 14, 2, 6, 10, 3, 7}));
        //   System.out.println(getSum(new int []{Utils.getRandomInt(24, 6)}) + Arrays.toString(new int[]{Utils.getRandomInt(24, 6)}));

        print(task2 + 16);
        line(line);
        System.out.println(Arrays.toString(getMultipliedNumArr(5)));
        System.out.println(Arrays.toString(getMultipliedNumArr(Utils.getRandomInt(10, 1))));

        print(task2 + 17);
        line(line);

        System.out.println(Arrays.toString(getMoreNumArrays(new int[]{3, 6, 5, 9, 3, 2})));

        print(task2 + 18);
        line(line);

        System.out.println(Arrays.toString(getRandomArray(5)));

        print(task2 + 19);
        line(line);

        System.out.println(Arrays.toString(getRandomNumArray(5, 5)));

        print(task2 + 20);
        line(line);

        System.out.println(Arrays.toString(getTwoDigitArray(getRandomArray(5))));
        System.out.println(Arrays.toString(getTwoDigitArray(new int[]{2, 77, 42, 8, 100, 764, 3, 9999})));

        print(task2 + 21);
        line(line);
        System.out.println(Arrays.toString(new int[]{25, 64, 10, 83, 55}));
        System.out.println(Arrays.toString(getDifferenceArray(new int[]{25, 64, 10, 83, 55})));

        print(task3 + 22);
        line(line);
        System.out.println(Arrays.toString(getPhoneNumber(new int[]{1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7})));

        print(task3 + 23);
        line(line);
        System.out.println(Arrays.toString(new int[]{2, 5, 9, 45, 2, 13, 45, 46}));
        System.out.println(Arrays.toString(getUniNumArray(new int[]{2, 5, 9, 45, 2, 13, 45, 46})));
        System.out.println(Arrays.toString(getUni(new int[]{2, 5, 9, 45, 2, 13, 45, 46})));

        print(task3 + 24);
        line(line);
        System.out.println(Arrays.toString(new int[]{2, 4, -5, 6, 2, -2, 4, 6, 2}));
        System.out.println(Arrays.toString(getNumberOfUniNotuni(new int[]{2, 4, 6, 2, 2, 4, 6, 2} )));

        print(task3 + 25);
        line(line);
        System.out.println(Arrays.toString(new int[]{3, 6, 12, 78, 4, 9, 24}));
        System.out.println(Arrays.toString(getGapNumber(new int[]{3, 6, 12, 78, 4, 9, 24}, 1, 5)));


        System.out.println(sumArray( new int[]{-7, -3}));
    }

}
