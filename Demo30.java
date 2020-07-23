package Demo;

import java.util.*;

public class Demo30 {
    public static void main(String[] args) {
        Map humanMap=new Properties();
//        if (humanMap instanceof Properties){
//            Properties p=(Properties) humanMap;
//            p.setProperty("1","abc");
//            System.out.println(p.getProperty("1"));
//        }
        humanMap.put("1",new Human("aaa","15"));
//        Set<Integer> set=humanMap.keySet();
//        for (Integer i:set){
//            System.out.println(i+"   "+humanMap.get(i));
//        }
//        Set<Map.Entry<Integer,Human>> set=humanMap.entrySet();
//        for(Map.Entry<Integer,Human> m:set){
//            System.out.println(m.getKey()+"  "+m.getValue());
//        }
//        System.out.println(humanMap.getProperty("1"));
        //humanMap.getProperty("1");
    }
}
class Human{
    String name;
    String age;

    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + " " + "age=" + age ;
    }
}
