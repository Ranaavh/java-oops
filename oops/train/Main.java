package oops.train;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxACSeats = 20;
        int maxFirstClassSeats = 30;
        int maxSecondClassSeats = 30;
        int maxGeneralSeats = 120;

        Train train = new Train(maxACSeats, maxFirstClassSeats, maxSecondClassSeats, maxGeneralSeats);
        Scanner scanner = new Scanner(System.in);

        // Adding passengers until the 20th stop
        boolean isTrainFull = false; // Track if the train is full
        for (int stop = 1; stop <= 22; stop++) {
            System.out.println("Current stop: " + stop);
            if (!isTrainFull) {
                int availableACSeats = maxACSeats - train.getACPassengerCount();
                int availableFirstClassSeats = maxFirstClassSeats - train.getFirstClassPassengerCount();
                int availableSecondClassSeats = maxSecondClassSeats - train.getSecondClassPassengerCount();
                int availableGeneralSeats = maxGeneralSeats - train.getGeneralPassengerCount();

                System.out.println("Available Seats:");
                System.out.println("******************");
                System.out.println("AC: " + availableACSeats);
                System.out.println("First Class: " + availableFirstClassSeats);
                System.out.println("Second Class: " + availableSecondClassSeats);
                System.out.println("General: " + availableGeneralSeats);

                System.out.println("Enter the number of passengers for AC compartment:");
                int acPassengers = Math.min(scanner.nextInt(), availableACSeats);

                System.out.println("Enter the number of passengers for First Class compartment:");
                int firstClassPassengers = Math.min(scanner.nextInt(), availableFirstClassSeats);

                System.out.println("Enter the number of passengers for Second Class compartment:");
                int secondClassPassengers = Math.min(scanner.nextInt(), availableSecondClassSeats);

                System.out.println("Enter the number of passengers for General compartment:");
                int generalPassengers = Math.min(scanner.nextInt(), availableGeneralSeats);

                train.addPassengers(stop, acPassengers, firstClassPassengers, secondClassPassengers, generalPassengers);

                if (train.isTrainFull()) {
                    isTrainFull = true;
                    System.out.println("No more passengers can be added. Train is full or not in service.");
                }
            }
            train.moveNextStop();
        }

        // Moving train and handling passenger leaving as per user input
        for (int stop = 23; stop <= 37; stop++) {
            if (stop == 23 || stop == 26 || stop == 29 || stop == 32 || stop == 35) {
                System.out.println("Current stop: " + stop);
                System.out.println("Total passengers remaining on the train: " + train.getPassengerCount());
                System.out.println("Enter the number of passengers leaving the train at stop " + stop + ":");
                int numPassengersLeaving = scanner.nextInt();
                train.leavePassengers(numPassengersLeaving);
                if (train.getPassengerCount() <= 0) {
                    System.out.println("No passengers left on the train.");
                    break; // Stop the loop if no passengers left
                }
            }
            train.moveNextStop();
        }

        scanner.close();
    }
}
