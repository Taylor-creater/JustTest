package Demo;

public class Demo17 {
    public static void main(String[] args) {
        Integer i=new Integer(10);//装箱 把基本数据类型转换为引用数据类型
        float f=i.floatValue();//拆箱 把引用数据类型i转换为基本数据类型
        System.out.println(f);
        Integer x=Integer.MAX_VALUE;
        char a="dadad".charAt(2);
        System.out.println(a);
        System.out.println(x);

        
    }
}
