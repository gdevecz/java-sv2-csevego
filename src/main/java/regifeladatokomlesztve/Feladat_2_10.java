/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_10 {

    // Hozz létre egy 10 elemű tömböt, amit tölts fel a [-5;15] intervallumból! Írd ki a tömb elemeit fordított sorrendben!
    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, amit tölts fel a [-5;15] intervallumból! Írd ki a tömb elemeit fordított sorrendben!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 5;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nEredmény:\nA tömb elemei fodított sorrendben:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
