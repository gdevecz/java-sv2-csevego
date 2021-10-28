
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_4_3 {
    // Írd ki annak a sorozatnak a 15. elemét, amelyet úgy kapsz meg, hogy 
    // minden következő elemet az előző szám számjegyeinek kétszereséből állítod elő! 
    // (1, 2, 4, 8, 16, 212, 424, 848, 16816)

    // Az algoitmus jó, de a szám akkora, hogy long-ban sem fér el.
    /*
    public static void main(String[] args) {
        System.out.println("Írd ki annak a sorozatnak a 15. elemét, amelyet úgy kapsz meg,\n"
                + "hogy minden következő elemet az előző szám számjegyeinek kétszereséből állítod elő!\n"
                + "(1, 2, 4, 8, 16, 212, 424, 848, 16816)");

        long number = 1;
        int counter = 1;
        long t = 0;
        int s = 0;

        System.out.println(s);
        System.out.print(number + ", ");

        while (counter < 15) {
            long tmp = 0;
            int i = 0;
            int size = 0;
            while (number / (long)(Math.pow(10, i)) > 0) {
                tmp += (((number % (long) Math.pow(10, i + 1)) / (long) Math.pow(10, i)) * (long) Math.pow(10, size)) * 2l;
                while (tmp / (long) Math.pow(10, size) > 0) {
                    size++;
                }
                i++;
            }
            number = tmp;
            System.out.print(number+", ");
            counter++;
        }
        System.out.println();
    }
     */
    public static void main(String[] args) {
        System.out.println("Írd ki annak a sorozatnak a 15. elemét, amelyet úgy kapsz meg,\n"
                + "hogy minden következő elemet az előző szám számjegyeinek kétszereséből állítod elő!\n"
                + "(1, 2, 4, 8, 16, 212, 424, 848, 16816)");

        String number = "1";
        int counter = 1;

        System.out.print(number + ", ");
        StringBuffer tmp = new StringBuffer(30);
        while (counter < 15) {
            tmp.delete(0, tmp.capacity());
            for (int i = 0; i < number.length(); i++) {
                tmp.append((Integer.parseInt(number.substring(i, i + 1)) * 2));
            }
            number = tmp.toString();
            System.out.print(number + ", ");
            counter++;
        }
    }
}
