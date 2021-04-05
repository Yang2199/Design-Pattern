package Observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("新增订阅 => 十六进制 观察者");
    }

    @Override
    public void update() {
        System.out.println( "十六进制-观察者: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

    @Override
    public void detach() {
        this.subject.detach(this);
        System.out.println("退订 => 十六进制 观察者");
    }
}
