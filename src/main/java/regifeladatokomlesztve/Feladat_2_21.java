/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_21 {
    //Tölts fel egy 10 elemű tömböt a [-1000;1000] intervallumból véletlen számokkal! Írd ki a tömb kétjegyű elemeit!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 elemű tömböt a [-1000;1000] intervallumból véletlen számokkal! Írd ki a tömb kétjegyű elemeit!");

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2001 - 1000);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            if(array[i]/100==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
