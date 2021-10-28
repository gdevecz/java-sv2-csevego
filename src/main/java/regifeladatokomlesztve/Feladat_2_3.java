
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_3 {
    // Sorsolj ki egy egész számot az [1;100] intervallumból, és írd ki, milyen számjegyre végződik!
    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy egész számot az [1;100] intervallumból, és írd ki, milyen számjegyre végződik!");
        
        Random random = new Random();
        int number = random.nextInt(100)+1;
        
        System.out.println("A szám: " +number);
        System.out.println("\nEredmény:");
        System.out.println("A szám utolsó számjegye: "+(number%10));
    }
}
