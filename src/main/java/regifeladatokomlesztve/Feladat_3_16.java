/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_16 {
    // Tölts fel egy 10 sorból és 10 oszlopból álló kétdimenziós tömböt véletlen számokkal a [0;9] intervallumból!
    // Írd ki, hol van a bal felső sarka annak a 3×3-as négyzetnek a 10×10-es területen belül,
    // amelyik által lefedett területen legnagyobb a számok összege!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 sorból és 10 oszlopból álló kétdimenziós tömböt véletlen számokkal a [0;9] intervallumból!\n"
                + "Írd ki, hol van a bal felső sarka annak a 3×3-as négyzetnek a 10×10-es területen belül,\n"
                + "amelyik által lefedett területen legnagyobb a számok összege!");

        int[][] matrix = new int[10][10];
        System.out.println("\nA mátrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(String.format("%3d", matrix[i][j]));
            }
            System.out.println();
        }

        int maxIindex = 0;
        int maxJindex = 0;
        int max = -1;

        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 0; j < matrix[0].length - 3; j++) {
                int sum = 0;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        sum += matrix[k + i][l + j];
                    }
                }
                if (sum > max) {
                    max = sum;
                    maxIindex = i;
                    maxJindex = j;
                }
            }
        }

        System.out.println("\nEredmény:");
        System.out.println("Sor: " + (maxIindex + 1));
        System.out.println("Oszlop: " + (maxJindex + 1));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(String.format("%3d", matrix[i + maxIindex][j + maxJindex]));
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(String.format(" %2d", i+1));
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(String.format(" %2d", i+1));
            for (int j = 0; j < matrix[0].length; j++) {
                if (i >= maxIindex && i < maxIindex + 3 && j >= maxJindex && j < maxJindex + 3) {
                    System.out.print(String.format("%3d", matrix[i][j]));
                } else {
                    System.out.print("  .");
                }
            }
            System.out.println();
        }
    }
}
