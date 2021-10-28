/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_23 {
    // Sorsolj ki 10 számot a [0;10] intervallumból. Írd ki a kisorsolt számok átlagát!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki 10 számot a [0;10] intervallumból. Írd ki a kisorsolt számok átlagát!");

        int sum = 0;
        int number;

        System.out.println("\nA számok:");
        for (int i = 0; i < 10; i++) {
            System.out.print((number = (int) (Math.random() * 11)) + " ");
            sum += number;
        }
        System.out.println();
        
        System.out.println("\nEredmény:");
        System.out.println("A számok átlaga: " + (sum / 10.0));
    }

}
