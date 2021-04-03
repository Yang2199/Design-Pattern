package SuperFactory;

public class HuaweiRouter implements Router{
    @Override
    public void start() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void wifi() {
        System.out.println("华为wifi");
    }
}