package lessons;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Locale;

import static utils.Utils.line;

public class LessonStrings {
    public static void main(String[] args) {
        String str1= "Java";
        String str2 = "is";
        String str3 = "fun";
        String  space = " ";

        System.out.println(str1 + space + str2 + space + str3);

        String str4 = str1 + space + str2 + space + str3;
        System.out.println(str4);

        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(4));

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');
        System.out.println(a ==aa); //true
        System.out.println(aa == aaa);  //false
        System.out.println(aa.equals(aaa));  //true

        String strA = "a"; // не можем сравнивать с char, разные типы данных

        for(int i = 0; i <= 4; i++){
            System.out.println(str4.charAt(i));
        }

        for(int i = 0; i < str4.length(); i++){
            if(str4.charAt(i) == 'a'){
                System.out.println(str4.charAt(i)); //печатает букву
                System.out.println(i); // печатает индекс
            } else {
                System.out.println("Letter is not a");

                System.out.println(Character.toString('i'-1));
                System.out.println(Character.toString('i'));
                System.out.println(Character.toString('i'+1));
            }
        }
        line(line);

        String[] arrayStr = new String[str4.length()];    // переводит строку в массив букв
        for(int i = 0; i < str4.length(); i++){
            arrayStr[i] = Character.toString(str4.charAt(i));
        }
        System.out.println(Arrays.toString(arrayStr));

        line(line);

        System.out.println(str4.toCharArray());
        char [] arrayChar = str4.toCharArray();
        System.out.println(arrayStr[0].equals(arrayChar[0])); // будет false
        System.out.println(arrayStr[0].compareTo(Character.toString(arrayChar[0]))); // будет 0 (варианты -1, 0, 1), т е равны, т к сравнивает лексико-графически

        System.out.println(str4 +" " + str4.toLowerCase());
        System.out.println(str4.toUpperCase());
        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5)); // будет 0, т к равны


    }
}
