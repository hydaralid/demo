
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
        void draw(){
            System.out.println("Drawing a circle");
        }
}

abstract class Operations{
    abstract void addition();
    abstract void substraction();
    abstract void multiplication(int a,int b);
    abstract void division(float a,float b);
}
class Arithmetic extends Operations{
    void addition(){
        int a = 10;
        int b = 10;
        System.out.println("Addition is: " + (a+b));
    }
    void substraction(){
        int a = 20;
        int b = 10;
        System.out.println("Substraction is: " + (a-b));
    }
    void multiplication(int a,int b){
        System.out.println("Multiplication is: " + (a*b));
    }
    void division(float a,float b){
        System.out.println("Division is: " + (a/b));
    }
}

abstract class Details{
    abstract void officeWorkDetails(int id,String loginHours);
}
class Person1 extends Details{
    // Abstraction method
    void officeWorkDetails(int id,String loginHours){
        System.out.println("-------Office Work Details-------");
        System.out.println("Id: " + id);
        System.out.println("Login Hours: " + loginHours);
        System.out.println();
    }

    // Normal method
    public void personalWorkDetails(String readingHours,String sleepingHours){
        System.out.println("-------Personal Work Details-------");
        System.out.println("Reading Hours: " + readingHours);
        System.out.println("Sleeping Hours: " + sleepingHours);
        System.out.println();
    }

    // Constructors
    Person1(String name, int age){
        System.out.println("-------Person Details-------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Assignment
abstract class Vehicle{
    abstract void start();
}
class Car2 extends Vehicle {
    void start() {
        System.out.println("It is a Car");
    }
}
class MotorCycle extends Vehicle {
    void start() {
        System.out.println("It is a MotorCycle");
    }
}




public class Abstraction {
    public static void main(String args[]){
        Circle obj = new Circle();
        obj.draw();

        Arithmetic obj1 = new Arithmetic();
        obj1.addition();
        obj1.substraction();
        obj1.multiplication(12,13);
        obj1.division(5,10);

        Person1 obj2 = new Person1("Hydar", 22); // Constructor call
        obj2.officeWorkDetails(101, " 8 Hrs"); // Abstraction method call
        obj2.personalWorkDetails("4 Hrs", " 8 Hrs");  // Normal method call

        Car2 obj3 = new Car2();
        MotorCycle obj4 = new MotorCycle();

        obj3.start();
        obj4.start();
    }
}
