package Singleton.Lazyman.DCL_v2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
    private Singleton() { //单例 =>私有构造器
        System.out.println(Thread.currentThread().getName()); //构造时候打印线程名
    }
    private volatile static Singleton instance = null;
            //由于instance = new Singleton()的非原子性（new对象3步），所以需要volatile保证强制同步一致
    public static Singleton getInstance() {
        if (instance == null) {     //外层判断
            synchronized (Singleton.class) {    //将Singleton类 加锁
                if (instance == null) {     //原有判断
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
//加上两层：一层if、一层锁
//这样就能保证单例在多线程下的唯一性
//双重检查模式：DCL (Double Check)

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        for(int i =0;i<10;i++){
            new Thread(  ()->{Singleton.getInstance();}  ).start();//1.启动新线程 2.lambda表达式
        }

        System.out.println("============ Reflection ============");
        //下面是关于反射的测试：
        Singleton instance = Singleton.getInstance();
        Constructor<Singleton> declaredConstructor =Singleton.class.getDeclaredConstructor(null);  //通过反射获取declaredConstructor这个构造器
        declaredConstructor.setAccessible(true);
        Singleton instance2 = declaredConstructor.newInstance();

        System.out.println(instance.hashCode() );
        System.out.println(instance2.hashCode() );
    }



}
