/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_2 {

    // Hozz létre egy 50 elemű tömböt, melyet tölts fel a [0;200] intervallumból!
    // Írd ki azokat a számokat, melyeknek a duplája is megtalálható a tömbben!
    public static void main(String[] args) {
        System.out.println("Hozz létre egy 50 elemű tömböt, melyet tölts fel a [0;200] intervallumból!\n"
                + "Írd ki azokat a számokat, melyeknek a duplája is megtalálható a tömbben!");

        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201);
        }

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            int j= 0;
            while (j<array.length && array[j++]!=array[i]*2);
            if(j<array.length)
            {
                //System.out.println(array[i]+" : "+array[j-1]);
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        
    }
}
