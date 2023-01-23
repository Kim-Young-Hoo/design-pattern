package AdaptorPattern;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;


// Enumeration을 Iterator처럼 활용하게 해주는 Adaptor 클래스.
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    // Iterator의 hasNext는 Enumeration의 hasMoreElements로 동작
    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    // Iterator의 next는 Enumeration의 nextElement로 동작
    @Override
    public Object next() {
        return enumeration.nextElement();
    }


    // Iterator의 remove는 Enumeration에 존재하지 않기 때문에 Exception 처리를 한다.
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
