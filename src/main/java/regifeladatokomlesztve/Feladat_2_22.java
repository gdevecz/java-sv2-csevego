/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_22 {
    // Tölts fel egy 10 elemű tömböt a [0;1000] intervallumból véletlen számokkal! Írd ki azokat az elemeket, amelyek oszthatók az utolsó számjegyükkel!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 elemű tömböt a [0;1000] intervallumból véletlen számokkal!\n"
                + "Írd ki azokat az elemeket, amelyek oszthatók az utolsó számjegyükkel!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1001);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 != 0 && (array[i] % (array[i] % 10)) == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
