/*
UC2- Validate the Guess of User
@authour - developer
@version - 2.0
*/

class GuessValidator {
    public static String validateGuess(int guess, int target){
        if(guess == target){
            return "CORRECT";
        }
        else if(guess < target){
            return "LOW";
        }
        return "HIGH";
    } 
}
