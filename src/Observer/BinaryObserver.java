package Observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);  //构造的时候同时增加到观察者队列中
        System.out.println("新增订阅 => 二进制 观察者");
    }

    @Override
    public void update() {
        System.out.println( "二进制-观察者: "
                + Integer.toBinaryString( subject.getState() ) );
    }

    @Override
    public void detach() {
        this.subject.detach(this);
        System.out.println("退订 => 二进制 观察者");
    }
}
