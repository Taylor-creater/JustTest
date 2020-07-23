package Demo;

public class Demo11 {
    public static void main(String[] args) {
        student[] students=new student[10];
        for (int i = 0; i <students.length ; i++) {
            /**
             * 空指针异常的原因是我只new了student[]这个数组，但是数组里的对象我没用new，所以student[i].num是空指针异常
             */
            System.out.println(students[i].num);
        }
    }
}
class student{
    int num=1;
}
