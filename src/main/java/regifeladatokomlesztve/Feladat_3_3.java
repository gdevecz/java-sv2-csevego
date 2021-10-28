/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_3 {
    // Hozz létre egy 10 elemű tömböt, melyet tölts fel a [0;9] intervallumból! Írd ki azokat a számokat, melyekből több is megtalálható a tömbben, de minden ilyen számot csak egyszer írj ki!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, melyet tölts fel a [0;9] intervallumból!\n"
                + "Írd ki azokat a számokat, melyekből több is megtalálható a tömbben,"
                + "de minden ilyen számot csak egyszer írj ki!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length - 1; i++) {
            int j = 0;
            while ((j < array.length) && (i == j || array[i] != array[j])) {
                j++;
            }
            if (j > i && j < array.length) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

    }
}
