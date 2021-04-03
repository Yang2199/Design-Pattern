package Singleton.Lazyman.Enum;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Test{
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton instance1 = EnumSingleton.INSTANCE.getInstance();

        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton instance2 = declaredConstructor.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}

//控制台输出：Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects 就对了
