// Using int return type for multiplication
@FunctionalInterface
interface arithematic3{ //Anonymous Classes Using interfaces
    int mul(int a,int b,int c);
}

public class LambdaExpresssions {
    public static void main(String args[]) {
        arithematic3 obj1 = (a,b,c) -> (a*b*c);

        int result = obj1.mul(7,6,7);
        System.out.println(result);
    }
}



// Using void return type
//@FunctionalInterface
//interface Details1{ //Anonymous Classes Using interfaces
//    void details(String name,String location);
//}
//
//public class LambdaExpresssions {
//    public static void main(String args[]) {
//        Details1 obj2 = (name,location) -> {
//            System.out.println(name);
//            System.out.println(location);
//        };
//        obj2.details("\"Hydar Ali\"","Bangalore");
//    }
//}



// Using int return type for addition
//@FunctionalInterface
//interface arithematic3{ //Anonymous Classes Using interfaces
//    int add(int a,int b);
//}
//
//public class LambdaExpresssions {
//    public static void main(String args[]) {
//        arithematic3 obj1 = (a,b) -> (a+b);
//
//        int result = obj1.add(5,6);
//        System.out.println(result);
//    }
//}