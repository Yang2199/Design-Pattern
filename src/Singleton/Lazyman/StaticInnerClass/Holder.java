package Singleton.Lazyman.StaticInnerClass;

public class Holder { //这个方法也能被反射破坏单例的唯一性
    private Holder(){}

    public static Holder getInstance() {return InnerClass.HOLDER;}

    private static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}