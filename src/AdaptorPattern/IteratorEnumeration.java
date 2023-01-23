package AdaptorPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {

    Iterator<?> iterator;

    public IteratorEnumeration(Iterable<?> iterable) {
        this.iterator = iterable.iterator();
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
