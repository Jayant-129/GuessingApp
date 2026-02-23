/*
    Guessing App - UC1- Game Initialization
    This Class Serve as entry point for application
    
    @author - developer
    @version - 1.0
    
*/
public class GuessingApp {
    public static void main(String[] args){
        System.out.println("Welcome to Guessing App ");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();
    }
}
