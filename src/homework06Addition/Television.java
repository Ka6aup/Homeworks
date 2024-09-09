package homework06Addition;
import java.util.Arrays;
import java.util.StringJoiner;

public class Television {
    private final String brand;
    private final Channel[] channels;
    private int volume;
    private boolean turnOn;
    private Channel targetChannel;

    public Television(String brand, Channel[] channels) {
        this.brand = brand;
        this.channels = channels;
    }
    public Television(String brand, Channel[] channels, Channel targetChannel, int volume, boolean turnOn) {
        this.brand = brand;
        this.channels = channels;
        this.targetChannel = targetChannel;
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
    public Channel getTargetChannel() {
        return targetChannel;
    }
    public void setTargetChannel(Channel targetChannel) {
        this.targetChannel = targetChannel;
    }
    public String getBrand() {
        return brand;
    }
    public void changeChannel() {
        targetChannel = channels[(int) (Math.random() * channels.length)];
    }

}
