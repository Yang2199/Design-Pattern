package Factory.SimpleFactory;

public class SimpleFactory {
    public static Car getCar(String car){
        if(car.equals("NIO")) return new NIO(); //简单工厂需要根据传参来判断需要生产的对象类型
        if(car.equals("Tesla")) return new Tesla();
        else return null;
    }
}