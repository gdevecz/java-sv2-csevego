/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_4 {
    //Sorsolj ki egy 6 számjegyű számot. Add meg, hogy melyik prímszám van ehhez a legközelebb! Ha több ilyen van, írd ki mindet!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 6 számjegyű számot. Add meg, hogy melyik prímszám van ehhez a legközelebb!\n"
                + "Ha több ilyen van, írd ki mindet!");

        int number = (int) (Math.random() * 1000000);
        System.out.println("\nA kisorsolt szám: " + number);

        int distance = -1;
        boolean OK = false;
        //number = 12;
        //number = 23;
        //number = 27;
        while (!OK) {

            int lesserPrime = 0;
            int biggerPrime = 0;
            int actualNumber;
            do {
                distance *= -1;
                actualNumber = number + distance;
                int i = 2;
                boolean itsPrime = true;
                while (itsPrime && i <= actualNumber / 2) {
                    if (actualNumber % i == 0) {
                        itsPrime = false;
                    }
                    i++;
                }
                if (itsPrime) {
                    OK = true;
                    if (distance > 0) {
                        biggerPrime = actualNumber;
                    } else {
                        lesserPrime = actualNumber;
                    }
                }

            } while (number - distance > 0 && distance > 0);
            distance--;
            if (lesserPrime != 0) {
                System.out.println("A számnál kisebb prím: " + lesserPrime);
            }
            if (biggerPrime != 0) {
                System.out.println("A számnál nagyobb prím: " + biggerPrime);
            }
        }
    }
}
