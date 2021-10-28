
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_13 {

    // Olvass be egy egész számot a billentyűzetről a [10;130] intervallumból, mely
    // egy autó sebességét jelenti! A megengedett legnagyobb sebesség az adott útszakaszon
    // 80 km/óra. Írd ki, hogy számszerűen mekkora büntetésre számíthat gyorshajtásért
    // az autós, ha legalább 20-szal túllépés esetén 30e Ft-ból megússza, de 40-nel 
    // túllépés felett már 50e Ft a büntetési tétel!
    public static void main(String[] args) {
        System.out.println("Olvass be egy egész számot a billentyűzetről a [10;130]\n"
                + "intervallumból, mely egy autó sebességét jelenti!\n"
                + "A megengedett legnagyobb sebesség az adott útszakaszon 80 km/óra.\n"
                + "Írd ki, hogy számszerűen mekkora büntetésre számíthat gyorshajtásért az autós,\n"
                + "ha legalább 20-szal túllépés esetén 30e Ft-ból megússza, de 40-nel túllépés felett már 50e Ft a büntetési tétel!");

        System.out.print("\nKérem az autó sebességét: ");
        Scanner sc = new Scanner(System.in);
        int speed = Integer.parseInt(sc.nextLine());

        System.out.println("\nEredmény:");
        // else-if szrerkezettel:
/*    
        System.out.print("A büntetési tétel: ");

        if (speed>=120) {
            System.out.println("50.000 Forint.");
        } else if(speed>=100){
            System.out.println("30.000 Forint.");
        }else{
            System.out.println("0 Forint.");
        }
         */


        int penalty = 0;
        if (speed >= 100) {
            penalty = 30000;
        }
        if (speed >= 120) {
            penalty = 50000;
        }
        System.out.println("A büntetési tétel " + penalty + " Forint.");

    }

}
