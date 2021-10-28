
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_11 {
    //Kérj be 5 számot a felhasználótól, melyeket tárolj el egy tömbben! Írd ki a tömb első és utolsó elemét!

    public static void main(String[] args) {
        System.out.println("Kérj be 5 számot a felhasználótól, melyeket tárolj el egy tömbben! Írd ki a tömb első és utolsó elemét!");

        int[] array = new int[5];
        System.out.println("Kérem a számokat:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + 1 + ". szám: ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("\nA tömb: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        System.out.println("A tömb első és utolsó eleme: " + array[0] + ", " + array[array.length - 1]);
    }
}
