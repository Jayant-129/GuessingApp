import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class StorageService {
    public static void saveResult(String player,int attempts, boolean win){
        try(BufferedWriter writer = 
            new BufferedWriter(new FileWriter("game_result.txt",true))){
            writer.write(" Player: " + player +
                ", Attempts: " + attempts + 
                ", Results: " + ((win)? "WIN":"LOOSE")
            );
            writer.newLine();
        }
        catch(IOException e){
            System.out.println(" Unable to save Game results ");
        }
    }
}
