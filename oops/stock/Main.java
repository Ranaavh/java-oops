package oops.stock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Stock : ");
        int initialStock = scanner.nextInt();
        Stock stock = new Stock();
        stock.stock(initialStock);
       
        stock.display();
        
        while (true) {
            System.out.println("\n1. Purchase\n2. Sale\n3. Purchase Damage\n4. Sale Return\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount of stocks to purchase: ");
                    int purchaseAmount = scanner.nextInt();
                    Purchase purchaseAction = new Purchase();
                    purchaseAction.purchase(stock, purchaseAmount);     
                    purchaseAction.display();
                    break;
                case 2:
                    System.out.print("Enter amount of stocks to sell: ");
                    int saleAmount = scanner.nextInt();
                    Sale saleAction = new Sale();
                    saleAction.sale(stock, saleAmount);
                    saleAction.display();
                    break;
                case 3:
                    System.out.print("Enter amount of damaged stocks to remove: ");
                    int damageAmount = scanner.nextInt();
                    PurchaseDamage purchaseDamage = new PurchaseDamage();
                    purchaseDamage.damage(stock, damageAmount);
                    purchaseDamage.display();
                    break;
                case 4:
                    System.out.print("Enter amount of returned stocks to add: ");
                    int returnAmount = scanner.nextInt();
                    SaleReturn saleReturnAction = new SaleReturn();
                    saleReturnAction.saleReturn(stock, returnAmount);
                    saleReturnAction.display();
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Current stock quantity: " + stock.getCurrentQuantity());
        }
    }
}