/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_14 {
    // Sorsolj ki egy számot a [7000;15000] intervallumból, mely egy fizetendő összeget 
    // jelent. Hány darab ezressel lehet kifizetni az adott összeget? (nincs 5-ösre és 10-esre kerekítés)

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy számot a [7000;15000] intervallumból, mely egy fizetendő összeget jelent.\n"
                + "Hány darab ezressel lehet kifizetni az adott összeget? (nincs 5-ösre és 10-esre kerekítés)");

        System.out.print("A fizetendő összeg: ");
        int money=(int)(Math.random()*(15000-7000+1)+7000);
        System.out.println(money);
        
        System.out.println("\nEredmény:");
        System.out.print("A kért összeget ");
        int numberOfThousands=money/1000;
        if(money%1000!=0){
            numberOfThousands++;
        }
        System.out.println(numberOfThousands+" darab ezressel lehet kifizetni.");
    }
}
