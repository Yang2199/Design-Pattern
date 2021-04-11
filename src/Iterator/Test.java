package Iterator;

public class Test {

    public static void main(String[] args) {
        //集群aggregate相关：
        Aggregate aggregate = new MyAggregate();
        aggregate.add("Hello!!");
        aggregate.add("青杨风");
        aggregate.add("2199");

        //用iterator迭代器来遍历:
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.print(" >> " + iterator.next());
        }
    }
}
