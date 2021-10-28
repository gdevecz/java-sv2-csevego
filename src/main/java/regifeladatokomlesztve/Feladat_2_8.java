/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 *
 */
public class Feladat_2_8 {
    //Hozz létre egy 10 elemű tömböt, amit tölts fel a [0;20] intervallumból véletlen számokkal! Írd ki a tömb páros egyjegyű számait!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, amit tölts fel a [0;20] intervallumból véletlen számokkal! Írd ki a tömb páros egyjegyű számait!");

        System.out.println("\nA létrehozott tömb: ");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 21);
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        System.out.print("A tömb egyjegyű, páros elemei: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] / 10 == 0 && array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();

    }
}
