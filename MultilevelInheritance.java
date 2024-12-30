
//class A{
//    public void hi(){
//        System.out.println("Hi");
//    }
//}
//class B extends A{
//    public void hello(){
//        System.out.println("Hello");
//    }
//}
//class C extends B{
//    public void how(){
//        System.out.println("How are you?");
//    }
//}

class Animal{
    public void details1(String color, String foodType){
        System.out.println("--------Details 1--------");
        System.out.println("Color: " + color);
        System.out.println("Type of Food: " + foodType);
        System.out.println();
    }
}
class Dog1 extends Animal{
    public void details2(String name, String breed, String color){
        System.out.println("--------Details 2--------");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println();
    }
}
class BabyDog1 extends Dog1{
    public void details3(String name, String breed, String color,char gender){
        System.out.println();
        System.out.println("--------Details 3--------");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
}

public class MultilevelInheritance {
    public static void main(String args[]){
//        C obj = new C();
//        obj.hi();
//        obj.hello();
//        obj.how();

        BabyDog1 obj1 = new BabyDog1();
        obj1.details1("White","Carnivores");
        obj1.details2("Tommy","Indian","Black");
        obj1.details3("Tom","German","Yellow",'F');
    }
}
