package Demo;

public class Demo14 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 10, 13, 18, 41};
        int a = erfenfa(arr, 41);
        System.out.println(a==-1?"该元素不存在":"所找的元素下标为：" + a);
    }

    public static int erfenfa(int[] arrs, int num) {
        int begin = 0;
        int end = arrs.length - 1;
        //int mid = (begin + end) //如果在这里定义mid就是死循环了
        while (begin<=end) {
            int mid = (begin + end) / 2;
            if (arrs[mid] == num) {
                return mid;
            } else if (arrs[mid] < num) {
                begin = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;
    }
}
