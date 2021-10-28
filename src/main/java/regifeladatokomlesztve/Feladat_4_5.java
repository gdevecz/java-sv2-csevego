/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_5 {
    // Sorsolj ki egy 10 számjegyű számot. Írd ki a számon belüli prímszámokat! 
    // (pl: 1123456789 -> 2, 3, 5, 7, 11, 23, 67, 89, 1123, 4567, 23456789) 
    // A prímszámokat növekvő sorrendben add meg! Ugyanazt a számot ne írd ki kétszer!
    // Ha nincs ilyen, akkor írd ki, hogy nincs ilyen szám!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 10 számjegyű számot. Írd ki a számon belüli prímszámokat!\n"
                + "(pl: 1123456789 -> 2, 3, 5, 7, 11, 23, 67, 89, 1123, 4567, 23456789)\n"
                + "A prímszámokat növekvő sorrendben add meg! Ugyanazt a számot ne írd ki kétszer!\n"
                + "Ha nincs ilyen, akkor írd ki, hogy nincs ilyen szám!");

        System.out.println(Integer.MAX_VALUE);
        long number = (long) (Math.random() * 10000000000l);
        System.out.println("\nA kisorsolt szám: " + number);
        //number = 3211213;
        //number = 6644;
        int numberSize = 0;
        while (number / (long) Math.pow(10, numberSize) > 0) {
            numberSize++;
        }
        //System.out.println("numbersize: " + numberSize);
        boolean isTherePrime = false;

        System.out.println("\nEredmény:");
        for (int size = 0; size < numberSize; size++) {
            long actualMin = number + 1;
            long beforeMin = -1;
            while (actualMin != beforeMin) {
                for (int bias = 0; bias + size < numberSize; bias++) {
                    long actualNumber = (number % (long) (Math.pow(10, size + bias + 1))) / (long) (Math.pow(10, bias));
                    if (actualNumber / (long) Math.pow(10, size) > 0 || size == 0) {
                        if (actualMin > actualNumber && actualNumber > beforeMin) {
                            actualMin = actualNumber;
                        }
                        // System.out.println("size: " + size + ", bias: " + bias + ", actual number: " + actualNumber + ", actualmin: " + actualMin);
                    }
                }
                if (actualMin != beforeMin && actualMin != number + 1 && actualMin > 1) {
                    boolean isPrime = true;
                    int i = 2;
                    isPrime = true;
                    while (isPrime && i <= actualMin / 2) {
                        if (actualMin % i == 0) {
                            isPrime = false;
                            //System.out.println("actualmin/i: "+actualMin/i);
                        }
                        i++;
                    }
                    if (isPrime) {
                        //System.out.println("Prime: " + actualMin + ", ");
                        isTherePrime = true;
                        System.out.print(actualMin + ", ");
                    }
                }
                //System.out.println("actualmin: " + actualMin + ", beforemin: " + beforeMin);
                beforeMin = actualMin;
                actualMin = number + 1;
            }
        }
        if (!isTherePrime) {
            System.out.println("Nincs ilyen szám!");
        }
        System.out.println();
    }
}
