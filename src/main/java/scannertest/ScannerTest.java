package scannertest;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("szöveg:");
        String s = sc.nextLine();
        System.out.println(s);
        s = sc2.nextLine();
        System.out.println(s);

        System.out.println("számot:");
        int n = sc.nextInt();
        System.out.println(n);
        n = sc2.nextInt();
        System.out.println(n);
        System.out.println("szöveg:");
        s = sc.nextLine();
        System.out.println(s);
        s = sc2.nextLine();
        System.out.println(s);


        System.out.println("csak sc számot:");
        n = sc.nextInt();
        System.out.println(n);
        n = sc.nextInt();
        System.out.println(n);
        System.out.println("szöveg:");
        s = sc.nextLine();
        System.out.println(s);
        s = sc.nextLine();
        System.out.println(s);

        System.out.println("csk sc2 számot:");
        n = sc2.nextInt();
        System.out.println(n);
        n = sc2.nextInt();
        System.out.println(n);
        System.out.println("szöveg:");
        s = sc2.nextLine();
        System.out.println(s);
        s = sc2.nextLine();
        System.out.println(s);

        System.out.println("csak sc számot:");
        n = sc.nextInt();
        System.out.println("csak sc2 szöveg:");
        s = sc2.nextLine();
        System.out.println("csak sc2 szöveg:");
        s = sc2.nextLine();
    }
}
