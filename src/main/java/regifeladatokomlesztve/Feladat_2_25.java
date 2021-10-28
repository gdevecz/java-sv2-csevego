
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_25 {
    // Olvass be számokat a billentyűzetről addig, amíg 0-át nem adsz meg. Számold meg a beolvasott számok közül a páratlanokat és írd ki a darabszámot!

    public static void main(String[] args) {
        System.out.println("Olvass be számokat a billentyűzetről addig, amíg 0-át nem adsz meg."
                + "Számold meg a beolvasott számok közül a páratlanokat és írd ki a darabszámot!");

        System.out.println("\nKérem a számokat:");
        Scanner sc = new Scanner(System.in);
        int number;
        int numberOfOdds = 0;

        while ((number = Integer.parseInt(sc.nextLine())) != 0) {
            if (number % 2 != 0) {
                numberOfOdds++;
            }
        }

        System.out.println("\nEredmény:");
        System.out.println(numberOfOdds + "db páratlan szám lett megadva.");
    }
}
