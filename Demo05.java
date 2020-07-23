package Demo;

public class Demo05 {
    public static void main(String[] args) {
        System.out.println(calculate(2,4));
        int []result =calculate(2,4);
        System.out.println(result[0]+"   "+result[1]);
    }
    public  static int[] calculate(int a,int b){
        int sum=a+b;
        int avg=sum/3;
        int [] arr={sum,avg};
        return arr;
    }
}
