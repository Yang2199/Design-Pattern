package Builder;

public abstract class Builder {
    //无参构造，均设置好默认值
    abstract void buildA();//内存
    abstract void buildB();//显示屏
    abstract void buildC();//CPU
    abstract void buildD();//键鼠

    //有参构造，DIY
    abstract void buildA(String str);
    abstract void buildB(String str);

    abstract Computer getComputer();
}
