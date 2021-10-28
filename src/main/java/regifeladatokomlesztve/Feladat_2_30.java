/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_30 {
    //Sorsolj ki egy számot a [10;1000] intervallumból! Hány sorsolás kellett hozzá, hogy két számjegyű számot kapj?

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy számot a [10;1000] intervallumból!\n"
                + "Hány sorsolás kellett hozzá, hogy két számjegyű számot kapj?");

        int number;
        int counter = 0;

        while (((number = (int) (Math.random() * 991)) / 100) != 0) {
            counter++;
            //System.out.println("hibás: "+number);
        }

        System.out.println("A szám: " + number);
        System.out.println("A sorsolások száma: " + counter);
    }
}
