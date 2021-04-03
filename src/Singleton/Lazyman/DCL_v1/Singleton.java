package Singleton.Lazyman.DCL_v1;

public class Singleton {
    private Singleton() { //单例 =>私有构造器
        System.out.println(Thread.currentThread().getName()); //构造时候打印线程名
    }
    private static Singleton instance = null;  //单例对象
    public static Singleton getInstance() {  //调用getInstance方法才会开始构造对象
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            new Thread(  ()->{Singleton.getInstance();}  ).start();//1.启动新线程 2.lambda表达式
        }
    }
}
