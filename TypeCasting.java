public class TypeCasting {

    public static void main(String[] args) {
        //IMPLICIT TYPECASTING
        int a=10;
        long l=a;
        System.out.println(l);

        //EXPLICIT TYPECASTING
        long b=20;
        // int c=b; ERROR
        int c=(int)b;
        System.out.println(c);

        // DEMO
        // float to int
        float f = 30.0f;
        int i=(int)f;
        System.out.println(i);
        // float to int -> explicit
        // int to float -> implicit

        //double to long
        long l1 = 40l;
        double d = l1;
        System.out.println(l1);
        // double to long -> explicit
        // long to double -> implicit

        // long to short
        short s = 50;
        long l2 = s;
        System.out.println(l2);
        // long to short -> explicit
        // short to long -> implicit

    }
}
