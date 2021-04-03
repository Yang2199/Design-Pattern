package Factory.SuperFactory;

public class Test {
    public static void main(String[] args) {
        System.out.println("======Huawei系列产品======");
        HuaweiFactory huaweiFactory = new HuaweiFactory();

        Phone phone = huaweiFactory.phone(); //实际生产的时候，分两层，第一层找具体factory，第二层找具体产品
        phone.call();
        phone.shutdown();

        Router router =huaweiFactory.router();
        router.wifi();

        System.out.println("======小米产品======");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        Phone phone2= xiaomiFactory.phone();
        phone2.message();
    }
}