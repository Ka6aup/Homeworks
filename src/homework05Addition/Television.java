package homework05Addition;

import java.util.Objects;

public class Television {
    private String brand;
    private int year;
    private boolean smart;
    private int channel;
    private int volume;
    private boolean on;

    public Television(String brand, int year, boolean smart, int channel, int volume, boolean on) {
        this.brand = brand;
        this.year = year;
        this.smart = smart;
        this.channel = channel;
        this.volume = volume;
        this.on = on;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public boolean isSmart() {
        return smart;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public String toString() {
        return "Телевизор " + brand + ", " + year + " года, " + "Смарт - " + smart +
                ". Номер включенного канала - " + channel + ", громкость - " + volume +
                ", включен -  " + on + ".";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television t = (Television) o;
        return  year == t.year &&
                smart == t.smart &&
                channel == t.channel &&
                volume == t.volume &&
                on == t.on &&
                Objects.equals(brand, t.brand);
    }
    public int hashCode() {
        return Objects.hash(brand, year, smart, channel, volume, on);
    }
}
