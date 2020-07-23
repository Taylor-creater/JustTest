package Demo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Demo29 {
    public static void main(String[] args) {
        Set<User> users=new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age-o2.age;
            }
        });
        users.add(new User(100));
        users.add(new User(12));
        users.add(new User(378));
        users.add(new User(1));
        users.add(new User(126));
        users.add(new User(78));
        for (User u:users) {
            System.out.println(u);
        }

    }

}
class User{
    int age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User[" +
                "age=" + age +
                ']';
    }
}