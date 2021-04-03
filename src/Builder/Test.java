package Builder;

public class Test {
    public static void main(String[] args) {

        System.out.println("====标配高级电脑====");
        Director director = new Director();
        Worker_Good worker_good = new Worker_Good();
        Computer buildGood = director.build(worker_good); //Alt+Enter自动补全
        System.out.println(buildGood.toString() );

        System.out.println("====DIY高级电脑====");//设置一些有参构造，可以DIY属性; 无参构造只能是默认属性
        Computer buildGoodDIY = director.build(worker_good);
        worker_good.buildA("DIY:4T内存");
        worker_good.buildB("DIY:4K显示屏");
        System.out.println(buildGoodDIY.toString() );

        System.out.println("====普通电脑====");
        for (int i=0;i<2;i++){
            Computer buildNormal = director.build(new Worker_Normal());
            System.out.println(buildNormal.toString());
        }
        System.out.println("====普通电脑PRO====");//这里用了不同的director可使构造的顺序不同(director决定顺序，还有组件数量)
        DirectorPRO directorPRO = new DirectorPRO();
        for(int i=0;i<1;i++){
            Computer buildNormalPro = directorPRO.build(new Worker_Normal());
            System.out.println(buildNormalPro);//这里应该是帮助自动toString
            System.out.println(buildNormalPro.toString());
        }
    }
}
