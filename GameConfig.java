/*
    Use Case 1: Game Initialization

    This class resposible for-
    -Setting game boundries
    -Generating random numebrs
    -Displaying rules


*/
import java.util.Random;

public class GameConfig {
   private final int MIN = 1;
    private final int MAX = 100;
    private final int MAX_ATTEMPTS = 7;
    private final int MAX_HINT = 3;

    int targetNumber;

    public GameConfig(){
        Random random = new Random();
        this.targetNumber = random.nextInt(MAX - MIN + 1) + MIN;
    }

    public int getTargetNumber() {return this.targetNumber;}

    public int getMaxAttempts()  {return this.MAX_ATTEMPTS;}

    public int getMaxHint() {return this.MAX_HINT;}

    public void showRules(){
        System.out.println(" Guess the number between " + MIN + " and " + MAX);
        System.out.println(" You have " + MAX_ATTEMPTS + " attempts ");
        System.out.println(" Hints will be provided after wrong guesses. \n");
    }
}
