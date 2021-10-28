
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_6 {
    //Kérj be egy negatív egész számot a felhasználótól, és írd ki az ettől nagyobb negatív számokat!

    public static void main(String[] args) {
        System.out.println("Kérj be egy negatív egész számot a felhasználótól, és írd ki az ettől nagyobb negatív számokat!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nKérem a negatív egész számot: ");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("\nEredmény:");
        System.out.print("A "+number+" számnál nagyobb negatív számok: ");
        for (int i = number + 1; i < 0; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
