package Iterator;

import java.util.Vector;

public class MyIterator implements Iterator {

    private Vector vector = new Vector();
    public int cursor = 0;    //定义当前游标

    public MyIterator(Vector vector) {
        this.vector = vector;
    }
    @Override
    public Object next() {
        Object result = null;

        if (this.hasNext())
            result = this.vector.get(this.cursor ++);
        else
            result = null;
        return result;
    }
    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size())
            return false;
        else
            return true;
    }
}
