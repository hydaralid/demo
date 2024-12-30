import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a = sc.nextInt();
        System.out.println("Enter value of B: ");
        int b = sc.nextInt();
        System.out.println("Enter value of C: ");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+ " is Largest");
        }
        else if(b>=c && b>=a){
            System.out.println(b + " is Largest");
        }
        else{
            System.out.println(c + " is Largest");
        }

    }
}
