package Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexaObserver = new HexaObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        subject.setState(15);//发布 广播

        OctalObserver octalObserver = new OctalObserver(subject);//新增 八进制观察者
        subject.setState(10);//发布 广播

        hexaObserver.detach();//十六进制观察者 退订
        subject.setState(7);//发布 广播
    }
}
