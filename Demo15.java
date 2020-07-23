package Demo;

public class Demo15 {
    public static void main(String[] args) {
        byte[] bytes={97,98,99};
        String s1=new String(bytes);
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(s1);
    }
}
