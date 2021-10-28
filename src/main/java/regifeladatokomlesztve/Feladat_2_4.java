
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_2_4 {

    // Sorsolj ki egy egész számot a [7;24] intervallumból. Írd ki a szám osztóit!
    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy egész számot a [7;24] intervallumból. Írd ki a szám osztóit!");

        Random random = new Random();
        int number = random.nextInt(18) + 7;

        System.out.println("A kisorsolt szám: " + number);

        System.out.print("\nEredmény:\nA szám osztói: ");
        // Az i lehetne kettő is és az 1-et beírhatnánk az eredménybe, ("Eredmény:\nA szám osztói: " + 1 + ", ")
        // i csak azért 1 hogy maga az algoritmus találja meg az 1-et.
        // A ciklus mehetne number-ig és (while(i<=number) és akkor megtalálná numbert is.
        // Ez gyakorlatilag megkétszerené a felesleges műveletek számát, mert a 
        // felénél nagyobb szám nem lehet osztója.
        
        int i = 1;
        while (i <= number / 2.0) {
            if (number % i == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println(number);
    }
}
