package AdaptorPattern;

import java.util.ArrayList;
import java.util.Enumeration;

public class RunAdaptorPattern {
    public static void main(String[] args) {

        // arraylist 생성
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);

        // arraylist를 adaptor를 활용해 enumeration으로 받아들이게 만듦
        Enumeration enumeration = new IteratorEnumeration(arrayList);

        // 실제 enumeration처럼 작동됨
        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());
        System.out.println(enumeration.nextElement());
        System.out.println(enumeration.nextElement());
    }
}
