package homework;

import utils.Utils;

import javax.swing.text.Utilities;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;


public class HW7 {


  public static void print(String task) {
    System.out.println(task);
  }
  public static void line(String line){
    System.out.println(line);
  }

// 15
   public static int getNumbersOfGrey(String[] catsColors, String color) {
     int sumGrey = 0;
     for (int i = 0; i < catsColors.length; i++) {
       if (catsColors[i].equals(color)) {
         sumGrey++;
       }
     }
     return sumGrey;
   }

  // 18
  public static double getAverage (int[] age){
    int allAges = 0;
    for(int i = 0; i < age.length; i++){
      allAges += age[i];
    }
    return (double) allAges / age.length;
  }

// 21 Создать метод, который принимает на вход массив int,  и возвращает минимальное значение, максимальное значение
// и среднее значение всех чисел массива. Проверить работу метода на массиве из задания 20.
   public static void getThree (int [] arr20){
    int min = arr20[0];
    int max = arr20[0];
    double sum = 0;
    for(int i = 0; i < arr20.length; i++){
    sum +=arr20[i];
    if (min > arr20[i]){
      min = arr20[i];
    }
    if (max < arr20[i]){
      max = arr20[i];
    }
   }
     System.out.println("max = " + max);
     System.out.println("min = " + min);
     System.out.println("average = " + sum / arr20.length);
   }

  // 22 Создать массив четных чисел и массив нечетных
// чисел из элементов массива из задания 20.

  public static int [][] getEvenOddArr (int []arr20){
    int counterEven = 0;
    int counterOdd = 0;
    for(int i = 0; i < arr20.length; i++){
      if(arr20[i] % 2 == 0){
        counterEven++;
      } else {
        counterOdd++;
      }
    }
    int []arrayEven = new int [counterEven];
    int []arrayOdd = new int [counterOdd];
    counterEven = 0;
    counterOdd = 0;
    for(int i = 0; i < arr20.length; i++){
      if(arr20[i] % 2 == 0){
        arrayEven[counterEven] = arr20[i];
        counterEven++;
      } else {
        arrayOdd[counterOdd] = arr20[i];
        counterOdd++;
      }
    } return new int [][]{arrayEven, arrayOdd};
  }


    public static void main(String[] args) {
// 1 Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

      String[] catsNames = new String [8];
      catsNames[0] = "Мурзик";
      catsNames[1] = "Черныш";
      catsNames[2] = "Фунтик";
      catsNames[3] = "Кекс";
      catsNames[4] = "Рыжик";
      catsNames[5] = "Гарфилд";
      catsNames[6] = "Васька";
      catsNames[7] = "Мурка";

      String[] catsColors = new String[8];
      catsColors[0] = "Grey";
      catsColors[1] = "Black";
      catsColors[2] = "Grey";
      catsColors[3] = "Grey";
      catsColors[4] = "Red";
      catsColors[5] = "Grey";
      catsColors[6] = "Red";
      catsColors[7] = "Grey";

// Создать массив catsAges и заполнить его любыми значениями.
      int[] catsAges = new int[8];
      catsAges[0] = 4;
      catsAges[1] = 2;
      catsAges[2] = 5;
      catsAges[3] = 1;
      catsAges[4] = 2;
      catsAges[5] = 7;
      catsAges[6] = 6;
      catsAges[7] = 3;

// Создать массив isCatRed и заполнить его соответствующими значениями
      boolean[] isCatRed = new boolean[8];
      isCatRed[0] = false;
      isCatRed[1] = false;
      isCatRed[2] = false;
      isCatRed[3] = false;
      isCatRed[4] = true;
      isCatRed[5] = false;
      isCatRed[6] = true;
      isCatRed[7] = false;

// 6 Распечатать для массивов catsNames и catsColors: имя кота в коробке с номером 6
//имена котов из коробок с четными индексами
//имена котов из коробок, чьи индексы кратны 4
//цвет котов из коробок с нечетными индексами
//цвет котов из коробок, чьи индексы кратны 3

      String line = "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ \u001B[0m";
      String task = "\n \u001B[33m Task # ";
      String task2 = "\n \u001B[34m Task #";

      print(task + 6);
      line(line);

      System.out.println(catsNames[6]);

      line(line);
      for (int i = 0; i < 8; i++){
        if (i%2 == 0){
          System.out.println(i + " " + catsNames[i]);
        }
      }

      line(line);
      for(int i = 0; i < 8; i++){
        if(i%4 == 0){
          System.out.println(i + " - " + catsNames[i]);
        }
      }

      line(line);
      for (int i = 0; i < 8; i++){
        if (i%2 != 0){
          System.out.println(i + " - " +catsColors[i]);
        }
      }

      line(line);
      for (int i = 0; i < 8; i++){
        if (i%3 == 0){
          System.out.println(i + " - " +catsColors[i]);
        }
      }
// 7 Распечатать “Накорми кота!” для всех серых котов
      print(task + 7);
      line(line);

      for (int i = 0; i < 8; i++){
        if (catsColors[i].equals("Grey") ){
          System.out.println(catsColors[i] + " - Накорми кота!");
        }
      }
// 8 Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
      print(task + 8);
      line(line);

      for(int i = 0; i < 8; i++){
        if (catsAges[i] < 0 || catsAges[i] > 50){
          System.out.println("Error");
        } else   if(catsAges[i] < 2){
          System.out.println("Отнеси кота из " + i + " коробки на прививку!");
        }
      }
// 9 Для кота в последней коробке распечатать имя, цвет, возраст
      print(task + 9);
      line(line);

      System.out.println(catsNames[7] + " " + catsColors[7] + " " + catsAges[7] + " y.o");

// 10 Распечатать имена всех котов, чей возраст больше 2 лет
      print(task + 10);
      line(line);

      for(int i = 0; i < 8; i++){
        if (catsAges[i] > 2){
          System.out.println(catsNames[i]);
        }
        }
// 11 Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
      print(task + 11);
      line(line);
      if(catsNames.length == isCatRed.length && catsNames.length != 0)
      for(int i = 0; i < 8; i++){
        if(catsNames[i].equals("Рыжик") && isCatRed[i] == true){
          System.out.println("Накорми кота из " + i +" коробки");
        }
      }
// 12 Распечатать средний возраст котов из массива catsAges
      print(task2 + 12);
      line(line);

        int sum = IntStream.of(catsAges).sum();
        double average = sum / (double)(catsAges.length);
        System.out.println(average);

// 13 Распечатать возраст самого молодого кота
      print(task2 + 13);
      line(line);
      int min = catsAges[0];  // можно сразу присвоить минимуму максимально возможный возраст
      for(int i = 0; i < catsAges.length; i++){
        if (catsAges[i] < min){
          min = catsAges[i];
        } //если присваиваем нулевой элемент минимуму, то сначала лучше проверить не пустой ли массив
      }
      System.out.println(" Minimum age is  " + min + " y.o");

// 14 Распечатать возраст самого старого кота
      print(task2 + 14);
      line(line);
      int max = Integer.MIN_VALUE;
      for(int i = 0; i < catsAges.length; i++){
        if (catsAges[i] > max){
          max = catsAges[i];
        }
      }

//      var max = Arrays.stream(catsAges).max();
      System.out.println(" Maximum age is " + max + " y.o");

// 15 Распечатать количество серых котов
      print(task2 + 15);
      line(line);

      System.out.println(getNumbersOfGrey(catsColors, "Grey"));

// 16 Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
      print(task2 + 16);
      line(line);

      for(int i = 0; i < catsAges.length; i++){
        if (i %2 == 0 && catsAges[i] < 3){
          System.out.println(catsNames[i]);
        }
      }
// 17 Создать массив четных положительных чисел, значения которых не больше 10. (заполняем значения с помощью цикла for)
      print(task2 + 17);
      line(line);

      int [] evenNumbers = new int [8];

      int evenNum = 0;
      for(int i = 0; i < evenNumbers.length; i++){
        if (evenNum % 2 == 0 && evenNum < 11){
          evenNumbers [i] = evenNum;
          evenNum+=2;
          System.out.println("[" + i +"] = " + evenNumbers [i]);
        }

      }
// 18 Написать метод, который принимает на вход массив int, и возвращает среднее значение.
// Проверить работу метода тестом, если параметр - массив catsAges
      print(task2 + 18);
      line(line);

      System.out.println(getAverage(catsAges));

// 19 Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
      print(task2 + 19);
      line(line);

      int [] oddNumbers = new int[50];
      int oddNum = -999;
      for(int i = 0; i < oddNumbers.length; i++){
        if(oddNum % 2 != 0 && oddNum < -900){
          oddNumbers[i] = oddNum;
          oddNum +=2;

          System.out.println("[" + i +"] = " + oddNumbers [i]);
        }
      }



//20 Создать массив из 10 случайных положительных целых чисел
      print(task2 + 20);
      line(line);

      int []randomNum = new int[10];
      for(int i = 0; i < randomNum.length; i++){
        randomNum[i] =(int) (Math.random()* Integer.MAX_VALUE);
        System.out.println(randomNum[i]);
      }
      System.out.println(Arrays.toString(randomNum));

 // 21
      print(task2 + 21);
      line(line);

      getThree(randomNum);
      getThree(catsAges);

// 22 Создать массив четных чисел и массив нечетных
// чисел из элементов массива из задания 20.
      print(task2 + 22);
      line(line);

      System.out.println(Arrays.deepToString(getEvenOddArr(randomNum)));

// 23 Создать двумерный массив, который состоит из имен, возрастов, цветов котов:
//    Распечатать все данные котов в коробках с четными индексами, используя двумерный массив.
      print(task2 + 23);
      line(line);

      String [][] cats = new String[][]{
              {"Мурзик", "Черныш", "Фунтик", "Кекс", "Рыжик", "Гарфилд", "Васька", "Мурка"},
              {"Grey", "Black", "Grey", "Grey", "Red", "Grey", "Red", "Grey"},
              {"4", "2", "5", "1", "2", "7", "6", "3"}};
      for(int i = 0; i < cats[0].length; i++){
        if (i % 2 == 0){
          System.out.println("Имя кота в коробке " + i + " - " + cats[0][i] + ", цвет кота " + cats[1][i] + ", возраст " + cats[2][i]);
        }
      }
// 24 Создать двумерный массив целых случайных чисел от 1 до 10 размерности 4*8.
      print(task2 + 24);
      line(line);

      int[][] wholeNum = new int [4][8];
      for (int i = 0; i < wholeNum.length; i++) {
        for (int j = 0; j < wholeNum[i].length; j++) {
          wholeNum[i][j] = (int) (Math.random() * 10);
          System.out.print(wholeNum[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println(Arrays.deepToString(wholeNum));

// 25 Вывести сумму всех четных чисел массива из задания 24.
      print(task2 + 25);
      line(line);

      int wholeNumSum = 0;
      for(int i = 0; i < wholeNum.length; i++){
        for(int j = 0; j < wholeNum[i].length; j++){
          if(wholeNum[i][j] % 2 == 0){
            wholeNumSum += wholeNum[i][j];
          }
        }
      }
      System.out.println(wholeNumSum);




  }
}
