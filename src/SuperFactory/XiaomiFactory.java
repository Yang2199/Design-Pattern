package SuperFactory;

public class XiaomiFactory implements AbstractFactory{

    @Override
    public Phone phone() {
        return new XiaomiPhone();
    }

    @Override
    public Router router() {
        return new XiaomiRouter();
    }
}