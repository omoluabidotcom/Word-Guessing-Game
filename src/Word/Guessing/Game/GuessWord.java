package Word.Guessing.Game;

import java.util.Scanner;

public class GuessWord {

    // class instance
    private WordSmith wordsmith = new WordSmith();
    private Scanner scan = new Scanner(System.in);

    // fields
    private boolean start = true;
    private int rounds = 13;
    private String varGuesser;

    // start method start's the game when called
    public void start() {

        do{

            showWordSize();
            getPlayerInput();
            checkPlayerInput();
        } while(start);
    }

    // show the word to be guessed in blanks
    void showWordSize() {

        System.out.println("You have " +rounds+ " number of tries left");
        System.out.println(wordsmith);
    }

    // get player each alphabet guess
    void getPlayerInput() {

        System.out.println("Enter your Guess");
        varGuesser = scan.nextLine();
    }

    // check if all guess is complete and congratulate player or if number of tries exceeded and end game
    void checkPlayerInput() {

        boolean limboGuess = wordsmith.guess(varGuesser.charAt(0));

        if (limboGuess) {
            if (wordsmith.isGuessedRight()) {

                System.out.println("Congrat you have won, the word is " + wordsmith);
                start = false;
            }
        } else {
            rounds--;

            if(rounds == 0) {

                System.out.println("You have finish you number of tries and have loss the game");
                start = false;
            }
        }
    }
}
