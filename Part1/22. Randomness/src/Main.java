import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Exercise 80: Rolling the dice
//        In the template is class Dice that has the following functionality:
//        The constructor Dice(int numberOfSides) creates a new dice object that has the amount of sides defined by the argument.
//                The method roll tells the result of a roll (which depends on the number of its sides)\
        Dice dice = new Dice(6);
        int i = 0;
        while ( i < 10 ) {
            System.out.println( dice.roll() );
            i++;
        }

//        Exercise 81: Password randomizer
//        Your assignment is to expand the class PasswordRandomizer that has the following functionality:
//        The constructor PasswordRandomizer creates a new object, which uses the given password length.
//                The method createPassword returns a new password, which consists of symbols a-z and is of the length given as a parameter to the constructor
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());

//        Exercise 82: Lottery
//        Your assignment is to expand the class LotteryNumbers, which draws the lottery numbers of the week.
//        The numbers of the week consist of 7 different numbers between 1 and 39. The class has the following functionality:
//        the constructor LotteryNumbers creates a new LotteryNumbers object, which contains the new drawn numbers
//        the method numbers returns the drawn numbers of this draw
//        the method drawNumbers draws new numbers
//        the method containsNumber reveals if the number is among the drawn numbers
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");

//        Exercise 83.1: Guessing a letter
//        Touch only the method guessLetter(String letter) in this assignment!
//                When a user guesses a letter, the user interface calls method guessLetter which is supposed to take care of action related to guessing a letter.
//        First, it should check if the letter has already been guessed. In that case, the method does not do anything.
//                The method increases the number of faults (this.numberOfFaults) if the word (this.word) does not contain the guessed letter.
//        Then the letter is added among the already guessed letters (the object variable this.guessedLetters).
        HangmanLogic l = new HangmanLogic("kissa");
        System.out.println("guessing: A, D, S, F, D");
        l.guessLetter("A");   // correct
        l.guessLetter("D");   // wrong
        l.guessLetter("S");   // correct
        l.guessLetter("F");   // wrong
        l.guessLetter("D");   // This should not have any effect on the number of faults since D was already guessed
        System.out.println("guessed letters: "+l.guessedLetters());
        System.out.println("number of faults: "+l.numberOfFaults());

//        Exercise 83.2: Creating the hidden word
//        The Hangman user interface shows a hidden version of the word to the user.
//        In the above figure, the hidden word is METO_I. All the letters that the user has already guessed are shown in the hidden word but the rest of the letters are replaced with underscores.
//                In this part of the assignment, you should complete the method hiddenWord of Hangman logic that takes care of building the hidden word for the user interface.
        HangmanLogic l = new HangmanLogic("kissa");
        System.out.println("word is: "+l.hiddenWord());

        System.out.println("guessing: A, D, S, F, D");
        l.guessLetter("A");
        l.guessLetter("D");
        l.guessLetter("S");
        l.guessLetter("F");
        l.guessLetter("D");
        System.out.println("guessed letters: "+l.guessedLetters());
        System.out.println("number of faults: "+l.numberOfFaults());
        System.out.println("word now: "+l.hiddenWord());
    }
}
