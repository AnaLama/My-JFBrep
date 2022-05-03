package homework;

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

    public static void main(String[] args) {
        System.out.println(capitalizeWords("      happy birthday!"));
    }

}
