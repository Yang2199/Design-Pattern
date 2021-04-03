package Builder;

public class Worker_Normal extends Builder{

    private Computer computer;

    public Worker_Normal() {
        computer = new Computer();
    }

    @Override
    void buildB() {
        computer.setBuildB("1080p显示屏");
        System.out.print("1080p显示屏==>");
    }

    @Override
    void buildA() {
        computer.setBuildA("1T内存");
        System.out.print("1T内存==>");
    }

    @Override
    void buildC() {
        computer.setBuildC("i5");
        System.out.print("i5==>");
    }

    @Override
    void buildD() {
        computer.setBuildD("联想键鼠");
        System.out.print("联想键鼠==>");
    }

    @Override
    void buildA(String str) {
        computer.setBuildA(str);
    }

    @Override
    void buildB(String str) {
        computer.setBuildB(str);
    }

    @Override
    Computer getComputer() {
        return computer;
    }
}
