package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo24 {
    public static void main(String[] args) {
        List<Animal> animalList=new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Cat());
        animalList.add(new Bird());
        Iterator<Animal> it=animalList.iterator();
        while (it.hasNext()){
            Animal animal=it.next();
            animal.move();
            if (animal instanceof Cat){
                Cat cat=(Cat) animal;
                cat.catchmouse();
            }
            if (animal instanceof Bird){
                Bird bird=(Bird) animal;
                bird.fly();
            }
        }
    }
}

