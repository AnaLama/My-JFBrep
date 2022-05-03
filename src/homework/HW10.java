package homework;

import java.util.Arrays;
import java.util.Locale;

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
        if (sent3.length() != 0) {
            sent3 = sent3.replace(" ", "");
            sent3 = sent3.replace("0", "");
            return sent3;
        } else {
            return null;
        }
    }

    // 4 Написать алгоритм RemoveAllSpaces.
//С помощью методов из видео1,  написать алгоритм, который принимает на вход строку. Если строка валидная, то метод удаляет
// все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
    public static String removeAllSpaces(String sent4) {
        if (sent4.length() != 0) {
            sent4 = sent4.replace(" ", "");
            return sent4;
        } else {
            return null;
        }
    }

    // 5 Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
    public static int howManyLetters(String str) {
        if (str.length() != 0) {
            str = str.toLowerCase();
            if (str.contains("a") == true) {
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a') {
                        count++;
                        i++;
                    }
                }
                return count;
            }
        }
        return -1;
    }

    // 6 Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
    public static boolean isThereJavaWord(String text) {
//        if(text.length() != 0){
        boolean bool = true;
        if (text.contains("Java") == bool) {

            return bool;
        } else {
            return false;
        }
        //       }
    }

    // 7 Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки, точку и кавычки в конце строки
// с помощью метода concat()
    public static String getConcat(String str) {
        if (str.length() != 0) {
            str = str.trim();
            str = "\"" + str.concat(".\"");
        }
        return str;
    }

    // 8 Напишите метод, кторый принимает на вход название города и исправляет написание
    public static String getTrueName(String str) {
        if (str.length() != 0) {
            str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

            return str;
        }
       return null;
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

        print(task + 4);
        line(line);
//  “    QA   4  Everyone   “ →  “QA4Everyone“
//“p a     n d a   “ → “panda”
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));

        print(task + 5);
        line(line);
// “Abracadabra” → 5
//“Homenum Revelio” → 0
        System.out.println(howManyLetters("Abracadabra"));
        System.out.println(howManyLetters("Homenum Revelio"));

        print(task + 6);
        line(line);

        System.out.println(isThereJavaWord("As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current" +
                " long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use " +
                "indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades."));
        System.out.println(isThereJavaWord("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n"));

        print(task + 7);
        line(line);

        System.out.println(getConcat("One"));
        System.out.println(getConcat("    TWO  "));

        print(task + 8);
        line(line);

        System.out.println(getTrueName("ташкент"));
        System.out.println(getTrueName("ЧикаГО"));
    }


}
