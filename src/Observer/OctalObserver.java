package Observer;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("新增订阅 => 八进制 观察者");
    }

    @Override
    public void update() {
        System.out.println( "八进制-观察者: "
                + Integer.toOctalString( subject.getState() ) );
    }

    @Override
    public void detach() {
        this.subject.detach(this);
        System.out.println("退订 => 八进制 观察者");
    }
}