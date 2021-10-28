/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_6 {
    // Sorsolj ki egy 10 számjegyű számot. Melyik az a legnagyobb legalább kétjegyű szám ezen belül, amelyiknek a számjegyei növekvő sorrendben állnak? (pl: 1234345673 -> 34567) Ha nincs ilyen, akkor írd ki, hogy nincs ilyen szám!

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
        long target;
        int size = sizeOfNumber;
        boolean ok = false;
        long result = -1;

        while (!ok && size > 1) {
            for (int i = 0; i + size <= sizeOfNumber; i++) {
                //target=subNumber(number, i, i+size);
                long subNumber = 0l;
                int j = 0;
                long tmp = number;
                while (j < i) {
                    tmp /= 10;
                    j++;
                }

                j = 0;
                while (j < size) {
                    subNumber = subNumber + (tmp % 10) * (long) (Math.pow(10, j));
                    tmp /= 10;
                    j++;
                }
                if ((subNumber / (long) Math.pow(10, size - 1)) > 0) {
                    //System.out.println(":" + subNumber);
                    int k = 0;
                    long tmp2 = subNumber;
                    boolean numberIsGood = true;
                    while (numberIsGood && k < size) {
                        //System.out.println((tmp2 % 10) * 10 +">"+ ((tmp2 % 100) / 10) * 10);
                        if ((tmp2 % 10) * 10 < ((tmp2 % 100) / 10) * 10) {
                            numberIsGood = false;
                        }
                        tmp2 /= 10;
                        k++;
                    }
                    if (numberIsGood) {
                        ok = true;
                        if (result < subNumber) {
                            result = subNumber;
                   //         System.out.println("esélyes: " + result);
                        }
                    }
                }
            }
            size--;
        }
        System.out.println("\nResult: " + result);
    }

    public static long subNumber(long number, int start, int end) {
        long subNumber = 0l;
        int i = 0;
        while (i < start) {
            number /= 10;
            i++;
        }

        i = 0;
        while (i < end - start) {
            subNumber = subNumber + (number % 10) * (long) (Math.pow(10, i));
            number /= 10;
            i++;
        }

        //System.out.println(subNumber);
        return subNumber;
    }
}
/*
    public static boolean growNumbers(number) {

    }
}
 */
