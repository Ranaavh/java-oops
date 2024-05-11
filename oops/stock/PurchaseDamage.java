package oops.stock;
class PurchaseDamage {
    private Stock stock;
    private int amount;

    void damage(Stock s, int a) {
        stock = s;
        amount = a;
    }

    public void display() {
        stock.reduceStock(amount);
        System.out.println(amount + " damaged stocks to remove.");
    }
}