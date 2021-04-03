package Singleton.Hungry;

public class Hungry {
    private Hungry(){} //构造函数
    private final static Hungry HUNGRY = new Hungry();//直接实例化，new出对象
    public static Hungry getInstance(){
        return HUNGRY;
    }
}