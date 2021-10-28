
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_3_8 {
    // Hozz létre egy 20 elemű tömböt, melyet tölts fel egy tetszőleges intervallumból! 
    // Írd ki azokat a számokat, amelyekből csak egy van a tömbben!
    
    public static void main(String[] args) {
        System.out.println("Hozz létre egy 20 elemű tömböt, melyet tölts fel egy tetszőleges intervallumból!\n"
                + "Írd ki azokat a számokat, amelyekből csak egy van a tömbben!");
        
        int[] array = new int[20];
        System.out.println("\nA tömb:");
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(201) - 100;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
        System.out.println("\nEredmény:");
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            /*
            int counter = 0;
            while (j < array.length && counter < 2) {
                if(array[i]==array[j]){
                    counter++;
                }
                j++;
            }*/
            while (j < array.length && (i==j || array[i]!=array[j])){
              j++;
            }
            if (j==array.length) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
