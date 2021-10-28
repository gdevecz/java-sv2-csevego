/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_6 {
    // Hozz létre egy 10 elemű tömböt, melyet tölts fel a [0;9] intervallumból! 
    // Írd ki azokat az elemeket, melyektől legalább 3 másik tömbelem kisebb!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, melyet tölts fel a [0;9] intervallumból!\n"
                + "Írd ki azokat az elemeket, melyektől legalább 3 másik tömbelem kisebb!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEredmény:");
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            /*
            for (int j = 0; j < 10 && counter < 3; j++) {
                if (array[j] < array[i]) {
                    counter++;
                }
            }
             */
            int j = 0;
            while (j < array.length && counter < 3) {
                if (array[j] < array[i]) {
                    counter++;
                }
                j++;
            }
            if (counter == 3) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
