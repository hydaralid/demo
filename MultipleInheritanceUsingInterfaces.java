
// Multiple Inheritance Using Interface
interface Swimmer{
    void swim();
}
interface Flyer{
    void fly();
}
class Bird implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Bird is Swimming");
    }

    public void fly() {
        System.out.println("Bird is Flying");
    }
}

// Multilevel Inheritance
interface animal2{
    void eat();
}
interface mammal1 extends animal2{
    void fly();
}
class tiger implements mammal1{
    public void eat(){
        System.out.println("Tiger can hunt and Eat");
    }
    public void fly(){
        System.out.println("Tiger cannot fly but can jump");
    }
}

// Hierarchial Inheritance
interface amphibian{
    void habitat();
    void hunt();
}
class frog implements amphibian{
    public void habitat(){
        System.out.println("Frogs can live both in water as well as on land");
    }
    public void hunt(){
        System.out.println("Frogs can hunt in water as well as on lands");
    }
}
class crocodile implements amphibian{
    public void hunt(){
        System.out.println("Crocodiles can hunt in water as well as on lands");
    }
    public void habitat(){
        System.out.println("crocodile can live both in water as well as on land");
    }
}


public class MultipleInheritanceUsingInterfaces {
    public static void main(String args[]){
        Bird obj = new Bird();
        System.out.println("---------Multiple Inheritance-----------");

        obj.swim();
        obj.fly();

        System.out.println("---------Multilevel Inheritance-----------");
        tiger obj1 = new tiger();
        obj1.eat();
        obj1.fly();

        System.out.println("---------Hierarchial Inheritance-----------");
        frog obj2 = new frog();
        obj2.habitat();

        crocodile obj3 = new crocodile();
        obj3.hunt();


    }
}
