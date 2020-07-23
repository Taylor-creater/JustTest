package Demo;

public class Demo13 {
    /**
     * 选择排序
     */
    public static void main(String[] args) {
        int count=0;
        int a=0;
        int arr[]={3,6,5,1,4,2,7,9,8};
        for (int i = 0; i <arr.length-1 ; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                //count++;
                if(arr[j]<arr[min]){
                    a++;
                    min=j;
                }

            }
            if(min!=i){
                int temp;
                temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("========================");
        System.out.println(count+","+a);
    }
}
