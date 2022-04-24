package Word.Guessing.Game;

import java.util.Random;

public class WordSmith {

    // array to hold all possible word
    private String[] randomWord = {"razor", "president", "favour", "leadership", "nigeria", "rivers", "programming"
                                    , "frontend", "backend", "cloud"};
    // fields
    private Random random = new Random();
    private String selectedWord;

    private char[] letters;

    // class constructor
    public WordSmith() {

        // word selection process
        selectedWord = randomWord[random.nextInt(randomWord.length)];
        // letters array size declare
        letters = new char[selectedWord.length()];
    }

    // tostring array for the class wordsmith
    public String toString() {

        StringBuilder wordy = new StringBuilder();

        for (char letter: letters) {

            if(letter == '\u0000') {

                wordy.append('-');
            } else {

                wordy.append(letter);
            }
            wordy.append(' ');
        }

        return wordy.toString();
    }

    // guess check if a guess is correct and set it to the array letters
    public boolean guess(char guess) {

        boolean varGuess = false;
        for (int i = 0; i < selectedWord.length(); i++) {

            if(guess == selectedWord.charAt(i)) {

                letters[i] = guess;
                varGuess = true;
            }
        }

        return varGuess;
    }

    // isguessedright check if all letters have been guessed right
    public boolean isGuessedRight() {

        boolean guess = true;
        for (char letter:letters) {

            if(letter == '\u0000') {

               guess = false;
            }
        }
        return  guess;
    }
}
