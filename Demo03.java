package Demo;

public class Demo03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 7, 5, 4, 3, 6, -4};
        Array u = new Array(array);
        u.miner(array);
        Array.miner(array);
        miner2(array);
    }
    public static void miner2(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为---->：" + min);
    }

}

class Array {
    int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public static void miner(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("最小值为---->：" + min);
    }
}