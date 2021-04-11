package Command;

import lombok.Data;

@Data
public class Stock {

    private String name;

    public Stock(String name) {
        this.name = name;
    }

    public void buy(int quantity){
        System.out.println("买入股票 [ 名称: "+name+", 数量: " + quantity +" ]");
    }
    public void sell(int quantity){
        System.out.println("卖出股票 [ 名称: "+name+", 数量: " + quantity +" ]");
    }
}