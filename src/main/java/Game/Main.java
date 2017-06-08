package Game;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-06-07.
 */
public class Main {
    public static void main(String[] args) {
        int human = 1;
        int PC = 2;
        Random rand = new Random();
        int NumberToGuess = rand.nextInt(100 + 1);
        int NumberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int Guess;
        boolean winHuman = false;
        boolean winCpu = false;
        System.out.println("Type 1 for human and 2 for PC to pick the player");
        Scanner playerinput = new Scanner(System.in);

        if (playerinput.nextInt() == 1) {
            while (!winHuman) {
                System.out.println("Guess a number between 1 and 100: ");
                Guess = input.nextInt();
                NumberOfTries++;

                if (Guess == NumberToGuess) {
                    winHuman = true;
                    System.out.println("You win!");
                    System.out.println("It took you " + NumberOfTries + " tries to find the number!");
                    System.out.println("The number was: " + NumberToGuess);
                    input.close();
                } else if (Guess < NumberToGuess) {
                    System.out.println("Your guess is too low");
                } else if (Guess > NumberToGuess) {
                    System.out.println("Your guess is too high");
                }
            }
        }

        if (playerinput.nextInt() == 2) {
            while (!winCpu) {
                System.out.println("Human, type a number from 1 to 100");
                Scanner inputforPC = new Scanner(System.in);
                Guess = inputforPC.nextInt();
                NumberOfTries++;

                if (Guess == NumberToGuess) {
                    winCpu = true;
                    System.out.println("You win!");
                    System.out.println("It took you " + NumberOfTries + " tries to find the number!");
                    System.out.println("The number was: " + NumberToGuess);
                } else if (Guess < NumberToGuess) {
                    int highestValue = Guess;
                    System.out.println("Hmm it seems that my number is ");
                } else if (Guess > NumberToGuess) {
                    System.out.println("Your guess is too high");
                }
            }
        }
    }
}
//wrzucanie do seta zgadniete liczby