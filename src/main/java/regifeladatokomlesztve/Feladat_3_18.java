/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_18 {
    // Tölts fel egy 10 elemű tömböt páros és páratlan számokkal a [-20;20] intervallumból úgy,
    // hogy mindkét fajtából 5-5 darab legyen! A számok eloszlásába minél kevésbé nyúlj bele!
    // (pl ne tedd az 5-5 db számot egymás mellé, vagy direkt felváltva, stb, igyekezz minél kevésbé befolyásolni a sorrendet)

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 elemű tömböt páros és páratlan számokkal a [-20;20] intervallumból úgy,\n"
                + "hogy mindkét fajtából 5-5 darab legyen! A számok eloszlásába minél kevésbé nyúlj bele!\n"
                + "(pl ne tedd az 5-5 db számot egymás mellé, vagy direkt felváltva, stb,\n"
                + "igyekezz minél kevésbé befolyásolni a sorrendet)");

        int[] array = new int[10];
        int numberOfEvens = 5;
        int numberOfOdds = 5;
        int counter = 0;
        System.out.println("\nA tömb:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 41) - 20;
            if (numberOfEvens == 0 && array[i] % 2 == 0) {
                while ((array[i] = (int) (Math.random() * 41) - 20) % 2 == 0) {
                    counter++;
                }
            }
            if (numberOfOdds == 0 && array[i] % 2 != 0) {
                while ((array[i] = (int) (Math.random() * 41) - 20) % 2 != 0) {
                    counter++;
                }
            }
            if (array[i] % 2 == 0) {
                numberOfEvens--;
            } else {
                numberOfOdds--;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("páros maradék: "+numberOfEvens);
        System.out.println("páratlan maradék: "+numberOfOdds);
        System.out.print("   páros: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                System.out.print("+");
            }
        }
        System.out.println();
        System.out.print("páratlan: ");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                System.out.print("+");
            }
        }
        System.out.println();
        System.out.println("Újradobások száma: " + counter);
    }

}
