/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_11 {
    // Hozz létre egy 10 elemű tömböt, melyet tölts fel a [0;9] intervallumból!
    // Írd ki azokat a számokat, amelyek egyenlőek az előtte lévő számok összegével!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, melyet tölts fel a [0;9] intervallumból!\n"
                + "Írd ki azokat a számokat, amelyek egyenlőek az előtte lévő számok összegével!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEremdmény:");
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int sum = 0;
            while (j < i) {
                sum += array[j++];
            }
            if (sum == array[i]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
