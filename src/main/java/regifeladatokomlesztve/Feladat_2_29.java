/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_29 {
    // Tölts fel egy 20 elemű tömböt a [-100;100] intervallumból véletlen számokkal!
    // Sorsolj ki két számot a [-40;40] intervallumból! Írd ki a tömb azon elemeit,
    // melyek a két külön kisorsolt szám között vannak!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 20 elemű tömböt a [-100;100] intervallumból véletlen számokkal!\n"
                + "Sorsolj ki két számot a [-40;40] intervallumból! Írd ki a tömb azon elemeit,\n"
                + "melyek a két külön kisorsolt szám között vannak!");

        int[] array = new int[20];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = (int) (Math.random() * 81) - 41;
        int max = (int) (Math.random() * 81) - 41;
        System.out.println("\nA két kisorsolt szám: " + min + ", " + max + ".");
        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }

        System.out.println("\nEredmény:");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min && array[i] < max) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

}
