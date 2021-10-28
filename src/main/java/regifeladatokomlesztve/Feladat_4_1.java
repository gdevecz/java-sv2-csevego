/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_1 {
    // Írd ki, hogy melyik a legnagyobb szám a [100;100000] intervallumból, 
    // amelyiknek az utolsó számjegye nagyobb, mint az előtte lévő számjegyek összege.

    public static void main(String[] args) {
        System.out.println("Írd ki, hogy melyik a legnagyobb szám a [100;100000] intervallumból,\n"
                + "amelyiknek az utolsó számjegye nagyobb, mint az előtte lévő számjegyek összege.");

        int number = 100000;
        boolean OK = false;
        while (!OK && number >= 100) {
            int j = 1;
            int sum = 0;
            while ((number / (int) Math.pow(10, j)) > 0) {
                sum += (number % (int) Math.pow(10, j + 1)) / (int) Math.pow(10, j);
                j++;
            }
            if (sum < number % 10) {
                OK = true;
            } else {
                number--;
            }
        }
        
        System.out.println("\nEredmény:");
        System.out.println(number);
    }
}
