package oops.acsendingorder;

import java.util.Arrays;
import java.util.Scanner;

class Ascending{
	 int[] numbers;

    void array(int size) {
        numbers = new int[size];
    }

    public void inputNumbers(Scanner scanner) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            numbers[i] = scanner.nextInt();
        }
    }

    public void printNumbers() {
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " element : " + numbers[i]);
        }
    }

    public void sortAscending() {
        Arrays.sort(numbers);
    }

    public void printAscendingOrder() {
        System.out.println("Ascending order:");
        for( int i=0;i<numbers.length;i++) {
     	   
      	  
     	   System.out.println(numbers[i]);
     	   
     	   
        }
    }
}
