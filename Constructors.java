
class abc{

     abc(){ //Constructor
         System.out.println("Hi, This is Constructor");
     }

    abc(int a,int b){ // Parameterised Constructor
        System.out.println("Hi, This is a Parameterised Constructor");
        System.out.println("Sum is: " + (a+b));
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}

class Person{

    Person(String name, int age){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("-----------------------------------------");
    }
    public void details(){
        String name = "Raju";
        int age = 28;
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }

}

class Lorry{

    Lorry(String fuelType, String capacity){
        System.out.println("-----------Lorry--------------");
        System.out.println("Fuel Type: " +fuelType);
        System.out.println("Capacity: " +capacity);
    }

    Lorry(String color, int price, int tyreSize){
        System.out.println("-----------Lorry 1--------------");
        System.out.println("Color: " +color);
        System.out.println("Price: " +price);
        System.out.println("Tyre Size: " +tyreSize);
    }

    public void bike(String name, String color, int price){
        System.out.println("-----------Bike--------------");
        System.out.println("Name: " +name);
        System.out.println("Color: " +color);
        System.out.println("Price: " +price);
    }
    public void car(String name, String color){
        System.out.println("-----------Car--------------");
        System.out.println("Name: " +name);
        System.out.println("Color: " +color);
    }

}

class E1{

    E1(String name,String role,int salary,char gender){
        System.out.println("-----------E1--------------");
        System.out.println("Name: " +name);
        System.out.println("Role: " +role);
        System.out.println("Salary: " +salary);
        System.out.println("Gender: " +gender);
    }

    E1(String name, int age, String location,int experience){
        System.out.println("-----------E1--------------");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Location: " +location);
        System.out.println("Experience: " +experience);
    }

    public void h1(String name, int id, String companyName){
        System.out.println("-----------H1--------------");
        System.out.println("Name: " +name);
        System.out.println("Id: " +id);
        System.out.println("Company Name: " +companyName);
    }

    public void d1(int dId, String dName, String dLocation){
        System.out.println("-----------D1--------------");
        System.out.println("Dept Id: " +dId);
        System.out.println("Dept Name: " +dName);
        System.out.println("Dept Location: " +dLocation);
    }

}

public class Constructors {
    public static void main(String args[]){

        abc obj1 = new abc();
        abc obj2 = new abc(3,1);

        Person obj3 = new Person("Hydar", 22);
        obj3.details();

        Lorry obj4 = new Lorry("Diesel","20 Tons");
        Lorry obj5 = new Lorry("Yellow",2000000,22);
        obj5.bike("Honda","Orange",70000);
        obj5.car("Scorpio","Red");

        E1 obj6 = new E1("Vishwa","Tester",25000,'M');
        E1 obj7 = new E1("Praveen",23,"Sandur",1);
        obj7.h1("Ali",101,"TCS");
        obj7.d1(1001,"Developer","Bangalore");


    }
}
