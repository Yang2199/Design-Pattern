package Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {   //broker的意思是：经纪人
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){   //获取命令列表
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {   //执行命令列表
            order.execute();
        }
        orderList.clear();
    }
}
