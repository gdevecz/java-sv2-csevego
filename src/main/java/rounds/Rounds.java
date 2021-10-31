package rounds;

public class Rounds {

    public static void main(String[] args) {

        double d = -4.8;
        double e = -4.2;
        double f = 2.3;
        double g = 2.8;

        System.out.println(" Amire leginkább figyelni kell, az a negatív számok ceil/floor/truncate különbsége:");
        System.out.println(" A matematikai kerekítés:");
        System.out.println(" Math.round(" + d + ") = " + Math.round(d));
        System.out.println(" Math.round(" + e + ") = " + Math.round(e));
        System.out.println(" Math.round(" + f + ") = " + Math.round(f));
        System.out.println(" Math.round(" + g + ") = " + Math.round(g));
        System.out.println(" Ceil (A valós számnál nem kisebb, legkisebb egész szám");
        System.out.println(" Math.ceil(" + d + ") = " + Math.ceil(d));
        System.out.println(" Math.ceil(" + e + ") = " + Math.ceil(e));
        System.out.println(" Math.ceil(" + f + ") = " + Math.ceil(f));
        System.out.println(" Math.ceil(" + g + ") = " + Math.ceil(g));
        System.out.println(" Floor (A valós számnál nem nagyobb, legnagyobb egész szám:");
        System.out.println(" Math.floor(" + d + ") = " + Math.floor(d));
        System.out.println(" Math.floor(" + e + ") = " + Math.floor(e));
        System.out.println(" Math.floor(" + f + ") = " + Math.floor(f));
        System.out.println(" Math.floor(" + g + ") = " + Math.floor(g));
        System.out.println("Truncate ( a valós szám tizedesrészének elhagyása után:)");
        System.out.println("Nem találtam metódis implementációt, csak az explicit típusmódosítást.");
        System.out.println(" (int) " + d + " = " + (int)(d));
        System.out.println(" (int) " + e + " = " + (int)(e));
        System.out.println(" (int) " + f + " = " + (int)(f));
        System.out.println(" (int) " + g + " = " + (int)(g));
    }
}
