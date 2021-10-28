
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_5 {
    //Kérj be 2 egész számot a felhasználótól a [-100;100] intervallumból, és írd ki a közöttük lévő páros számokat!
    public static void main(String[] args) {
        System.out.println("Kérj be 2 egész számot a felhasználótól a [-100;100] intervallumból, és írd ki a közöttük lévő páros számokat!");
        
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az 1. számot: ");
        min=Integer.parseInt(sc.nextLine());
        System.out.print("Kérem a 2. számot: ");
        max=Integer.parseInt(sc.nextLine());
    
        if(min>max){
            int tmp=min;
            min=max;
            max=tmp;
        }
        
        System.out.println("\nEredmény:\n A "+min+" és "+max+" közötti páros számok: ");
        for (int i = min+1; i < max; i++) {
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
        System.out.println();
        
    }
    
}
