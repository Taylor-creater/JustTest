package Demo;

import java.lang.reflect.Array;

public class Demo04 {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" " + Array[i]);
        }
        System.out.println(" ");
        System.out.println("=================");
        for (int min = 0, max = Array.length - 1;min<max ;min++, max--){
            int t = Array[min];
            Array[min]=Array[max];
            Array[max]=t;
        }
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" " + Array[i]);
        }
    }
}
