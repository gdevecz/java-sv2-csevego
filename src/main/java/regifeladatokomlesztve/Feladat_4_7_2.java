/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_7_2 {

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 10 számjegyű számot. Írd ki azokat a számjegyeket,\n"
                + "amelyek nem fordulnak elő a számban! Ha nincs ilyen, írd ki, hogy nincs hiányzó számjegy!");

        long number = (long) (Math.random() * 10000000000l);
        //number=2034567891l;
        System.out.println("\nA kisorsolt szám: " + number);
        boolean ok = false;

        boolean[] digits = new boolean[10];
        while (number > 0l) {
            //System.out.print(number+":"+number%10);
            digits[(int)(number % 10)] = true;
            number /= 10l;
            //System.out.println(number);
        }
        for (int i = 0; i < 10; i++) {
            if(!digits[i]){
                System.out.print(i+", ");
                ok=true;
            }
        }

        if (!ok) {
            System.out.println("Ninccs hiányzó számjegy!");
        }
    }
}
