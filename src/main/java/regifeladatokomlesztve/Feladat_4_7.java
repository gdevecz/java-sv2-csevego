/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_7 {
    // Sorsolj ki egy 10 számjegyű számot. Írd ki azokat a számjegyeket, amelyek nem fordulnak elő a számban! Ha nincs ilyen, írd ki, hogy nincs hiányzó számjegy!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 10 számjegyű számot. Írd ki azokat a számjegyeket,\n"
                + "amelyek nem fordulnak elő a számban! Ha nincs ilyen, írd ki, hogy nincs hiányzó számjegy!");

        long number = (long) (Math.random() * 10000000000l);
        //number=203456789l;
        System.out.println("\nA kisorsolt szám: " + number);
        boolean ok = false;
        long tmp;
        for (int i = 0; i < 10; i++) {
            tmp = number;
            while (tmp > 0 && tmp % 10 != i) {
                tmp /= 10;
            }
            if (tmp == 0) {
                System.out.print(i + ", ");
                ok = true;
            }
        }
        System.out.println();
        
        if (!ok) {
            System.out.println("Ninccs hiányzó számjegy!");
        }
    }
}
