package Demo;

public class Demo09 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Bird bird=new Bird();
        Animal[] animals={cat,bird};
        for (int i = 0; i <animals.length ; i++) {
            animals[i].move();
        }
    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动！！");
    }
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步！！！");
    }
    public void catchmouse(){
        System.out.println("猫抓老鼠！！");
    }
}
class Bird extends Animal{
    @Override
    public void move() {

        System.out.println("鸟儿在飞翔！！");
    }
    public void fly(){
        System.out.println("鸟在飞！！");
    }
}