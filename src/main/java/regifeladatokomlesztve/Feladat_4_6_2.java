/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_6_2 {

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 10 számjegyű számot. Melyik az a legnagyobb legalább kétjegyű szám ezen belül,\n"
                + "amelyiknek a számjegyei növekvő sorrendben állnak? (pl: 1234345673 -> 34567)\n"
                + "Ha nincs ilyen, akkor írd ki, hogy nincs ilyen szám!");

        long number = (long) (Math.random() * 10000000000l);
        System.out.println("\nA kisorsolt szám: " + number);
        int sizeOfNumber = 0;
        while (number / (long) (Math.pow(10, sizeOfNumber)) > 0l) {
            sizeOfNumber++;
        }
        System.out.println("Size: " + sizeOfNumber);
        long result = 0;

        int[] numberArray = new int[sizeOfNumber];
        while (number > 0) {
            numberArray[--sizeOfNumber] = (int) (number % 10);
            number /= 10;
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + ", ");
        }
        System.out.println();
        int start = 0;
        while (start < numberArray.length - 2) {
            int size = 0;
            while (start + size < numberArray.length - 2 && numberArray[start + size] < numberArray[start + size + 1]) {
                System.out.println(start + ":" + (start + size+1) + ":" + numberArray[start + size] + ":" + numberArray[start + size + 1]);
                size++;
            }
            if (size > 1) {
                int tmp = 0;
                for (int k = start; k <= start+size; k++) {
                    tmp = tmp * 10 + numberArray[k];
                    System.out.println("tmp: " + tmp);
                }
                if (result < tmp) {
                    result = tmp;
                    System.out.println("r:" + result);
                }
            }
            start++;
        }
        System.out.println("result: " + result);
    }
}
