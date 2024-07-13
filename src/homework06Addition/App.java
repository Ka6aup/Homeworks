package homework06Addition;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int minCount = 0;
        int maxCount = 3;
        Television[] newTele = new Television[maxCount];


        for (int i = minCount; i < maxCount; i++) {

            System.out.println("Введите бренд телевизора :" + (i + 1));
            String brand = scanner.next();
            System.out.println("Введите номер включенного канала от 0 до 4:");
            int numberChanel = scanner.nextInt();
            System.out.println("Введите уровень звука от 0 до 100 :");
            int volume = scanner.nextInt();
            System.out.println("Включен ли телевизор ? Да или Нет) :");
            String turnOnS = scanner.next();
            boolean turnOn = turnOnS.equalsIgnoreCase("Да");
            newTele[i] = new Television(brand, getAllChannels(), getChanelByNumber(numberChanel), volume, turnOn);

        } scanner.close();

        System.out.println("Список включенных телевизоров с громкостью от 50 до 100 : ");
        for (Television tv : newTele) {
            if (tv.getVolume() >= 50 && tv.getVolume() <= 100 && tv.isTurnOn()) {
                System.out.println(tv.getBrand());
            }
        }
        for (Television tv : newTele) {
            if (tv.isTurnOn()) {
                System.out.println("Каналы включенные на телевизоре " + tv.getBrand());
                Chanel targetChanel = tv.getTargetChanel();
                System.out.println(targetChanel.getNameChanel() + " " + targetChanel.getTargetProgram());
            }
        }
        Television tv = newTele[(int) (Math.random() * newTele.length)];
        System.out.println("Выбран случайный телевизор " + tv.getBrand() + " канал на нем " + tv.getTargetChanel().getNameChanel());
        tv.changeChanel();
        System.out.println("На данном телевизоре переключен канал на " + tv.getTargetChanel().getNameChanel());
    }

    private static Chanel[] getAllChannels() {
        Chanel one = new Chanel("РТР", 1, getAllPrograms());
        Chanel two = new Chanel("СТС", 2, getAllPrograms());
        Chanel three = new Chanel("ТНТ", 3, getAllPrograms());
        Chanel four = new Chanel("Первый", 4, getAllPrograms());
        Chanel five = new Chanel("ТВЦ", 5, getAllPrograms());
        return new Chanel[]{one, two, three, four, five};
    }

    private static Program[] getAllPrograms() {
        Program[] newChanel = new Program[5];
        newChanel[0] = new Program("Мультики");
        newChanel[1] = new Program("Новости");
        newChanel[2] = new Program("Доброе утро");
        newChanel[3] = new Program("Фильм");
        newChanel[4] = new Program("Шоу");
        return newChanel;
    }

    private static Chanel getChanelByNumber(int numberChanel) {
        return getAllChannels()[numberChanel];
    }
}
