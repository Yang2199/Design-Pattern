package Builder;

public class DirectorPRO {
    public Computer build(Builder builder){
        builder.buildA();
        builder.buildA();
        builder.buildD();
        builder.buildC();
        builder.buildB();

        return builder.getComputer();
    }
}
