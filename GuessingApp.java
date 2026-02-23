
/*
    Guessing App - UC1- Game Initialization
    -This Class Serve as entry point for application
    -It Intialize the game configuration and display the rules

    @author - developer
    @version - 2.0
*/

import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args){
        System.out.println("Welcome to Guessing App ");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        while(attempts < gameConfig.getMaxAttempts()){
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            String result = GuessValidator.validateGuess(guess,gameConfig.getTargetNumber());
            
            if("CORRECT".equals(result)){
                break;
            }
        }
    }
}
