/*

-Handle lifecycle of the game
this class should decide weather game should
restart or exit based on user choices

@author - developer
@version - 6.0

*/

import java.util.Scanner;

class GameController {
    public static boolean restartGame(Scanner scanner){
        System.out.println("Do you want to play game? (Yes/No): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
