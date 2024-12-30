import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class CollectionSets {
    public static void main(String[] args){

        // HashSet
        Set<String> fruits = new HashSet<String>();
        System.out.println("----------HashSet---------");
        fruits.add("Apple");
        fruits.add("tomato");
        fruits.add("Banana");
        fruits.add("apple");
        System.out.println(fruits);
        fruits.remove("tomato");
        System.out.println(fruits);

        // TreeSet
        TreeSet<Integer> num = new TreeSet<Integer>();
        System.out.println("----------TreeSet---------");
        num.add(3);
        num.add(1);
        num.add(8);
        num.add(4);
        System.out.println(num);
        num.remove(3);
        num.remove(12);
        num.remove(7);
        System.out.println(num);


        // LinkedHashSet
        Set<Integer> vegetables = new LinkedHashSet<Integer>();
        System.out.println("----------LinkedHashSet Integer---------");
        System.out.println("-----------Integer---------");
        vegetables.add(10);
        vegetables.add(02);
        vegetables.add(5);
        vegetables.add(6);
        System.out.println(vegetables);
        System.out.println(vegetables);

        Set<String> vegetables1 = new LinkedHashSet<String>();
        System.out.println("----------LinkedHashSet---------");
        System.out.println("-----------String---------");
        vegetables1.add("Hydar");
        vegetables1.add("Ali");
        vegetables1.add("Raju");
        vegetables1.add("kaju");
        System.out.println(vegetables1);
    }
}
