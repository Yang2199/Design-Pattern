package Command;

public class BuyStock implements Order {
    private Stock abcStock;
    private int quantity;

    public BuyStock(Stock abcStock, int quantity){
        this.abcStock = abcStock;
        this.quantity = quantity;
    }

    public void execute() {
        abcStock.buy(quantity);
    }
}
