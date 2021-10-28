/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_2_12 {
    //Sorsolj ki egy számot az [1;5] intervallumból, melyek egy érdemjegyet jelentenek. Írd ki a számnak megfelelő szöveges értékelést!

    public static void main(String[] args) {
        System.out.println("Sorsolj ki egy számot az [1;5] intervallumból, melyek egy érdemjegyet jelentenek. Írd ki a számnak megfelelő szöveges értékelést!");
        int grade;
        System.out.println("\nAz érdemjegy: " + (grade = ((int) (Math.random() * 5) + 1)));

        System.out.println("\nEredmény:");
        System.out.print("Szöveges értékelés: ");
        // else-if szerkezettel:
/*
        if (grade == 5) {
            System.out.println("jeles");
        } else if (grade == 4) {
            System.out.println("jó");
        } else if (grade == 3) {
            System.out.println("közepes");
        } else if (grade
                == 2) {
            System.out.println("elégséges");
        } else {
            System.out.println("elégtelen");
        }
*/
        // switch szerkezettel
        switch (grade) {
            case 1:
                System.out.println("elégtelen");
                break;
            case 2:
                System.out.println("elégséges");
                break;
            case 3:
                System.out.println("közepes");
                break;
            case 4:
                System.out.println("jó");
                break;
            default:
                System.out.println("jeles");
                break;
        }
        System.out.println();
    }
}
