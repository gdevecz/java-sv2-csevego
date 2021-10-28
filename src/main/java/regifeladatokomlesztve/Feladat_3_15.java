/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Feladat_3_15 {
    //Tölts fel egy 10 sorból és 10 oszlopból álló kétdimenziós tömböt véletlen számokkal a [-100;100] intervallumból! Írd ki, hogy melyik sorban legnagyobb az elemek összege. Ha több ilyen van, akkor az első sor sorszámát írd ki!

    public static void main(String[] args) {
        System.out.println("Tölts fel egy 10 sorból és 10 oszlopból álló kétdimenziós tömböt véletlen számokkal a [-100;100] intervallumból!\n"
                + "Írd ki, hogy melyik sorban legnagyobb az elemek összege. Ha több ilyen van, akkor az első sor sorszámát írd ki!");

        int[][] matrix = new int[10][10];
        System.out.println("\nEredmény:");
        System.out.println("\nA mátrix:");
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 201) - 100;
                System.out.print(String.format("%4d", matrix[i][j]));
                sum += matrix[i][j];
            }
            System.out.println(" = " + sum);
            if (max<sum) {
                max=sum;
                maxIndex=i;
            }

        }
        
        System.out.println("A legnagyobb elemösszegű sor: "+(maxIndex+1)+".");
    }
}
