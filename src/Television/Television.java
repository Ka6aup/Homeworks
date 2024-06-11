package Television;

public class Television {
    private String brand;
    private int year;
    private boolean Smart;

    public Television(String brand, int year, boolean Smart) {
        this.brand = brand;
        this.year = year;
        this.Smart = Smart;
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
        return Smart;
    }
    public void setSmart(boolean Smart) {
        this.Smart = Smart;
    }

    public String toString() {
        return "Телевизор " + brand + ", " + year + " года, " + "Смарт - " + Smart;
    }
}
