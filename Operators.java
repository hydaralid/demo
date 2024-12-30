public class Operators {

    public static void main(String[] args) {

        //ARITHEMATIC OPERATORS
        System.out.println("ARITHEMATIC OPERATORS");
        int a=20;
        int b=10;
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--b));
        System.out.println();


        //RELATIONAL OPERATORS
        System.out.println("RELATIONAL OPERATORS");
        int c = 10;
        int d= 5;
        System.out.println(c>d);
        System.out.println(c<d);
        System.out.println(c>=d);
        System.out.println(c<=d);
        System.out.println(c==d);
        System.out.println(c!=d);
        System.out.println();

        String s1 = "Hydar";
        String s2= "Ali";
//        System.out.println(s1>s2); ERROR
//        System.out.println(s1<s2); ERROR
//        System.out.println(s1>=s2); ERROR
//        System.out.println(s1<=s2); ERROR
        System.out.println(s1==s2);
        System.out.println(s1!=s2);
        System.out.println();

        //LOGICAL OPERATORS
        System.out.println("LOGICAL OPERATORS");
        int e = 10;
        int f= 5;
        System.out.println((e>f) && (e<f));
        System.out.println((e>f) || (e<f));
        System.out.println(!(e>f) || (e<f));
        System.out.println((e>f) && (e==10));
        System.out.println(!(e==f) && f>1);
        System.out.println();

        //BITWISE OPERATOR
        System.out.println("BITWISE OPERATOR");
        int g = 4;
        int h = 2;
        System.out.println(g&h); //BITWISE AND
        System.out.println(g|h); //BITWISE OR
        System.out.println(g^h); // XOR
        System.out.println(~h);// NEGATION (~ = -(n+1) Eg: ~4 = -(4+1)
        System.out.println(g<<2); // shifting binary numbers towards left
        System.out.println(g>>2); // shifting binary numbers towards right
        int age = 22;
        int i = 7892;
        System.out.println(age&i);
        System.out.println(age|i);
        System.out.println(age^i);
        System.out.println(~i);
        System.out.println(age<<3);
        System.out.println(age>>3);
        System.out.println();

        //ASSIGNMENT OPERATORS
        System.out.println("ASSIGNMENT OPERATORS");
        int j;
        int k=10;
        System.out.println(j=10);
        System.out.println(j+=2);
        System.out.println(j-=2);
        System.out.println(j*=2);
        System.out.println(j/=2);
        System.out.println(j%=2);
        System.out.println(k<<=1);
        System.out.println(k>>=2);
        System.out.println(k&=1);
        System.out.println(j^=k);

    }
}
