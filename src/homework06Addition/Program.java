package homework06Addition;
import java.util.StringJoiner;

public class Program {
    private String nameProgram;
    private int ratingProgram;
    private int countOfViewers;

    public Program() {

    }
    public Program(String nameProgram) {
        this.nameProgram = nameProgram;
        this.ratingProgram = getRandomRatingProgram();
        this.countOfViewers = getRandomViewerProgram();
    }
    private int getRandomRatingProgram() {
        return (int) (Math.random() * 100);
    }
    private int getRandomViewerProgram() {
        return (int) (Math.random() * 1000);
    }

}
