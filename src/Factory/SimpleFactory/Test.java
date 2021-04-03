package Factory.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        SimpleFactory.getCar("NIO").name();  //进步是传参进去就好了，不用在这里new了
        SimpleFactory.getCar("Tesla").name();
    }
}
