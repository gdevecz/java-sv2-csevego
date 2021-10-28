/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_20 {

    // Tölts fel egy 10 elemű tömböt a [0;100] intervallumból véletlen számokkal! 
    // Sorsolj ki egy számot ugyanebből az intervallumból, és írd ki a tömb azon 
    // elemeit, amelyek nagyobbak a sorsolt számtól, de nem oszthatók vele!
    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 elemű tömböt a [0;100] intervallumból véletlen számokkal!\n"
                + "Sorsolj ki egy számot ugyanebből az intervallumból, és írd ki a tömb azon elemeit,\n"
                + "amelyek nagyobbak a sorsolt számtól, de nem oszthatók vele!");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int numberIndex = (int) (Math.random() * array.length);
        System.out.println("A kisorsolt szám: " + array[numberIndex] + ", a " + (numberIndex + 1) + ". elem a tömbben.");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[numberIndex] && array[i] % array[numberIndex] != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
