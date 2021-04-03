package ProtoType.Example2;

public class ClonePeople implements Cloneable{
    private String name;
    private Integer height;
    private Integer Intelligent;
    private BaseInfo baseInfo;//自定义类

    public ClonePeople(String name, Integer height, Integer intelligent, BaseInfo baseInfo) {
        this.name = name;
        this.height = height;
        Intelligent = intelligent;
        this.baseInfo = baseInfo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "hashCode" + super.hashCode() +
                " ClonePeople{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", Intelligent=" + Intelligent +
                ", baseInfo=" + baseInfo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getIntelligent() {
        return Intelligent;
    }

    public void setIntelligent(Integer intelligent) {
        Intelligent = intelligent;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }
}
