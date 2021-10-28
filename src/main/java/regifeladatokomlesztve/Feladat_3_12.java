/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_12 {

    //Hozz létre egy 10 elemű tömböt, melyet tölts fel a [-10;10] intervallumból! Rendezd át a tömböt úgy, hogy a tömb elején a páros, a végén a páratlan számok legyenek! A páros és páratlan számok egymáshoz viszonyított sorrendje nem változhat meg!
    // pl: { 4 -9 6 8 5 -4 5 -10 -5 -6 } -> { 4 6 8 -4 -10 -6 -9 5 5 -5 }
    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, melyet tölts fel a [-10;10] intervallumból!\n"
                + "Rendezd át a tömböt úgy, hogy a tömb elején a páros, a végén a páratlan számok legyenek!\n"
                + "A páros és páratlan számok egymáshoz viszonyított sorrendje nem változhat meg!");
        System.out.println("pl: { 4 -9 6 8 5 -4 5 -10 -5 -6 } -> { 4 6 8 -4 -10 -6 -9 5 5 -5 }");

        int[] array = new int[10];
        System.out.println("\nAtömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21) - 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // egyszerű megoldás lehet másik irányba is
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int tmp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] % 2 != 0) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = tmp;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // segédtömbökkel
        /*
        int[] odds = new int[array.length];
        int[] evens = new int[array.length];
        int[] target = new int[array.length];
        int numberOfEvens = 0;
        for (int i = 0; i < odds.length; i++) {
            odds[i] = i;
        }

        for (int i = 0; i < odds.length; i++) {
            if ((array[odds[i]] % 2) == 0) {
                evens[numberOfEvens++] = odds[i];
                odds[i] = -1;
            }
        }

        for (int i = 0; i < numberOfEvens; i++) {
            target[i] = array[evens[i]];
        }
        for (int i = 0; i < odds.length; i++) {
            if (odds[i] >= 0) {
                target[numberOfEvens++] = array[odds[i]];
            }
        }
        for (int i = 0; i < target.length; i++) {
            System.out.print(target[i] + " ");
        }
        System.out.println();
*/
    }
}
