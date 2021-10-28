/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_1 {
    //Sorsolj ki egy számot az [1;10000000] intervallumból! Hozz létre egy tömböt, melyben az elemek a kisorsolt szám számjegyei! String műveleteket nem használhatsz!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy számot az [1;10000000] intervallumból!\n"
                + "Hozz létre egy tömböt, melyben az elemek a kisorsolt szám számjegyei!\n"
                + "String műveleteket nem használhatsz!");

        int number = (int) (Math.random() * 10000000) + 1;

        System.out.println("\nA kisorsolt szám: " + number);

        int size = 0;
        while ((number / ((int) Math.pow(10, ++size))) != 0);
        //System.out.println("A számjegyek száma: " + size);

        int[] array = new int[size];
        // 1. megoldás
/*
        for (int i = 0; i < array.length; i++) {
            array[i] = (number%((int)Math.pow(10, array.length-i))) / (int) Math.pow(10, array.length - i-1);
        }
*/
        
        // 2. megoldás
/*
        int j = 0;
        while (j<size) {
            array[size-1-j]= (number%(int)(Math.pow(10,j+1)))/(int)(Math.pow(10,j));
            j++;
        }
*/
        //3. megoldás
        for (int i = 0; i < array.length; i++) {
            int tmp=0;
            for (int j = 0; j < i; j++) {
                tmp=tmp*10+array[j];
            }
            array[i]=number/((int)Math.pow(10,array.length-1-i))-tmp*10;
        }
        
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
