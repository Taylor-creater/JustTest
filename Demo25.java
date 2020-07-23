package Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo25 <E>{
    public E dosome(E o){
        System.out.println(o);
        return null;
    }

    public static void main(String[] args) {
      Demo25<String> demo25=new Demo25<>();
      demo25.dosome("dada");
    }
}
