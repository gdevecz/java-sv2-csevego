/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_18 {

    // Tölts fel egy 10 elemű tömböt a [0;100] intervallumból véletlen számokkal!
    // Írd ki azokat az elemeket, amelyek 0-ra végződnek, de 4-gyel nem oszthatók!
    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 elemű tömböt a [0;100] intervallumból véletlen számokkal!\n"
                + "Írd ki azokat az elemeket, amelyek 0-ra végződnek, de 4-gyel nem oszthatók!");

        int[] array = new int[10];
        System.out.println("\nA tömb elemei:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0 && array[i] % 4 != 0) {
                System.out.println(array[i] + " ");
            }
        }
    }
}
