package lessons;

public class Lesson6 {

    public static void seq (int l){
        int end = 0;
        for (int i = 0; end <l ;i += 2){
            System.out.println(i);
            end ++;
        }
    }
    public static void main(String[] args) {

 //  Печатаем фразу для всех чисел от 1 до 5 включительно
        for(int i = 1; i < 6; i++) {
            System.out.println("Java for beginners");
        }
 // печатаемчисла от 1 до 5 включительно
        for (int i = 1; i < 6; i++){
            System.out.println(i);
        }
// Печатаем только нечетные числа от 1 до 10 включительно
  //      for (int i = 1; i < 11; i++) {
  //          if(i %2 != 0){
  //              System.out.println(i);
  //          }
        //          }
// можно без иф путем изменения шага
        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
            }
 // Печатаем все числа от 1 до 100 включительно с шагом 10
        for(int i = 1; i <101; i+=10){
            System.out.println(i);
        }
// Печатаем все числа от 10 до 100 включительно, кратные 10
        for (int i = 0; i < 101; i +=10){
            System.out.println(i);
        }
// Печатаем все числа от 10 до 100 включительно, кратные 10
        for (int i = -100; i < 101; i +=10){
            System.out.println(i);
    }
// Песня
        String bottles = " bottles of bear";
        String bottle = "bottle of bear";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";

        for (int i = 99; i >-1; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
            } else if (i == 1){
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + (noMoreL) + bottles + wall + dot + ln);
            } else if (i == 0) {
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);

            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
            }
        }


    }
 }
