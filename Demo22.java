package Demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Demo22 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        person1 u1=new person1("jack");
        person1 u2=new person1("jack");
        c.add(u1);
        System.out.println(c.contains(u2));
    }
}
class person1{
    String name;
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person1 person1 = (person1) o;
        return Objects.equals(name, person1.name);
    }*/

    public person1(String name) {
        this.name = name;
    }
}
