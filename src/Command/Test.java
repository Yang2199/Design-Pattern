package Command;

public class Test {
    public static void main(String[] args) {
        //茅台股票
        Stock MaoTaiStock = new Stock("茅台");
        BuyStock buyStockOrder1 = new BuyStock(MaoTaiStock,100);
        SellStock sellStockOrder1 = new SellStock(MaoTaiStock,50);
        //Tesla股票
        Stock TeslaStock =new Stock("Tesla");
        BuyStock buyStockOrder2 = new BuyStock(TeslaStock,120);
        SellStock sellStockOrder2 = new SellStock(TeslaStock,40);
        SellStock sellStockOrder3 = new SellStock(TeslaStock,40);

        //broker：经纪人
        Broker broker = new Broker();
        //命令开始排队
        broker.takeOrder(buyStockOrder1);
        broker.takeOrder(buyStockOrder2);
        broker.takeOrder(sellStockOrder2);
        broker.takeOrder(sellStockOrder1);
        broker.takeOrder(sellStockOrder3);
        //开始执行
        broker.placeOrders();
    }
}
