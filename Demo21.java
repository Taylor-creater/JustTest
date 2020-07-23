package Demo;

import java.util.*;

public class Demo21 {
    public static void main(String[] args) {
        /*Collection c=new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        Iterator it=c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        Collection c1=new HashSet();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        c1.add(6);
        c1.add(7);
        c1.add(7);
        c1.add(7);
        Iterator it2=c1.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
