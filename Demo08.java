package Demo;

public class Demo08 {
    public static void main(String[] args) {
        String [] Str={"x","w","b"};
        String [] NewStr=new String [5];
        for (int i = 0; i <Str.length ; i++) {
            System.out.println(Str[i]);
        }
        System.arraycopy(Str,0,NewStr,0,Str.length);
        System.out.println("===================");
        for (int i = 0; i <NewStr.length ; i++) {
            System.out.println(NewStr[i]);
        }
        System.out.println("===================");

        for (int i = 0; i <Str.length ; i++) {
            System.out.println(Str[i]);
        }
    }
}
