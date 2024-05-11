package oops.train;
class Train {
    int maxACSeats;
    int maxFirstClassSeats;
    int maxSecondClassSeats;
    int maxGeneralSeats;
    int acPassengerCount;
    int firstClassPassengerCount;
    int secondClassPassengerCount;
    int generalPassengerCount;
    int currentStop;
    final int lastStop = 37;

    public Train(int maxACSeats, int maxFirstClassSeats, int maxSecondClassSeats, int maxGeneralSeats) {
        this.maxACSeats = maxACSeats;
        this.maxFirstClassSeats = maxFirstClassSeats;
        this.maxSecondClassSeats = maxSecondClassSeats;
        this.maxGeneralSeats = maxGeneralSeats;

        this.acPassengerCount = 0;
        this.firstClassPassengerCount = 0;
        this.secondClassPassengerCount = 0;
        this.generalPassengerCount = 0;

        this.currentStop = 1;
    }

    public void addPassengers(int stop, int acPassengers, int firstClassPassengers, int secondClassPassengers, int generalPassengers) {
        acPassengerCount += acPassengers;
        firstClassPassengerCount += firstClassPassengers;
        secondClassPassengerCount += secondClassPassengers;
        generalPassengerCount += generalPassengers;

        System.out.println("\nPassengers added for stop " + stop + ":");
        System.out.println(" *************************************");
        System.out.println("AC: " + acPassengers);
        System.out.println("First Class: " + firstClassPassengers);
        System.out.println("Second Class: " + secondClassPassengers);
        System.out.println("General: " + generalPassengers);

        System.out.println("\nRemaining Seats:");
        System.out.println(" *******************");
        System.out.println("AC: " + (maxACSeats - acPassengerCount));
        System.out.println("First Class: " + (maxFirstClassSeats - firstClassPassengerCount));
        System.out.println("Second Class: " + (maxSecondClassSeats - secondClassPassengerCount));
        System.out.println("General: " + (maxGeneralSeats - generalPassengerCount));
    }

    public void leavePassengers(int numPassengersLeaving) {
        int totalPassengersLeaving = acPassengerCount + firstClassPassengerCount + secondClassPassengerCount + generalPassengerCount;
        if (numPassengersLeaving >= totalPassengersLeaving) {
            System.out.println("All passengers have left the train.");
            resetPassengerCounts();
        } else {
            System.out.println(numPassengersLeaving + " passengers have left the train.");
            // Distribute leaving passengers across compartments proportionally
            acPassengerCount = (int) Math.round(acPassengerCount * (1.0 * numPassengersLeaving / totalPassengersLeaving));
            firstClassPassengerCount = (int) Math.round(firstClassPassengerCount * (1.0 * numPassengersLeaving / totalPassengersLeaving));
            secondClassPassengerCount = (int) Math.round(secondClassPassengerCount * (1.0 * numPassengersLeaving / totalPassengersLeaving));
            generalPassengerCount = numPassengersLeaving - (acPassengerCount + firstClassPassengerCount + secondClassPassengerCount);
        }
        System.out.println("Passengers left on the train:");
        System.out.println("AC: " + acPassengerCount);
        System.out.println("First Class: " + firstClassPassengerCount);
        System.out.println("Second Class: " + secondClassPassengerCount);
        System.out.println("General: " + generalPassengerCount);
    }

    public void moveNextStop() {
        if (currentStop < lastStop) {
            currentStop++;
            System.out.println("\nTrain has arrived at stop " + currentStop);
        } else {
            System.out.println("\nTrain has reached its final destination.");
        }
    }

    public int getPassengerCount() {
        return acPassengerCount + firstClassPassengerCount + secondClassPassengerCount + generalPassengerCount;
    }

    public int getACPassengerCount() {
        return acPassengerCount;
    }

    public int getFirstClassPassengerCount() {
        return firstClassPassengerCount;
    }

    public int getSecondClassPassengerCount() {
        return secondClassPassengerCount;
    }

    public int getGeneralPassengerCount() {
        return generalPassengerCount;
    }

    public boolean isTrainFull() {
        return acPassengerCount == maxACSeats && firstClassPassengerCount == maxFirstClassSeats &&
                secondClassPassengerCount == maxSecondClassSeats && generalPassengerCount == maxGeneralSeats;
    }

    private void resetPassengerCounts() {
        acPassengerCount = 0;
        firstClassPassengerCount = 0;
        secondClassPassengerCount = 0;
        generalPassengerCount = 0;
    }
}