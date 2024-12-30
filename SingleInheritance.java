//
//class A{
//    public void parent(){
//        System.out.println("Hi");
//    }
//}
//
//class B extends A{
//    public void child(){
//        System.out.println("How are you?");
//    }
//}

//class dog{
//    public void details1(String name,String color,String breed){
//        System.out.println("Name: " + name);
//        System.out.println("Color: " + color);
//        System.out.println("Breed: " + breed);
//    }
//}
//
//class BabyDog extends dog{
//    public void details2(char gender){
//        System.out.println("Gender: " + gender);
//    }
//}


class car1{
    public void car2(String color,int no_of_wheels){
        System.out.println("-------car2-------");
        System.out.println("Color: " + color);
        System.out.println("No of Wheels: " + no_of_wheels);
        System.out.println();
    }
    public void details1(int price, String fuelType){
        System.out.println("-------Details 1-------");
        System.out.println("Price: " + price);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println();
    }
}

class BMW extends car1{
    public void BMW1(int price, String color){
        System.out.println("-------BMW 1-------");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println();
    }
    public void details2(String model, String color){
        System.out.println("-------Details2-------");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);

    }
}


public class SingleInheritance {
    public static void main(String args[]){

//        B obj = new B();
//        obj.parent();
//        obj.child();

//        BabyDog obj1 = new BabyDog();
//        obj1.details1("Tommy","White","German");
//        obj1.details2('M');


        BMW obj2 = new BMW();
        obj2.details2("Hybrid","White");
        obj2.details1(400000,"Diesel");
        obj2.car2("white",4);
        obj2.BMW1(200000,"Black");


    }
}
