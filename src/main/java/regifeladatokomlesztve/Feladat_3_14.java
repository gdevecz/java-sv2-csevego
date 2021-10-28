/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_14 {
    // Adott egy 5 sorból és 5 oszlopból álló kétdimenziós tömb. Töltsd fel úgy elemekkel a [0;9] intervallumból, hogy a tömb főátlójában (bal felső elemtől a jobb alsó elemig) 0 értékek legyenek, felette csak páros, alatta csak páratlan számok lehetnek, majd írd ki a tömb elemeit!

    public static void main(String[] args) {
        System.out.println("Adott egy 5 sorból és 5 oszlopból álló kétdimenziós tömb.\n"
                + "Töltsd fel úgy elemekkel a [0;9] intervallumból, hogy \n"
                + "a tömb főátlójában (bal felső elemtől a jobb alsó elemig) 0 értékek legyenek,\n"
                + "felette csak páros, alatta csak páratlan számok lehetnek, majd írd ki a tömb elemeit!");

        System.out.println("\nEredmény:");
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int number=0;
                if(i!=j){
                    number=(int)(Math.random()*5)*2;
                    if(i>j){
                        number++;
                    }
                }
                matrix[i][j]=number;
                System.out.print(String.format("%3d", matrix[i][j]));
            }
            System.out.println();
        }
    }
}
