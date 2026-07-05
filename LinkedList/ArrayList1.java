package LinkedList;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        var cars = new ArrayList<String>();
        //ArrayList<String> cars = new ArrayList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("audi");
        cars.add("ford");
        cars.add(0, "mazda");
        cars.set(0, "tata");
        cars.remove(4);
        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.size());
        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.print(i+" ");
        }
        // ArrayList<Integer> marks = new ArrayList<Integer>();
        // marks.add(55);
        // marks.add(51);
        // marks.add(52);
        // marks.add(55);
        // for(int i = 0;i<marks.size();i++)
        // {
        // System.out.println(marks.get(i));
        // }
    }
}