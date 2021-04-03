package Factory.Factory;

public class TeslaFactory implements Factory{
    @Override
    public Car getCar() {
        return new Tesla();  //getCar调用Tesla()类的构造器
    }
}
