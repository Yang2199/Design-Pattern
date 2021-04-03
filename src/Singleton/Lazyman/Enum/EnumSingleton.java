package Singleton.Lazyman.Enum;

public enum EnumSingleton { //这里是enum而不是class
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}