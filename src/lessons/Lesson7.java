package lessons;

public class Lesson7 {

    public static void main(String[] args) {

        String[] catsNames;

        catsNames = new String[8];
        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";
        catsNames[6] = "Рыжик";

        int[] catsAges = new int[8];
        System.out.println(catsNames);
        System.out.println(catsNames[7]);
        System.out.println(catsAges[2]);
        System.out.println(catsNames[4]);

        System.out.println("____________________________");
        for(int i = 0; i < 8; i++){
            System.out.println(catsNames[i]);
        }

        System.out.println("____________________________");
        for(int i = 0; i < 8; i++){
            if (catsNames[i] == "Рыжик"){
                System.out.println(catsNames[i]);
            }
        }
        System.out.println("____________________________");
        for(int i = 0; i < 8; i++){
            if(catsNames[i] == "Рыжик"){
                System.out.println(i);
            }
        }

        System.out.println("____________________________");
        for(int i = 0; i < 8; i++){
            if(catsNames[i] == "Черныш"){
                System.out.println(i);
            }
        }
        System.out.println("____________________________");
        System.out.println(catsNames.length);
        System.out.println(catsAges.length);
    }
}
