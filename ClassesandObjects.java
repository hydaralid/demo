class Dog{
    String name = "Tommy";
    int age = 7;
    String color = "Black";
}

class Cat{
    String name = "Stephen";
    int age = 5;
    String color = "White";
}

class Car{
    String name = "Fortuner";
    String color = "White";
    int price = 5000000;
    String fuel = "Diesel";
}

class Bike{
    String name = "Honda Hornet";
    String color = "Orange";
    int price = 100000;
    String fuel = "Petrol";
    int cc = 220;
}

class Mobile{
    String name = "RealMe";
    String color = "Black";
    String processor = "Snapdragon 7s ";
    String RAM = " 10GB";
    String ROM = " 256 GB";
    int price = 50000;
}
public class ClassesandObjects {
    public static void main(String args[]){

        Dog obj1 = new Dog();
        Cat obj2 = new Cat();
        Car obj3 = new Car();
        Bike obj4 = new Bike();
        Mobile obj5 = new Mobile();

        System.out.println("-------DOG Class-------");
        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);
        System.out.println("Color: " + obj1.color);
        System.out.println();

        System.out.println("-------CAT Class-------");
        System.out.println("Name: " + obj2.name);
        System.out.println("Age: " + obj2.age);
        System.out.println("Color: " + obj2.color);
        System.out.println();

        System.out.println("-------CAR Class-------");
        System.out.println("Name: " + obj3.name);
        System.out.println("Color: " + obj3.color);
        System.out.println("Price: " + obj3.price);
        System.out.println("Fuel Type: " + obj3.fuel);
        System.out.println();

        System.out.println("-------BIKE Class-------");
        System.out.println("Name: " + obj4.name);
        System.out.println("Color: " + obj4.color);
        System.out.println("Price: " + obj4.price);
        System.out.println("Fuel Type: " + obj4.fuel);
        System.out.println("CC: " + obj4.cc);
        System.out.println();

        System.out.println("-------MOBILE Class-------");
        System.out.println("Name: " + obj5.name);
        System.out.println("Color: " + obj5.color);
        System.out.println("Processor: " + obj5.processor);
        System.out.println("RAM: " + obj5.RAM);
        System.out.println("ROM: " + obj5.ROM);
        System.out.println("Price: " + obj5.price);
    }
}
