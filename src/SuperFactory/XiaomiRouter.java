package SuperFactory;

public class XiaomiRouter implements Router{
    @Override
    public void start() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void wifi() {
        System.out.println("小米wifi");
    }
}