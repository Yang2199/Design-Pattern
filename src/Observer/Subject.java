package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {   //改变发布的值
        this.state = state;
        System.out.println("发布 =====>> 十进制数: " + this.state);
        notifyAllObservers();
    }

    public void attach(Observer observer){  //新增订阅
        observers.add(observer);
    }

    public void detach(Observer observer){  //退订
        observers.remove(observer);
    }

    public void notifyAllObservers(){   //通知所有观察者
        for (Observer observer : observers) {
            observer.update();
        }
        System.out.println("========================");
    }
}
