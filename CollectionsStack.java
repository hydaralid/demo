import java.util.Stack;
import java.util.List;
public class CollectionsStack {
    public static void main(String[] args) {

        Stack<Integer> number = new Stack<Integer>();
        System.out.println("------Stack--------");
        number.push(2);
        number.push(42);
        number.push(86);
        number.add(15);
        number.add(35);
        System.out.println(number);
        number.pop();
        System.out.println(number);
        System.out.println("In Stack \"push/add\" method is used to insert the data and \"pop\" method is used to remove elements");
    }
}
