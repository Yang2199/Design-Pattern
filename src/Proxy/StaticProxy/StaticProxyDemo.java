package Proxy.StaticProxy;

/**
 * Worker接口,有一个方法可以卖票;
 */
interface Worker {
    // 售票方法;
    void sell();
}

/**
 * 售票员类,实现了Worker接口,可以进行售票,也就是"被代理类"对象;
 */
class Seller implements Worker {
    @Override
    public void sell() {
        System.out.println("成功把票卖出去了!");
    }
}

/**
 * 黄牛类,也实现了Worker接口,也可以售票,称为"代理类"对象;
 */
class Scalper implements Worker {

    // 私有一个被代理类的父类引用,这样做是为了适应所有的被代理类对象,只要实现了接口就好;
    private Worker worker;

    // 传入被代理类对象,这里的作用是初始化"代理类"中的"被代理类"对象;
    public Scalper(Worker worker) {
        this.worker = worker;
    }

    /**
     * 增强服务和功能;
     */
    @Override
    public void sell() {
        // 代理服务;
        worker.sell();
        // 额外服务;
        noQueue();
    }

    // 代理类本身自带功能;
    public void noQueue() {
        System.out.println("黄牛附加功能：不用排队哟!!!");
    }
}

/**
 * 主函数;
 */
public class StaticProxyDemo {

    public static void main(String[] args){
        // 首先是原始类,也就是被代理类;
        System.out.println("======正常买票======");
        Worker worker = new Seller();
        worker.sell();
        System.out.println("======黄牛买票======");
        // 其次是代理类,传入被代理类对象;
        Worker pw = new Scalper(worker);
        pw.sell();
    }
}
