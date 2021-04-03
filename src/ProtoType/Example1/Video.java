package ProtoType.Example1;

import java.util.Date;

public class Video implements Cloneable{ //implements Cloneable
    private String name;
    private Date createTime;

    public Video(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    @Override
    public String toString() { //手动增加打印hashcode
        return  "hashCode = " + super.hashCode() +
                " Video{" +
                " name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    //Alt+Insert => Override =>clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//父类克隆
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
