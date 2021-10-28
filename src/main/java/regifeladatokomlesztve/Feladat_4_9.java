/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_4_9 {
    // Sorsolj ki egy 5 számjegyű számot. Írd ki, hogy van-e olyan számjegye,
    // amelyik nagyobb a többi számjegy összegénél! Ha van ilyen, írd ki melyik az!
    // Ha nincs ilyen, írd ki, hogy nincs ilyen számjegy!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy 5 számjegyű számot. Írd ki, hogy van-e olyan számjegye,\n"
                + "amelyik nagyobb a többi számjegy összegénél! Ha van ilyen, írd ki melyik az!"
                + "Ha nincs ilyen, írd ki, hogy nincs ilyen számjegy!");
        
        int number = (int) (Math.random() * 100000);
        System.out.println("\nA kisorsolt szám: " + number);
        //number=10901;
        int result=-1;
        int[] digits=new int[10];
        while (number>0) {
            digits[number%10]++;
            number/=10;
        }
        for (int i = 9; i >=0; i--) {
            if(digits[i]==1){
                int tmp=0;
                for (int j = 0; j < 10; j++) {
                    if(i!=j){
                        tmp+=j*digits[j];
                    }
                }
                if(tmp<i){
                    result=i;
                    System.out.println(i);
                }
            }
        }
        if(result<0){
            System.out.println("NINCS...");
        }
    }
}
