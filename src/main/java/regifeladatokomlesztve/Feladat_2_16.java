
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_16 {
    //Kérj be egy egész számot a felhasználótól, mely egy kör átmérője! Írd ki a kör kerületét, területét!

    
    public static void main(String[] args) {
        System.out.println("Kérj be egy egész számot a felhasználótól, mely egy kör átmérője! Írd ki a kör kerületét, területét!");
        
        double radius;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nKérem a kör sugarát: ");
        radius=Double.parseDouble(sc.nextLine());
        
        System.out.println("\nEredmény:");
        System.out.println("A kör kerülete: "+(2*radius*Math.PI));
        System.out.println("A kör területe: "+(Math.pow(radius,2)*Math.PI));
    }
}
