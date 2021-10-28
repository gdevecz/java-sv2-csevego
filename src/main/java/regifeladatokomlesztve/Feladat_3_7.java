/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_7 {
    // Hozz létre egy 20 elemű tömböt, és töltsd fel a [0;10] intervallumból! 
    // Írd ki azokat a számokat, amelyekből csak egy van a tömbben!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 20 elemű tömböt, és töltsd fel a [0;10] intervallumból!\n"
                + "Írd ki azokat a számokat, amelyekből csak egy van a tömbben!");

        int[] array = new int[20];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while(j<array.length && (i==j || array[i]!=array[j])){
                j++;
            }
            if(j==array.length){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
