package guessthenumberwithio;

import java.util.Scanner;

public class GuessTheNumberIO {

    //    Na ez megint kicsit olyan nem tudom hogy legyen, azért attributumként vettem fel a Scanner-t mert a metódushívásnál
    //    állandóan példányosítanék egy újat, ellenben ez meg nagyrész csak foglalja a memóriát, szóval passz.
    //    Lehet az kiküszöbölné a nextInt() problémáját, de a Stream könnyen lehet független a Scanner példányától,
    //    ezt még kitesztelem.
    //    Igazából konstruktor sem kéne, mert a Scanner-t az attributum deklarációnál inicializálhatnám is.
    private Scanner sc;

    public GuessTheNumberIO() {
        sc = new Scanner(System.in);
    }

    public void introducingTheGame() {
        System.out.println("I have thought of a number between 1 and one hundred.");
        System.out.println("You should find out this number from six tries.");
    }

    public void informAboutFail(int theNumber) {
        System.out.println("Sorry, You have failed. Tought number: " + theNumber);
    }

    public void informAboutSuccess(int theNumber, int numberOfGuesses) {
        System.out.println("Congratulation! You solved with " + numberOfGuesses + " guesses!" +
                " Tought number: " + theNumber + ".");
    }

    public void informAboutUnsuccessfulGuess(int guess, int difference) {
        System.out.println("The " + guess + " is " +
                (difference < 0
                        ? "lesser"
                        : "greater") +
                " than the number.");
    }

    //    Csak a nextInt()után a streamben maradt \n miatt. Itt nem lenne gond, de a progam bővítésénél
    //    nem tudni hogy gondot okozna-e.
    //    Így is jó lenne:
    //    int guess = sc.nextInt();
    //    sc.nextLine();
    //    return guess;
    //    Én így szoktam meg "Integer.parseInt(sc.nextLine())", nincs utána probléma, elfelejtett nextline(),
    //    és egyből mehet értéknek return-nak is. Max. megmondják, hogy szokjak le róla. :)
    //
    //    Itt reprezentálnám, hogy én szívem szerint a paraméter fejléce és a törzse között hagynék egy sort,
    //    lehet más nyelvi berögzültség teszi. Erre nem emlékszem hogy említették volna hogy lehet vagy sem.
    //    Az hogy a { hol van, nem mozgat, csak vizuálisan számomra valahogy jobb :), de tény hogy nyújtja a kódot,
    //    lehet el kéne felejtenem.
    public int askANumber(int numberOfGuesses) {

        System.out.print("Give your " + numberOfGuesses + ". guess: ");
        return Integer.parseInt(sc.nextLine());
    }
}
