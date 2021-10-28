
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_3_4 {
    // Hozz létre egy 10 elemű tömböt, melyet tölts fel egy tetszőleges intervallumból! 
    // Írd ki azokat a számokat, melyekből több is megtalálható a tömbben, de minden ilyen számot csak egyszer írj ki!

    public static void main(String[] args) {
        System.out.println("Hozz létre egy 10 elemű tömböt, melyet tölts fel egy tetszőleges intervallumból!\n"
                + "Írd ki azokat a számokat, melyekből több is megtalálható a tömbben,\n"
                + "de minden ilyen számot csak egyszer írj ki!");

        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az intervallum 1. értékét: ");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Kérem az intervallum 2. értékét: ");
        int max = Integer.parseInt(sc.nextLine());
        if (min > max) {
            int tmp = min;
            min = max;
            max = tmp;
        }

        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            while (j < array.length && (i == j || array[i] != array[j])) {
                j++;
            }
            if (j < array.length && j > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
