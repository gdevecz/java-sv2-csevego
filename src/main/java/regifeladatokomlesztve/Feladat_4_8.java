/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_8 {
    // Sorsolj ki egy 10 számjegyű számot. Írd ki azokat a 3 számjegyű számokat, amelyek az eredeti számjegyekből összerakhatóak úgy, hogy a számjegyeik növekvő sorrenden állnak. Ugyanazt a számot ne írd ki kétszer! Ha nincsenek ilyenek, akkor írd ki, hogy nincsenek ilyen számok!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 10 számjegyű számot. Írd ki azokat a 3 számjegyű számokat,\n"
                + "amelyek az eredeti számjegyekből összerakhatóak úgy, hogy a számjegyeik növekvő sorrenden állnak.\n"
                + "Ugyanazt a számot ne írd ki kétszer! Ha nincsenek ilyenek, akkor írd ki, hogy nincsenek ilyen számok!\n");

        long number = (long) (Math.random() * 10000000000l);
        int[] digits = new int[10];
        System.out.println("\nA kisorsolt szám: " + number);
        while (!((number / 10 == 0) && (number % 10 == 0))) {
            digits[(int) (number % 10)]++;
            //System.out.println((int) (number % 10));
            number /= 10l;
        }
/*
        for (int i = 0; i < digits.length; i++) {
            System.out.println(i + ": " + digits[i]);
            if (digits[i] > 3) {
                digits[i] = 3;
            }
        }
*/
        int digit1, digit2, digit3;
        digit1 = digit2 = digit3 = 0;
        int counter = 0;
        int memo1, memo2, memo3;
        for (int i = 1; i < 10; i++) {
            if (digits[i] > 0) {
                memo1 = digits[i];
                digit1 = i;
                digits[i]--;
                for (int j = 0; j < 10; j++) {
                    if (digits[j] > 0) {
                        memo2 = digits[j];
                        digit2 = j;
                        digits[j]--;
                        for (int k = 0; k < 10; k++) {
                            if (digits[k] > 0) {
                                memo2 = digits[k];
                                digit3 = k;
                                System.out.println((digit1*10 + digit2)*10 + digit3);
                            }
                        }
                        digits[j] = memo2;
                    }
                }
                digits[i] = memo1;

            }
        }

    }
}
