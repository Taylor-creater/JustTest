package Demo;

public class StackTest {
    public static void main(String[] args) {
        Mystack10 m=new Mystack10();
        Animal a1=new Animal();
        try {
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
            m.push(new Animal());
        } catch (MyStackException e) {
            System.out.println(e.getMessage());
        }


        try {
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
            m.pop(new Animal());
        } catch (MyStackException e) {
            e.printStackTrace();
        }

    }
}
