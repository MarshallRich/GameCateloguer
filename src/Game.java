/**
 * Created by MacLap on 2/10/16.
 */
public class Game {
    public String name;
    public String developer;
    public int releaseYear;
    public int timesBeaten;
    public String genre;

    public Game(){

    }

    public Game(String name, String developer, int releaseYear, int timesBeaten, String Genre) {
        setName(name);
        setDeveloper(developer);
        setReleaseYear(releaseYear);
        setTimesBeaten(timesBeaten);
        setGenre(genre);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTimesBeaten(int timesBeaten) {
        this.timesBeaten = timesBeaten;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getTimesBeaten() {
        return timesBeaten;
    }

    public String getGenre() {
        return genre;
    }

    public void chooseName() {
        System.out.println("Please enter the name of the game:");
        name = InfoSaver.scanner.nextLine();
    }

    public void chooseDev() {
        System.out.println("Please enter the name of the game's developer:");
        developer = InfoSaver.scanner.nextLine();
    }

    public void chooseReleaseYear() {
        System.out.println("Please enter the game's release year:");
        releaseYear = Integer.valueOf(InfoSaver.scanner.nextLine());
    }

    public void chooseTimesBeaten() {
        System.out.println("Please enter the number of times you've beaten the game:");
        timesBeaten = Integer.valueOf(InfoSaver.scanner.nextLine());
    }

    public void chooseGenre() {
        System.out.println("Please enter the game's genre:");
        genre = InfoSaver.scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", releaseYear=" + releaseYear +
                ", timesBeaten=" + timesBeaten +
                ", genre='" + genre + '\'' +
                '}';
    }
}
