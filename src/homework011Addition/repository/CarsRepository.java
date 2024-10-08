package homework011Addition.repository;

import homework011Addition.model.Car;

import java.util.ArrayList;

public interface CarsRepository {
    String readCarsDataStringFromTheFile(String path) throws Exception;
    ArrayList<Car> setCarsCollectionFromTheString(String dataString) throws Exception;
    void writeTheResultsToTheFile(String resultString, String fileName);
}