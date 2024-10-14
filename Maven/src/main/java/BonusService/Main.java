package BonusService;
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        //service.calculate(amount, registered);

        //long bonus = service.calculate(amount, registered);
        //System.out.println("Bonus amount: " + bonus);
        System.out.println(service.calculate(amount, registered));

    }
}