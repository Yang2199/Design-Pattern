package Builder;

public class Director {
    public Computer build(Builder builder){//director的作用很重要，决定具体顺序
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getComputer();
    }
}
