/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_9 {
    // Hozz létre egy 20 elemű tömböt, melyet tölts fel a [0;10] intervallumból!
    // Írd ki azokat a számokat, amelyek mögött van 5 tőle nagyobb szám!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 20 elemű tömböt, melyet tölts fel a [0;10] intervallumból!\n"
                + "Írd ki azokat a számokat, amelyek mögött van 5 tőle nagyobb szám!");

        int[] array = new int[20];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length - 6; i++) {
            int j = i + 1;
            int counter = 0;
            while (j < array.length && counter < 5) {
                if (array[j] > array[i]) {
                    counter++;
                }
                j++;
            }
            if (counter == 5) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
