
interface Animal1{
     void eat();
     void travel();
}
class Mammal implements Animal1{
    public void eat(){
        System.out.println("Mammals Eat");
    }
    public void travel(){
        System.out.println("Mammals travel from one place to another");
    }
}

interface abc1{
    int a = 10; // final and static
     void add();
     void sub(int a, int b);
}
class def implements abc1{
    public void add(){
        int a=5;
        int b=13;
        System.out.println("Addition: " + (a+b));
    }
    public void sub(int a, int b){
        System.out.println("Substraction: " + (a-b));
    }
}


public class Interfaces {
    public static void main(String args[]){
        Mammal obj = new Mammal();
        obj.eat();
        obj.travel();
        System.out.println("----------------------------------");

        def obj1 = new def();
        obj1.add();
        obj1.sub(23,11);

    }
}
