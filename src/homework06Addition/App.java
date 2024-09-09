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
            int numberChannel = scanner.nextInt();
            System.out.println("Введите уровень звука от 0 до 100 :");
            int volume = scanner.nextInt();
            System.out.println("Включен ли телевизор ? Да или Нет) :");
            String turnOnS = scanner.next();
            boolean turnOn = turnOnS.equalsIgnoreCase("Да");
            newTele[i] = new Television(brand, getAllChannels(), getChannelByNumber(numberChannel), volume, turnOn);

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
                Channel targetChannel = tv.getTargetChannel();
                System.out.println(targetChannel.getNameChannel());
            }
        }
        Television tv = newTele[(int) (Math.random() * newTele.length)];
        System.out.println("Выбран случайный телевизор " + tv.getBrand() + " канал на нем " + tv.getTargetChannel().getNameChannel());
        tv.changeChannel();
        System.out.println("На данном телевизоре переключен канал на " + tv.getTargetChannel().getNameChannel());
    }

    private static Channel[] getAllChannels() {
        Channel one = new Channel("РТР", 1, getAllPrograms());
        Channel two = new Channel("СТС", 2, getAllPrograms());
        Channel three = new Channel("ТНТ", 3, getAllPrograms());
        Channel four = new Channel("Первый", 4, getAllPrograms());
        Channel five = new Channel("ТВЦ", 5, getAllPrograms());
        return new Channel[]{one, two, three, four, five};
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

    private static Channel getChannelByNumber(int numberChannel) {
        return getAllChannels()[numberChannel];
    }
}
