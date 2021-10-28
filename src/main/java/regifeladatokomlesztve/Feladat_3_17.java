
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Feladat_3_17 {
    //Tölts fel egy legalább 3×3 tetszőleges méretű, nem feltétlenül négyzet alakú kétdimenziós tömböt (maximum 20×20) véletlen számokkal a [0;9] intervallumból! Hol van annak a + jelnek a közepe, amelyik által lefedett területen legnagyobb a számok összege?
    //             2
    //jel példa: 5 8 7
    //             7

    public static void main(String[] args) {
        System.out.println("Tölts fel egy legalább 3×3 tetszőleges méretű, nem feltétlenül négyzet alakú\n"
                + "kétdimenziós tömböt (maximum 20×20) véletlen számokkal a [0;9] intervallumból!\n"
                + "Hol van annak a + jelnek a közepe, amelyik által lefedett területen legnagyobb a számok összege?\n"
                + "             2\n"
                + "jel példa: 5 8 7\n"
                + "             7");

        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int n, m;
        System.out.print("\nKérem a sorok számát: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.print("Kérem az oszlopok számát: ");
        m = Integer.parseInt(sc.nextLine());

        matrix = new int[n][m];
        System.out.println("\nA " + n + "x" + m + "-es mátrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(String.format("%2d", matrix[i][j]));
            }
            System.out.println();
        }

        int maxI = 0;
        int maxJ = 0;
        int max = -1;

        for (int i = 1; i < matrix.length - 1; i++) {
            int sum;
            for (int j = 1; j < matrix[0].length-1; j++) {
                sum = matrix[i-1][j] + matrix[i + 1][j];
                for (int k = -1; k < 1; k++) {
                    sum += matrix[i][j + k];
                }
                if (sum > max) {
                    max = sum;
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        
        System.out.println("\nEredmény:");
        System.out.println("Sor: "+(maxI+1)+", oszlop: "+(maxJ+1));
        System.out.println("   "+matrix[maxI-1][maxJ]);
        for (int i = -1; i < 2; i++) {
            System.out.print(String.format("%2d",matrix[maxI][maxJ+i]));
        }
        System.out.println();
        System.out.println("   "+matrix[maxI][maxJ+1]);

    }
}
