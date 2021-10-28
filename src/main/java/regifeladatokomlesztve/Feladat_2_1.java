
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_1 {
    // Kérj be egy egész számot a felhasználótól, és írd ki a nullától való távolságát!

    public static void main(String[] args) {
        
        System.out.println("A program bekér egy egész számot, és kiírja a nullától való távolságát.");
        System.out.print("Kérem a számot: ");
        int number;
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.println("Eredmény:");
        System.out.print("A kérdéses szám (" + number + ") nullától való távolsága: " + ((number < 0 )? -number : number));
        System.out.println();
        // Math.abs függvénnyel:
        /*
        System.out.println("A kérdéses szám (" + number + ") nullától való távolsága: " +Math.abs(number));
        */
    }
}
