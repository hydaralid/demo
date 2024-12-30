
class demo1{
    // Method Overloading
    public void add(int a,int b){
        System.out.println("Sum is: " + (a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("Sum is: " + (a+b+c));
    }

    // Constructor Overloading
    demo1(int a,int b){
        System.out.println("Sum is: " + (a+b));
    }
    demo1(int a,int b,int c){
        System.out.println("Sum is: " + (a+b+c));

    }
}

public class MethodOverloading {
    public static void main(String args[]){
        demo1 obj = new demo1(10,20);
        demo1 obj1 = new demo1(10,20,30);

        obj.add(41,36);
        obj.add(1,2,3);
    }
}
