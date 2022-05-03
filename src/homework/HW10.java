package homework;

import java.util.Arrays;

import static utils.Utils.*;

public class HW10 {
    public static String capitalizeWords(String sentence) {

        if (sentence != null) {
            sentence = sentence.trim();
            //  Character.toString(sentence.charAt(0)).toUpperCase();
            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
            if (sentence.length() != 0) {
                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }
                return sentence;
            }
            return "";
        }
        return "";
    }
    // 1 Написать метод, который принимает на вход строку.
//Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
//Догадаться, каким методом из видео можно проверить, были ли пробелы.
//Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
//Если пробелов не было, вернуть сообщение “Пробелов не было”.
//Если строка пустая, вернуть сообщение “Строка пустая”.
    public static String getMessage(String sentence1) {
        String sentence2 = "";
        String message1 = "Лишние пробелы удалены";
        String message2 = "Пробелов не было";
        String message3 = "Строка пустая";

        if (sentence1.length() != 0) {
            sentence2 = sentence1.trim();

            if (sentence1.length() > sentence2.length()) {

                return message1;
            } else {

                return message2;
            }
        } else {

            return message3;
        }
    }

    //  2 Написать алгоритм RemoveAlla.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет
// все буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
    public static String removeAlla(String sent2) {
        if (sent2.length() != 0) {
            sent2 = sent2.trim();
            sent2 = sent2.replace("a", "");

            return sent2;
        } else {
            return null;
        }
    }
// 3 Написать алгоритм RemoveAllZeros.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку, состоящую из цифр. Если строка валидная,
// то метод удаляет все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
    public static String removeAllZeros(String sent3) {
        if (sent3.length() != 0){
            sent3 = sent3.replace(" ", "");
            sent3 = sent3.replace("0", "");
            return sent3;
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("      happy birthday!"));

        print(task + 1);
        line(line);
        //       Test Data:
//  “    QA4Everyone   “ → “Лишние пробелы удалены”
//  “QA4Everyone“ → “Пробелов не было”
//  “” → “Строка пустая”

        System.out.println(getMessage("    QA4Everyone   "));
        System.out.println(getMessage("QA4Everyone"));
        System.out.println(getMessage(""));

        print(task + 2);
        line(line);
//  “    QA4Everyone   “ →  “QA4Everyone“
//“panda   “ → “pnd”

        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.println(removeAlla("panda   "));
        System.out.println(removeAlla(""));


        print(task + 3);
        line(line);
//  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
//“ 0000000111“ → “111”

        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));


    }


}
