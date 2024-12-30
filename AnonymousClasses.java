//
//class Parent{
//    public void mobile(){
//        System.out.println("Addition");
//    }
//}

abstract class arithematic1{ //Anonymous Classes for abstract methods
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);
}

public class AnonymousClasses {
    public static void main(String args[]) {
//        Parent obj = new Parent() {
//            public void mobile() {
//                System.out.println("Substraction");
//            }
//        }; //Anonymous Classes
//        obj.mobile();
//    }

    arithematic1 obj1 = new arithematic1() {
        public void add(int a, int b) {
            System.out.println(a + b);
        }

        public void sub(int a, int b) {
            System.out.println(a - b);
        }

        public void mul(int a, int b) {
            System.out.println(a * b);
        }

        public void div(int a, int b) {
            System.out.println(a / b);
        }
    };
    obj1.add(5,6);
    obj1.sub(7,6);
    obj1.mul(5,6);
    obj1.div(18,6);

}
}
