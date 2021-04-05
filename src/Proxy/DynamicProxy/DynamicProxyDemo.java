package Proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface App {
    void webSell();
}
class TicketApp implements App {
    @Override
    public void webSell() {
        System.out.println("APP卖票：顾村公园");
    }
}


interface Seller {
    // 售票方法;
    void sell();
}
class OridinarySeller implements Seller {
    @Override
    public void sell() {
        System.out.println("窗口卖票：顾村公园");
    }
}

/**
 * 代理类,也就是代理对象,就类似于上述静态代理中的Scalper类;
 */
class ProxySubject implements InvocationHandler { // 涉及到动态代理需要实现这个接口InvocationHandler

    // 实现了接口的被代理类的对象引用声明;
    private Object object;

    public Object getNewInstance(Object object) {
        // 实例化被代理类的对象;
        this.object = object;
        // 返回一个代理类的对象;
        /**
         * 这里的newProxyInstance的三个参数:(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
         *      1.第一个参数是需要传入类的加载器,这里指的是被代理类的类加载器,简单来说就是和被代理类使用相同的类加载器;
         *      2.第二个参数是需要传入类的接口,也就是说,这个类实现了哪些接口,我都要传过来;
         *      3.第三个参数是需要传入的一个InvocationHandler对象,指的是代理类对象,也就是调用这个函数的this对象(ProxySubject对象);
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    // 当通过代理类的对象发起对被重写的方法的调用是,都会转换为对以下invoke方法的调用;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强代码(前);
        System.out.println("++AOP前附加功能：节日打折");

        // 被代理类的方法;
        Object value = method.invoke(object, args);

        // 增强代码(后);
        System.out.println("++AOP后附加功能：节日赠品=>吹泡泡机/风筝");
        return value;
    }
}

public class DynamicProxyDemo {
    public static void main(String[] args){
        // 1.创建被代理类对象;
        TicketApp ticketApp = new TicketApp();
        // 2.创建一个实现了InvocationHandler接口的类的对象;
        ProxySubject proxySubject = new ProxySubject();
        // 3.父类引用指向子类对象;
        App app = (App)proxySubject.getNewInstance(ticketApp);
        // 4.执行代理类的方法;
        app.webSell();

        System.out.println("===========================");
        // 使用前面静态代理的例子,创建一个Seller的被代理类对象;
        OridinarySeller oridinarySeller = new OridinarySeller();
        // 创建一个Worker的子类对象,指向Seller的代理类对象;
        Seller seller = (Seller)proxySubject.getNewInstance(oridinarySeller);
        // 执行其方法;
        seller.sell();
    }
}