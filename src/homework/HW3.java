package homework;

public class HW3 {

    public static void main(String[] args) {

        String task = "\n Task  ";
        String line = "________________________________________________________";
        String line1 = "_________________________________________";
        byte a = 120;
        byte b = - 120;
        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;
        int i = Integer.MIN_VALUE;
        int i1 = Integer.MAX_VALUE;
        long phoneNumber = 88009698051L;
        float f = 100.101101F;
        double d = 100.1010;
        Double dd = (10.09999 + 20.099999);
        Float ff = (10.09999F + 20.099999F);
        double result = 10.0 / 3;
        float result2 = 10 / 3F;



        System.out.println(task +  4);
        System.out.println(line1);
        System.out.println("| \t\t int min \t\t |" +  i + "\t |");
        System.out.println(line1);
        System.out.println("| \t\t int max \t\t |" +  i1 + "\t |");
        System.out.println(line1);

        System.out.println(task +  5);
        System.out.println("Phone number - " + phoneNumber);

        System.out.println(task +  6);
        System.out.println(line1);
        System.out.println("| float f = " + f + " |\t" +  f + " \t|");
        System.out.println(line1);
        System.out.println("| doble d = " + d + "\t   |\t" +  d + " \t|");
        System.out.println(line1);

        System.out.println(task +  7);
        System.out.println(line);
        System.out.println("| float f = " + f + " \t\t\t|\t" +  f + " \t\t\t|");
        System.out.println(line);
        System.out.println("| doble d = " + d + "\t\t\t\t|\t" +  d + " \t\t\t|");
        System.out.println(line);
        System.out.println("| Float ff = " + ff + "\t\t\t|\t" +  ff + "\t\t\t|");
        System.out.println(line);
        System.out.println("| Doble dd = " + dd + " |\t" +  dd + " \t|");
        System.out.println(line);

        System.out.println(line1);
        System.out.println(task + 8);
        System.out.println(result);
        System.out.println(result2);

        double sum, product, quotient, reminder;
        sum = f + d;
        product = f * d;
        quotient = f / d;
        reminder = f % d;

        System.out.println( task + 9);
        System.out.println(line);
        System.out.println("| \t\t\t sum \t\t\t | \t" + sum +" \t\t|");
        System.out.println(line);
        System.out.println("| \t\t product\t\t\t | \t" + product +" \t\t|");
        System.out.println(line);
        System.out.println("| \t\t quotient \t\t\t | \t" + quotient +" \t\t|");
        System.out.println(line);
        System.out.println("| \t\t reminder \t\t\t | " + reminder +" \t|");
        System.out.println(line);

        System.out.println(task + 10);
        System.out.println(" *      *  *******  *       *        *****  \n " +
                           "*      *  *        *       *       *     * \n " +
                           "********  *******  *       *       *     * \n " +
                           "*      *  *        *       *       *     * \n " +
                           "*      *  *******  ******* *******  *****   ");

        byte t1 = 0;
        short t2 = 150;
        byte t3 = - 120;
        float t4 = - 505.505F;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = - 1000000.001F;
        short t9 = 1010;

        System.out.println(task + 11);
        System.out.println("t1 = " + t1 + "\nt2 = " + t2 + "\nt3 = " + t3 + "\nt4 = " + t4 + "\nt5 = "
                + t5 + "\nt6 = " + t6 + "\nt7 = " + t7 + "\nt8 = " + t8 + "\nt9 = " + t9);

        String line2 = "_________________________________________________________________________________________";

        System.out.println(task + 12);
        System.out.println(line2);
        System.out.println("| \t Type \t\t| Size in bits | \t\t\t min \t\t\t| \t\t\t max \t\t\t|");
        System.out.println(line2);
        System.out.println("| \t" + Byte.TYPE +"  \t\t|" + Byte.SIZE + "  \t\t\t| \t" + Byte.MIN_VALUE
                + " \t\t\t\t\t| \t\t\t" + Byte.MAX_VALUE + " \t\t\t|");
        System.out.println(line2);
        System.out.println("| \t" + Short.TYPE +"  \t\t|" + Short.SIZE + " \t\t\t| \t" + Short.MIN_VALUE
                + " \t\t\t\t\t| \t\t\t" + Short.MAX_VALUE + " \t\t\t|");
        System.out.println(line2);
        System.out.println("| \t" + Integer.TYPE +"  \t\t|" + Integer.SIZE + " \t\t\t| \t" + Integer.MIN_VALUE
                + " \t\t\t| \t\t" + Integer.MAX_VALUE + " \t\t\t|");
        System.out.println(line2);
        System.out.println("| \t" + Long.TYPE +"  \t\t|" + Long.SIZE + " \t\t\t| " + Long.MIN_VALUE
                + " \t\t| " + Long.MAX_VALUE + " \t\t|");
        System.out.println(line2);
        System.out.println("| \t" + Float.TYPE +"  \t\t|" + Float.SIZE + " \t\t\t| \t\t" + Float.MIN_VALUE
                + " \t\t\t| \t" + Float.MAX_VALUE + " \t\t\t|");
        System.out.println(line2);
        System.out.println("| \t" + Double.TYPE +"  \t|" + Double.SIZE + " \t\t\t| \t\t" + Double.MIN_VALUE
                + " \t\t\t| " + Double.MAX_VALUE + " \t|");
        System.out.println(line2);

        Integer num1 = 101;
        Integer num2 = 101;

        System.out.println(task + 13 + "\n");
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num1 = 104;

        System.out.println("Если num1 не равен num2, то результат сравнения методом .equal = " + num1.equals(num2));

        int number1 = 105;
        int number2 = 105;
        String mes = "Если number1 ";
        String mes1 = " number 2, то результат сравнения методом ";

        System.out.println(task + 14 + "\n");
        System.out.println(mes + "=" + mes1 + "compare = " + Integer.compare(number1, number2) );

        number1 = 100;
        number2 = 105;

        System.out.println(mes + "<" + mes1 + "compare = " + Integer.compare(number1, number2));

        number1 = 110;
        number2 = 105;

        System.out.println(mes + ">" + mes1 + "compare = " + Integer.compare(number1, number2));

        Float fl = 234.9999F;

        System.out.println(task + 15 + "\n");
        System.out.println(fl.intValue());

        double numD1 = 117.87;
        double numD2 = 58.08;

        System.out.println(task + 16 + "\n");
        System.out.println(Double.sum(numD1, numD2));

        Float f1 = 16.96857F;
        Float f2 = 24.50984F;

        System.out.println(task + 17 + "\n");
        System.out.println(Integer.sum(f1.intValue(),f2.intValue()));

        Short short1 = 12000;
        Short short2 = 12300;

        System.out.println(task + 18 + "\n");
        System.out.println("12000 - 12300 =" + Short.compare(short1, short2));

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(task + 19 +"\n");
        System.out.println(doub1 - doub2);
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));

        Double temp = 40.0;
        Double average = temp;
        temp = 35.6;
        average = (temp + average) / 2;

        System.out.println(task + 20 + "\n");
        System.out.println("Среднее значение температуры кота = " + Math.round(average));

        Number n = Double.MAX_VALUE;
        System.out.println(task + 21 + "\n");
        System.out.println("Variable n may have the following values: \n" + n );

        n = 10;
        System.out.println(n);

        n = 10.999999999;
        System.out.println(n);
        System.out.println("Because Number is a super class that includes all types");

        Integer numberInteger = 100;
        String numInt = numberInteger.toString();

        System.out.println(task + 22 + "\n");
        System.out.println(numberInteger.getClass());
        System.out.println(numInt.getClass());

        double cel = 36.6;
        double far = cel * 1.8 + 32;
        double kg = 50;
        double ibs = kg * 2.205;
        double ib = 50;
        double kgs = ib * 0.45359237;

        System.out.println(task + 24 + "\n");
        System.out.println(cel + "градусов по Цельсию = " + far + " градусов по Фаренгейту");
        System.out.println(kg + " килограмм = " + ibs + "фунтов");
        System.out.println(ib + " фунтов = " + kgs + " килограмм");






        }


    }

