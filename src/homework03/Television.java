package homework03;

public class Television {
    private String brand;
    private int year;
    private boolean smart;

    public Television(String brand, int year, boolean smart) {
        this.brand = brand;
        this.year = year;
        this.smart = smart;
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

    public String toString() {
        return "Телевизор " + brand + ", " + year + " года, " + "Смарт - " + smart;
    }
}
