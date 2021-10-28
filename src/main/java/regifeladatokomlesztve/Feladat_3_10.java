/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_10 {
    // Hozz létre egy 50 elemű tömböt, melyet tölts fel a [0;200] intervallumból!
    // Írd ki azokat a számokat, amelyeknek nincs valódi osztója (nem 1 és önmaga) a tömbben!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 50 elemű tömböt, melyet tölts fel a [0;200] intervallumból!\n"
                + "Írd ki azokat a számokat, amelyeknek nincs valódi osztója (nem 1 és önmaga) a tömbben!");

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201);
        }

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1) {
                boolean itsOK = true;

                /*      
                int j = array[i] / 2;

                while (j > 1 && itsOK) {
                    if (array[i] % j == 0) {
                        itsOK = false;
                    }
                    j--;
                }

                 */
                int j = 2;
                while ((j <= array[i] / 2) && itsOK) {
                    if (array[i] % j == 0) {
                        itsOK = false;
                    }
                    j++;
                }
                if (itsOK) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
