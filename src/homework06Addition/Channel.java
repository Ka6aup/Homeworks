package homework06Addition;
import java.util.Arrays;
import java.util.StringJoiner;

public class Channel {
    private String nameChannel;
    private int numberChannel;
    private Program[] programs;

    public Channel() {
    }

    public Channel(String nameChannel, int numberChannel, Program[] programs) {
        this.nameChannel = nameChannel;
        this.numberChannel = numberChannel;
        this.programs = programs;
    }
    private Program getRandomProgram() {
        return programs[(int) (Math.random() * programs.length)];
    }

    public String getNameChannel() {
        return nameChannel;
    }
    public void setNameChannel(String nameChannel) {
        this.nameChannel = nameChannel;
    }
    public int getNumberChannel() {
        return numberChannel;
    }
    public void setNumberChannel(int numberChannel) {
        this.numberChannel = numberChannel;
    }
    public Program[] getPrograms() {
        return programs;
    }
    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }

}
