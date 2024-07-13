package homework06Addition;
import java.util.Arrays;
import java.util.StringJoiner;

public class Chanel {
    private String nameChanel;
    private int numberChanel;
    private Program[] programs;
    private Program targetProgram;

    public Chanel() {
    }

    public Chanel(String nameChanel, int numberChanel, Program[] programs) {
        this.nameChanel = nameChanel;
        this.numberChanel = numberChanel;
        this.programs = programs;
        this.targetProgram = getRandomProgram();
    }
    private Program getRandomProgram() {
        return programs[(int) (Math.random() * programs.length)];
    }

    public String getNameChanel() {
        return nameChanel;
    }
    public void setNameChanel(String nameChanel) {
        this.nameChanel = nameChanel;
    }
    public int getNumberChanel() {
        return numberChanel;
    }
    public void setNumberChanel(int numberChanel) {
        this.numberChanel = numberChanel;
    }
    public Program[] getPrograms() {
        return programs;
    }
    public void setPrograms(Program[] programs) {
        this.programs = programs;
    }
    public Program getTargetProgram() {
        return targetProgram;
    }
    public void setTargetProgram(Program targetProgram) {
        this.targetProgram = targetProgram;
    }
    @Override
    public String toString() {
        return new StringJoiner(", ",  "" + "", "")
                .add("nameChanel = '" + nameChanel + "'")
                .add("numberChanel = " + numberChanel)
                .add("programs = " + Arrays.toString(programs))
                .toString();
    }
}
