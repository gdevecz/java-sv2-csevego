
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_15 {

    //Sorsolj ki egy számot a [700;1300] intervallumból, mely egy fizetendő összeget jelent.
    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy számot a [700;1300] intervallumból, mely egy fizetendő összeget jelent.\n"
                + "Mennyi lesz a visszajáró, ha csak 200-as érmékkel fizetek? (nincs 5-ösre és 10-esre kerekítés)");

        Random random = new Random();
        int cost = random.nextInt(13000 - 700 + 1) + 700;
        int numberOfTwoHundreds = cost / 200;

        System.out.println("\nEredmény:");
        System.out.println("A fizetendő összeg: " + cost);
        System.out.println("Az összeget "
                + ((cost % 200 != 0) ? ++numberOfTwoHundreds : numberOfTwoHundreds)
                + " db kétszázassal tudom kifizetni.");
    }
}
