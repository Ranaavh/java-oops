package oops.acsendingorder;
import java.util.Scanner;
public class AscendingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = scanner.nextInt();

        Ascending ascendingArray = new Ascending();
        ascendingArray.array(n);
        ascendingArray.inputNumbers(scanner);
        ascendingArray.printNumbers();
        ascendingArray.sortAscending();
        ascendingArray.printAscendingOrder();

        scanner.close();
        
    }
}
