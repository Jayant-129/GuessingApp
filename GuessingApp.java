
/*
    Guessing App -  Game Initialization
    UC1-This Class Serve as entry point for application
    UC2-Validate the Guess of User
    UC3-Generate Hint for User on Wrong Guess
    UC4-Validate the Input from the User
    UC5-Store the result of the Game 
    UC6-Restart or exit based on User chpice

    @author - developer
    @version - 6.0
*/

import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) throws InvalidInputException{

        System.out.println("========================");
        System.out.println("Welcome to Guessing App ");
        System.out.println("========================\n");

        Scanner scanner = new Scanner(System.in);
        boolean restart;
        do{
            System.out.print("Enter your name: ");
            String player = scanner.nextLine();
            
            GameConfig gameConfig = new GameConfig();
            gameConfig.showRules();

            int attempts = 0 , hintUsed = 0;
            boolean win = false;

            while(attempts < gameConfig.getMaxAttempts()){
                System.out.println("Enter your guess: ");
                int guess = ValidationService.validateInput(scanner.nextLine());
                attempts++;

                String result = GuessValidator.validateGuess(guess,gameConfig.getTargetNumber());

                if(!"CORRECT".equals(result) && hintUsed < gameConfig.getMaxHint()){
                    hintUsed++;
                    System.out.println(HintService.generateHint(gameConfig.getTargetNumber(),hintUsed));
                }
                if("CORRECT".equals(result)){
                    win = true;
                    break;
                }
                System.out.println(result);
            }
            StorageService.saveResult(player,attempts,win);
            restart = GameController.restartGame(scanner);
        }while(restart);
        
        scanner.close();
    }
}