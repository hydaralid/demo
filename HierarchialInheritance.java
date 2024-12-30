//
//class A{ // Parent Class
//    public void m1(){
//        System.out.println("Parent class - A");
//
//
//    }
//}
//class B extends A{ // Child Class 1
//    public void m2(){
//        System.out.println("Child class - B");
//
//    }
//}
//class C extends A{ // Child Class 2
//    public void m3(){
//        System.out.println("Child class - C");
//
//    }
//}


class Food{ // Parent Class
    public void m1(String foodType, String name, int rating){
        System.out.println("Food Type: " + foodType);
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("----------------------------");
    }
}
class F1 extends Food{ // Parent Class
    public void m2(String name, int price,int quantity){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("----------------------------");
    }
}
class F2 extends Food{ // Parent Class
    public void m3(String name, int price,int quantity){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("----------------------------");
    }
}

public class HierarchialInheritance {
    public static void main(String args[]){
//        C obj = new C();
//        B obj1 = new B();
//
//        obj.m1();
//        obj.m3();
//
//        obj1.m1();
//        obj1.m2();

        F1 obj2 = new F1();
        F2 obj3 = new F2();

        obj2.m1("Non-Veg","Biryani",5);
        obj2.m2("Biryani",120,5);

        obj3.m3("Dosa",70,3);
        obj3.m1("Veg","Dosa",4);
    }
}
