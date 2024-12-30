
class Parent1{
    public void mobile(){
        System.out.println("Samsung");
    }
}
class Child1 extends Parent1{
    public void mobile(){
        System.out.println("I Phone");
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        Child1 obj = new Child1();

        obj.mobile();
    }
}
