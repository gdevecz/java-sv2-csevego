package randomtest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Randomtest {

    public static void main(String[] args) {

        Math.decrementExact(2);
        int[] a = new int[10];
        Random rnd = new Random(13);
        System.out.println(rnd.nextInt(100));
        System.out.println(rnd.nextInt(100));


        "ererer".strip();
        Random rnd2 = new Random(13);
        System.out.println(rnd2.nextInt(100));
        System.out.println(rnd2.nextInt(100));

        System.out.println(rnd.nextInt(1000));
        System.out.println(rnd2.nextInt(100));
/*
        Random rnd1 = new Random();
         rnd2 = new Random();
        Random rnd3 = new Random();

         a = rnd1.nextInt(100);
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

 */
    }
}
