package homework012.test;

import homework012.repository.PersonsRepository.PersonsRepositoryImpl;
import homework012.repository.ScannerHelperRepository.ScannerHelperRepositoryImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ScannerHelperRepositoryImpl scannerHelper = new ScannerHelperRepositoryImpl();
        PersonsRepositoryImpl personsMethods = new PersonsRepositoryImpl();

        String personsInfoString = scannerHelper.getThePersonsDataStringFromConsole(scanner);

        personsMethods.setWriteTheModifiedPersonStringIntoTheFile(personsInfoString);

        scanner.close();
    }
}
