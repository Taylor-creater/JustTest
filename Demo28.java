package Demo;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo28 {
    public static void main(String[] args) {
        TreeSet<Customer> customers=new TreeSet<>();
        customers.add(new Customer("zhangsi",20));
      customers.add(new Customer("zhangsan",20));
        customers.add(new Customer("wangwu",20));
        customers.add(new Customer("wanggang",20));
        customers.add(new Customer("xiaoming",13));
//        for (Customer c: customers) {
//            System.out.println(c);
//        }
        Iterator<Customer> it=customers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Customer implements Comparable<Customer> {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return this.name+"  "+this.age;
    }

    @Override
    public int compareTo(Customer customer) {
        if (this.age == customer.age) {
            return this.name.compareTo(customer.name);
        }
            return this.age - customer.age;
        }

    }
