
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
public class Feladat_1_1 {
    // Adott egy egész számokból álló tetszőleges intervallumból feltöltött tömb. 
    // Melyik az az elem, ameddig a legnagyobb a tömb elemeinek részösszege a tömb
    // elejétől kezdődően?
    // Pl {1,4,5,-8,11,-7,-5} -> 11

    public static void main(String[] args) {
        final int MIN = -10;
        final int MAX = 10;
        final int SIZE = 5;
        int index;
        int sum;
        int[] array = new int[SIZE];

        // A feladat kiírása
        System.out.println("Adott egy egész számokból álló tetszőleges intervallumból "
                + "feltöltött tömb. \nMelyik az az elem, ameddig a legnagyobb a tömb elemeinek részösszege a "
                + "tömb elejétől kezdődően?");
        System.out.println("A tömb elemeinek tarománya: " + MIN + " < x < " + MAX + ".");
        System.out.println("A tömb mérete: " + SIZE);

        // A tömb létrehozása és kiiratása
        System.out.println("\nA tömb: ");
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(MAX - MIN - 2) - (MAX - MIN - 2) / 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Az első elemet veszem kiinduló értéknek,ímajd végigmegyek a tömb elemein
        // és megnézem, hogy a részösszeg nagyob-e mint az eddig feltételezett.
        // Ha igen, akkor elmentem az indexet és a részösszeget a későbbi összehasonlításhoz.
        index = 0;
        sum = array[0];
        // Végigmegyek a tömb elemein i index-el.
        for (int i = 1; i < SIZE; i++) {
            int j = 0;
            int tmpSum = 0;
            // Az aktuális (i) indexig összeadom az elemeket.
            while (j <= i) {
                tmpSum += array[j];
                j++;
            }
            // Ha az aktuális részösszeg nagyobb mint az eddig feltételezett :
            if (tmpSum > sum) {
                index = i;
                sum = tmpSum;
            }

        }

        // Az eredémy kiiratása:
        System.out.println("\nEredmény:");
        System.out.println("A tömb legnagyobb első elemétől kezdődő részhalmazának elemszáma: " + (index + 1));
        System.out.println("A részhalmaz összege: " + sum);
        System.out.println("A résztömb utolsó elemének értéke: " + array[index]);
    }
}
