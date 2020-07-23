package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo18 {
    public static void main(String[] args) throws ParseException {
        String a="123";
        System.out.println(100+Integer.parseInt(a));
        Integer aa=new Integer(100);
        System.out.println(aa+1);
        int a2= aa.intValue();
        System.out.println(a2);
        Date date=new Date();
    //    System.out.println(date);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("现在是yyyy年MM月dd号 HH时mm分ss秒");
       String s1= simpleDateFormat.format(date);//Date类型转换为String类型

        System.out.println(simpleDateFormat.format(date));
        String s2="2008-08-08 08:08:08 888";
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1=simpleDateFormat1.parse(s2);//String类型转换为Date类型
        System.out.println(date1);

    }
}
