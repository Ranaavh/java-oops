package oops.stock;

class Sale {
    private Stock stock;
    private int amount;

    void sale(Stock s, int a) {
        stock = s;
        amount = a;
    }

    public void display() {
        stock.reduceStock(amount);
        System.out.println(amount + " stocks sold.");
    }}
