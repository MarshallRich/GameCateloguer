import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by MacLap on 2/10/16.
 */
public class InfoSaver {

    public static Scanner scanner = new Scanner(System.in);
    public static Game game = new Game();

    public static void main(String[] args) {

        try {
            game = loadGame();
            System.out.println("Game data found!");
            System.out.println(game);
        } catch (Exception e) {
            System.out.println("No game found!");
        }

    enterInfo();

}

    public static void enterInfo() {
        System.out.println("Enter new game information? [y/n]");
        String editInfo = scanner.nextLine();

        if (editInfo.equalsIgnoreCase("y")) {
            game.chooseName();
            game.chooseDev();
            game.chooseReleaseYear();
            game.chooseTimesBeaten();
            game.chooseGenre();
            try {
                saveGame();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        else if (editInfo.equalsIgnoreCase("n")) {
            System.out.println("Goodbye.");
            System.exit(0);
        }

        else {
            System.out.println("Invalid answer. Please try again.");
            enterInfo();
        }
    }


    public static void saveGame() throws IOException {
        JsonSerializer s = new JsonSerializer();
        String json = s.serialize(game);

        File f = new File("game.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public static Game loadGame() throws FileNotFoundException {
        File f = new File("game.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();

        JsonParser p = new JsonParser();
        return p.parse(contents, Game.class);
    }

}