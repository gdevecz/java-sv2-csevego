/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_7 {

    // Írd ki a [0;100] intervallumból azokat a számokat, amelyek a 2, 3, és 5 számok közül csak az egyikkel oszthatók!
    public static void main(String[] args) {
        System.out.println("Írd ki a [0;100] intervallumból azokat a számokat, amelyek a 2, 3, és 5 számok közül csak az egyikkel oszthatók!");

        System.out.println("\nEredmény: ");
        for (int i = 0; i <= 100; i++) {
            // csak 2-vel osztható, a többivel nem
            if ((i % 2 == 0 && i % 3 != 0 && i % 5 != 0)
                    //vagy csak 3-al osztható, a többivel nem
                    || (i % 2 != 0 && i % 3 == 0 && i % 5 != 0)
                    //vagy csak 5-el osztható, a többivel nem
                    || (i % 2 != 0 && i % 3 != 0 && i % 5 == 0)) {
                System.out.print(i + ", ");
            }
        }
    }
}
