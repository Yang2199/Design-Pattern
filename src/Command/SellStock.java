package Command;

public class SellStock implements Order {
    private Stock abcStock;
    private int quantity;

    public SellStock(Stock abcStock, int quantity){
        this.abcStock = abcStock;
        this.quantity = quantity;
    }

    public void execute() {
        abcStock.sell(quantity);
    }
}
