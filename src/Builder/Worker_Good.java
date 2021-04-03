package Builder;

public class Worker_Good extends Builder{

    private Computer computer;

    public Worker_Good() {
        computer = new Computer();
    }

    @Override
    void buildA() {
        computer.setBuildA("2T内存");
    }

    @Override
    void buildB() {
        computer.setBuildB("2K显示屏");
    }

    @Override
    void buildC() {
        computer.setBuildC("i9");
    }

    @Override
    void buildD() {
        computer.setBuildD("罗技键鼠");
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
