
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_2 {
    // Sorsolj ki 3 egész számot a [0;10] intervallumból, és írd ki az átlagukat!

    public static void main(String[] args) {
        // Fealadat kiírása
        final int SIZE = 3;
        System.out.println("Sorsolj ki " + SIZE + " egész számot a [0;10] intervallumból, és írd ki az átlagukat!");

        int sum = 0;
        int tmp;
        System.out.println("A számok:");
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((tmp = random.nextInt(10)) + ", ");
            sum += tmp;
        }
        System.out.println();

        System.out.println("Eredmény:");
        System.out.println("A számok átlaga: " + ((double) sum / SIZE));
    }
}
