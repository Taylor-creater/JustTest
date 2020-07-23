package Demo;

import java.util.*;

public class MapErgodic<K,V> {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三");
        map.put(2, "赵四");
        map.put(3, "王五");
        map.put(4, "赵六");
        map.put(5, "李八");
        //Set<Map.Entry<Integer,String>> set=map.entrySet();
//        Collection collection=map.values();
//        Iterator it=collection.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }


//        Collection<String> collection1=map.values();
//        for (String s:collection1) {
//            System.out.println(s);
//        }


        Set<Integer> set = map.keySet();//将Map集合的key键变成set集合再进行遍历，有如下两种方法

        //方法一
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            String s1 = map.get(key);
            System.out.println(s1);
        }



        System.out.println("====================================");



        //方法二
        for (Integer integer: set) {
            String s2=map.get(integer);
            System.out.println(s2);
        }




            System.out.println("这是一条华丽的分界线***********************************");

            Set<Map.Entry<Integer, String>> set1 = map.entrySet();//将Map集合转换成set集合，再进行遍历有如下两种方法

            //使用迭代器遍历
            Iterator<Map.Entry<Integer, String>> it1 = set1.iterator();
            while (it1.hasNext()) {
                Map.Entry<Integer, String> m = it1.next();
                Integer i = m.getKey();
                String s = m.getValue();
                System.out.println(i + "=" + s);
            }
            System.out.println("===================================");

            //使用foreach遍历
            for (Map.Entry<Integer, String> m : set1) {
                System.out.println(m.getKey() + "=" + m.getValue());
            }

    }
}


