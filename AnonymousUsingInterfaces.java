
interface arithematic2{ //Anonymous Classes Using interfaces
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
    public abstract void div(int a,int b);
}

public class AnonymousUsingInterfaces {
    public static void main(String args[]) {
        arithematic2 obj1 = new arithematic2() {
            public void add(int a, int b) {
                System.out.println("Sum: " + (a+b));
            }

            public void sub(int a, int b) {
                System.out.println("Difference: " + (a-b));
            }

            public void mul(int a, int b) {
                System.out.println("Product: " + (a*b));
            }

            public void div(int a, int b) {
                System.out.println("Division: " + (a/b));
            }
        };
        obj1.add(5,6);
        obj1.sub(7,6);
        obj1.mul(5,6);
        obj1.div(18,6);

    }
}
