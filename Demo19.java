package Demo;

import java.util.Arrays;
import java.util.Random;

public class Demo19 {
    public static void main(String[] args) throws Exception{
        int []arr=new int[5];
       Random random = new Random();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=-1;
        }
        int index=0;
        while (index<5) {
            int num = random.nextInt(10);
            if (ccc(arr, num) == false) {
                arr[index++] = num;
            }
        }


        for (int i = 0; i <arr.length ; i++) {
           Arrays.sort(arr);
            System.out.println(arr[i]);
        }
    }
    public static boolean ccc(int []arr,int key){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
}
