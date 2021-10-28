/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_5 {
    // Hozz létre egy 5 elemű tömböt, melyet tölts fel a [0;9] intervallumból! 
    // Írd ki azokat a számokat a tömbből, melyek után csak tőle nagyobb elemek találhatóak!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 5 elemű tömböt, melyet tölts fel a [0;9] intervallumból!\n"
                + "Írd ki azokat a számokat a tömbből, melyek után csak tőle nagyobb elemek találhatóak!");

        int[] array = new int[5];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            while (j < array.length && array[j] > array[i]) {
                j++;
            }
            if (j == array.length) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

    }
}
