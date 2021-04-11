package Iterator;

import java.util.Vector;

public class MyAggregate implements Aggregate {
    private Vector vector = new Vector();

    @Override
    public void add(Object object) {
        this.vector.add(object);
    }
    @Override
    public Iterator iterator() {
        return new MyIterator(this.vector);
    }

}
