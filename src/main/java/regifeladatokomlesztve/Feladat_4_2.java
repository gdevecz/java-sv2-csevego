/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_2 {
    // Írd ki 100-tól kezdve a második 10 darab olyan számot, amelyiknek pontosan 7 osztója van (1-et és önmagát figyelmen kívül hagyva).

    public static void main(String[] args) {
        System.out.println("Írd ki 100-tól kezdve a második 10 darab olyan számot, amelyiknek pontosan 7 osztója van\n"
                + "(1-et és önmagát figyelmen kívül hagyva).");

        int counter = 0;
        int number = 100;

        while (counter < 20) {
            int dividers = 0;
            int div = number / 2;
            while (div > 1) {
                if (number % div == 0) {
                    dividers++;
                }
                div--;
            }
            if (dividers == 7) {
                if (counter >= 10) {
                    System.out.println(number);
                }
                counter++;
            }
            number++;
        }
    }
}
