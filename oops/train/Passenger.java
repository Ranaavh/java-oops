package oops.train;

class Passenger {
    String name;
    String compartmentType;

    Passenger(String name, String compartmentType) {
        this.name = name;
        this.compartmentType = compartmentType;
    }

    String getName() {
        return name;
    }

    String getCompartmentType() {
        return compartmentType;
    }
}
