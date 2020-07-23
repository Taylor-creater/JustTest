package Demo;

/**
 * 冒泡排序
 */
public class Demo12 {
    public static void main(String[] args) {
        int count=0;
        int [] arr={7,5,1,3,6,9,2,8,4};
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i ; j++) {
              //  count++;
                int temp;
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========================");
        System.out.println(count);
    }
}
