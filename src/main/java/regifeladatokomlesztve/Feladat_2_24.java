
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_24 {
    // Olvass be számokat a billentyűzetről addig, amíg 0-át nem adsz meg. 
    //Írd ki minden szám után, hogy páros vagy páratlan!

    public static void main(String[] args) {
        System.out.println("Olvass be számokat a billentyűzetről addig, amíg 0-át nem adsz meg.\n"
                + "Írd ki minden szám után, hogy páros vagy páratlan!");

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Kérem a számokat:");
        while ((number = Integer.parseInt(sc.nextLine())) != 0) {
            if (number % 2 == 0) {
                System.out.println("A " + number + " páros.");
            }else{
                System.out.println("A " + number + " páratlan.");
            }
        }
    }
}
