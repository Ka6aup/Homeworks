package homework09;
import homework09.Car.Car;
import homework09.Car.PerformanceCar;
import homework09.Car.ShowCar;
import homework09.Garage.Garage;
import homework09.Race.Race;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public App() throws IOException {
    }
    public static void main(String[] args) throws IOException {
        FileReader inputFileCars = new FileReader("D:\\Обучение\\DZ\\src\\homework09\\carInput.txt");
        FileReader inputFileRace = new FileReader("D:\\Обучение\\DZ\\src\\homework09\\raceInput.txt");

        BufferedReader carsReader = new BufferedReader(inputFileCars);
        List<Car> performanceCar = new ArrayList<>();
        List<Car> showCar = new ArrayList<>();
        String lines = carsReader.readLine();
        while (lines != null) {
            String[] line = lines.split("\\s+\\|\\s+");
            if (Integer.parseInt(line[4]) >= 360) {
                performanceCar.add(new PerformanceCar(line[0], line[1], Integer.parseInt(line[2]),
                        Integer.parseInt(line[3]), Integer.parseInt(line[4]),
                        Integer.parseInt(line[5]), Integer.parseInt(line[6])));

            } else {
                showCar.add(new ShowCar(line[0], line[1], Integer.parseInt(line[2]),
                        Integer.parseInt(line[3]), Integer.parseInt(line[4]),
                        Integer.parseInt(line[5]), Integer.parseInt(line[6]), 0));

            }

            lines = carsReader.readLine();

        }

        carsReader.close();

        System.out.println("Машины гоночные PerformanceCar:");
        performanceCar.forEach(System.out::println);
        System.out.println("Машины спортивные ShowCar.Looking cool there. bro.:");
        showCar.forEach(System.out::println);

        Garage garage = new Garage(List.of(performanceCar.get(new Random().nextInt(performanceCar.size()))));
        System.out.println("Машины в гараже:");
        System.out.println(garage.getParkedCars());

        FileWriter writer = new FileWriter("D:\\Обучение\\DZ\\src\\homework09\\resultOutput.txt");
        String typeCar = "Машины гоночные PerformanceCar:";
        writer.write(typeCar + System.lineSeparator());

        for (Car resultPerfCar : performanceCar) {
            writer.write(resultPerfCar + System.lineSeparator());
        }
        String typeCar2 = "Машины спортивные ShowCar.Looking cool there. bro.:";

        writer.write(typeCar2 + System.lineSeparator());
        for (Car resultshowCar : showCar) {
            writer.write(resultshowCar + System.lineSeparator());
        }

        writer.write("Машины в гараже: " + garage.getParkedCars() + System.lineSeparator());

        BufferedReader raceReader = new BufferedReader(inputFileRace);
        List<Race> raceType = new ArrayList<>();
        String lineRace = raceReader.readLine();
        while (lineRace != null) {
            String[] liner = lineRace.split("\\|");
            raceType.add (new Race(liner[0], Integer.parseInt(liner[1]),
                    liner[2], Integer.parseInt(liner[3])));
            lineRace = raceReader.readLine();

        }
        raceReader.close();

        raceType.forEach(race -> {
            System.out.println("Тип гонок " + race.getType());
            System.out.println(race);
        });

        for (Race race : raceType) {
            writer.write("Тип гонок " + race.getType() + System.lineSeparator());
            writer.write(race + System.lineSeparator());
        }

        writer.close();
    }
}
