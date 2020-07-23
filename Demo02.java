package Demo;

public class Demo02 {
    public static void main(String[] args) {
       int [] arrayA=new int[]{1,2,3};
         arrayA=new int[]{4,5,6,7,8,9};
        System.out.println(arrayA[0]);
        System.out.println(arrayA.length);
        for (int i = 0; i < arrayA.length; i++) {
            System.out.println(arrayA[i]);
        }
    }
}
