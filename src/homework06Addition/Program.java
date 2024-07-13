package homework06Addition;
import java.util.StringJoiner;

public class Program {
    private String nameProgram;
    private int ratingProgram;
    private int viewerProgram;

    public Program() {

    }
    public Program(String nameProgram) {
        this.nameProgram = nameProgram;
        this.ratingProgram = getRandomRatingProgram();
        this.viewerProgram = getRandomViewerProgram();
    }
    private int getRandomRatingProgram() {
        return (int) (Math.random() * 100);
    }
    private int getRandomViewerProgram() {
        return (int) (Math.random() * 1000);
    }
    public String toString() {
        return new StringJoiner(", ", "" + "", "")
                .add("Название программы = '" + nameProgram + "'")
                .add("рейтинг программы = " + ratingProgram)
                .add("viewerProgram = " + viewerProgram)
                .toString();
    }
}
