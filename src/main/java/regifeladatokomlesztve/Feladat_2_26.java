
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_26 {
    // Olvass be számokat a billentyűzetről addig, amíg 0-át nem adsz meg. Írd ki a begépelt páros számok átlagát!
    
    public static void main(String[] args) {
        System.out.println("Olvass be számokat a billentyűzetről addig, amíg 0-át nem adsz meg.\n"
                + "Írd ki a begépelt páros számok átlagát!");
    
        int number;
        int sum=0;
        int numberOfEvens=0;
        Scanner sc = new Scanner(System.in);
        
        while ((number=Integer.parseInt(sc.nextLine()))!=0) {
            if(number%2==0){
                numberOfEvens++;
                sum+=number;
            }
        }
        
        System.out.println("\nEredmény:");
        System.out.println("A páros számok átlaga: "+((double)sum/numberOfEvens));
        
    }
}
