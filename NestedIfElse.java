import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter value of B: ");
        int b = sc.nextInt();
        System.out.println("Enter value of C: ");
        int c = sc.nextInt();

        if(a>=b){
            if(a>=c)
            {
                System.out.println(a + " is largest");
            }
            else{
                System.out.println(c + " is largest");
            }

        }
        else
        {
            if(b>=c){
                System.out.println(b + " is largest");
            }
            else{
                System.out.println(c + " is largest");
            }
        }

        // MARKS GRADES
        System.out.println("Enter value of D: ");
        int d = sc.nextInt();

        if(d>=80)
        {
            if(d>=90){
                System.out.println( "A Grade");
            }
            else{
                System.out.println("B Grade");
            }
        }
        else
        {
               if(d>=70){
                   System.out.println(" C Grade");
               }
               else{
                   System.out.println(" D Grade");
               }
        }


    }
}
