package ProtoType.Example1;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Date date = new Date();
        Video video1 = new Video("【流浪地球】", date);
        System.out.println("video1 = " + video1);

        Video video2 = (Video) video1.clone(); //类型强制转换
        System.out.println("video2 = " + video2);

        video2.setName("【学习视频】");

        System.out.println("video1 = " + video1);
        System.out.println("video2 = " + video2);
    }
}
