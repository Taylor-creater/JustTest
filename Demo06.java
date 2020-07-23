package Demo;

public class Demo06 {
    public static void main(String[] args) {
     //   System.out.println(args.length);
        String username=args[0];
        String password=args[1];
        if (args.length!=2){
            System.out.println("请正确输入登录名和密码！！！");
        }
        if(username.equals("xwb")&&password.equals("123")){
            System.out.println("登陆成功！！！");
        }else
            System.out.println("输入错误！！");
    }

}
