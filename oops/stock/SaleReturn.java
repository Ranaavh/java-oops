package oops.stock;

class SaleReturn {
    private Stock stock;
    private int amount;

    void saleReturn(Stock s, int a) {
        stock = s;
        amount = a;
    }

    public void display() {
        stock.addStock(amount);
        System.out.println(amount + " returned stocks added to stock.");
    }
}