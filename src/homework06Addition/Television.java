package homework06Addition;
import java.util.Arrays;
import java.util.StringJoiner;

public class Television {
    private final String brand;
    private final Chanel[] channels;
    private int volume;
    private boolean turnOn;
    private Chanel targetChanel;

    public Television(String brand, Chanel[] channels) {
        this.brand = brand;
        this.channels = channels;
    }
    public Television(String brand, Chanel[] channels, Chanel targetChanel, int volume, boolean turnOn) {
        this.brand = brand;
        this.channels = channels;
        this.targetChanel = targetChanel;
        this.volume = volume;
        this.turnOn = turnOn;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isTurnOn() {
        return turnOn;
    }
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    public Chanel getTargetChanel() {
        return targetChanel;
    }
    public void setTargetChanel(Chanel targetChanel) {
        this.targetChanel = targetChanel;
    }
    public String getBrand() {
        return brand;
    }
    public void changeChanel() {
        targetChanel = channels[(int) (Math.random() * channels.length)];
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", "" + "", "")
                .add("brand =  " + brand + "'")
                .add("channels = " + Arrays.toString(channels))
                .add("volume = " + volume)
                .add("turnOn = " + turnOn)
                .add("targetChanel = " + targetChanel)
                .toString();
    }

}
