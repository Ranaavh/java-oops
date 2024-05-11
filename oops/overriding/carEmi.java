package oops.overriding;

class Interest {
    double interest() {
        return 0;
    }
}

class Car1 extends Interest {

    double interest() {
        
        double principal = 500000; // Example principal amount for Car1
        double rate = 0.01; // Example monthly interest rate for Car1 (1%)
        int months = 36; // Example loan term in months for Car1 (3 years)

        double monthlyRate = rate / 12.0;
        double emi = principal * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
        return emi;
    }
}

class Car2 extends Interest {
   
    double interest() {
        // Similar EMI calculation for Car2
        double principal = 600000; // Example principal amount for Car2
        double rate = 0.015; // Example monthly interest rate for Car2 (1.5%)
        int months = 48; // Example loan term in months for Car2 (4 years)

        double monthlyRate = rate / 12.0;
        double emi = principal * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
        return emi;
    }
}

class Car3 extends Interest {
   
    double interest() {
        // Similar EMI calculation for Car3
        double principal = 700000; // Example principal amount for Car3
        double rate = 0.02; // Example monthly interest rate for Car3 (2%)
        int months = 60; // Example loan term in months for Car3 (5 years)

        double monthlyRate = rate / 12.0;
        double emi = principal * monthlyRate / (1 - Math.pow(1 + monthlyRate, -months));
        return emi;
    }
}

public class carEmi {

    public static void main(String[] args) {

        Car1 c1 = new Car1();
        Car2 c2 = new Car2();
        Car3 c3 = new Car3();

        double emi1 = c1.interest();
        double emi2 = c2.interest();
        double emi3 = c3.interest();

        System.out.println("EMI for Car1: $" + emi1);
        System.out.println("EMI for Car2: $" + emi2);
        System.out.println("EMI for Car3: $" + emi3);
    }
}
