package Demo;

import java.util.Arrays;

public class Demo16 {
    public static void main(String[] args) {
        String s1="http//:www.baidu.com".replace("http","https");
        System.out.println(s1);
        int []arr={4,5,6,7,1};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append("a");
        stringBuilder.append("b");
        stringBuilder.append("c");
        System.out.println(stringBuilder);
    }
}
