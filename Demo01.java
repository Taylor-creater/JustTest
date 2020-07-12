package Demo;

public class Demo01 {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1, 2, 3};
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println("==================");
        int[] arrayC =arrayA;
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayC[i]);
        }
        System.out.println("==================");
        arrayC[0]=9;
        arrayC[1]=8;
        arrayC[2]=7;
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayC[i]);
        }
        System.out.println("==================");

        for (int i = 0; i < 3; i++) {
            System.out.println(arrayA[i]);
        }
        System.out.println(arrayA.length);
    }
}
