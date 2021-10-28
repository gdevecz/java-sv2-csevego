/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_28 {
    // Tölts fel egy 20 elemű tömböt a [-10;30] intervallumból véletlen számokkal!
    // Sorsolj ki egy egész számot a [0;9] intervallumból Írd ki a tömb azon elemeit,
    // amik erre a számjegyre végződnek, de nem oszthatók vele!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 20 elemű tömböt a [-10;30] intervallumból véletlen számokkal!\n"
                + "Sorsolj ki egy egész számot a [0;9] intervallumból Írd ki a tömb azon elemeit,\n"
                + "amik erre a számjegyre végződnek, de nem oszthatók vele!");

        int[] array = new int[20];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 41) - 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int number = (int) (Math.random() * 10);

        System.out.println("\nEredmény:");
        System.out.println("A kisorsolt szám: " + number);

        if (number != 0) {
            for (int i = 0; i < array.length; i++) {
                if ((array[i] < 0 ? -array[i] : array[i]) % 10 == number && array[i] % number != 0) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();

    }
}
