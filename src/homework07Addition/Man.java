package homework07Addition;

public class Man extends Person {
    private double creditLine;

    public Man() {
    }

    public Man(String name, double cash, int age, int creditLine) {
        super(name, cash, age);
        this.creditLine = creditLine;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }
}
