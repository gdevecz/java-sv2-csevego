/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_13 {
    // Hozz létre egy 10 elemű tömböt az [1;10000] intervallumból! Melyek azok a számok, amelyek számjegyei növekvő sorrendben állnak?

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt az [1;10000] intervallumból!\n"
                + "Melyek azok a számok, amelyek számjegyei növekvő sorrendben állnak?");

        int[] array = new int[10];
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            while (((tmp % 100) / 10) < tmp%10) {
                tmp /= 10;
            }
            if (tmp <10) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
