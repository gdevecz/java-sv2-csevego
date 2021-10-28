package randomtest;

import java.util.Random;

public class Randomtest {

    public static void main(String[] args) {

        Random rnd1 = new Random();
        Random rnd2 = new Random();
        Random rnd3 = new Random();

        int a = rnd1.nextInt(100);
        int b = rnd2.nextInt(100);
        int c = rnd3.nextInt(100);

        for (int i = 0; i < 10; i++) {
            System.out.println(rnd1.nextInt(100));
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = rnd1.nextInt(100) + 1;
        b = rnd1.nextInt(100) + 1;
        c = rnd1.nextInt(100) + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = (int) (Math.random() * 100) + 1;
        b = (int) (Math.random() * 100) + 1;
        c = (int) (Math.random() * 100) + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
