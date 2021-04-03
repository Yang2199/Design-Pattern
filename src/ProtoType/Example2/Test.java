package ProtoType.Example2;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonePeople clonePeople = new ClonePeople("双胞胎哥哥",195,155, new BaseInfo("地球","超人"));
                                                     //有参构造中，对象的值格式(value1 , value2) =>括号逗号

        System.out.println("OriginPeople = " + clonePeople);//这里clonePeople等价于clonePeople.toString()
//        System.out.println("clonePeople = " + clonePeople.toString());

        ClonePeople cloneLittleBrother = (ClonePeople) clonePeople.clone();//纯克隆，只有hashCode改变
        System.out.println("clone        = " + cloneLittleBrother);

        //设置新属性值
        cloneLittleBrother.setName("双胞胎弟弟");
        cloneLittleBrother.setIntelligent(175);
        cloneLittleBrother.setBaseInfo(new BaseInfo("海王星","超人"));
        System.out.println("======最终结果======");
        System.out.println("cloneLittleBrother = " + cloneLittleBrother);
        System.out.println("OriginPeople = " + clonePeople.toString());
    }
}
