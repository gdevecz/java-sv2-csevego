/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_27 {
    // Tölts fel egy 10 elemű tömböt páratlan számokkal a [0;100] intervallumból véletlen számokkal és írd ki őket!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 elemű tömböt páratlan számokkal a [0;100] intervallumból véletlen számokkal és írd ki őket!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            // Amíg páratlant nem dobok:
            // while((array[i] = (int) (Math.random() * 101)) % 2 != 1);
            // Csak páratlant dobhatok:
            array[i] = ((int) (Math.random() * 48)) * 2 + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
