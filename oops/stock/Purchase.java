package oops.stock;

class Purchase {
    private Stock stock;
    private int amount;

    void purchase(Stock s, int a) {
        stock = s;
        amount = a;
    }

     void display() {
        stock.addStock(amount);
        System.out.println(amount + " stocks purchased.");
    }
}
