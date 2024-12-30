import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ELIGIBILITY FOR VOTE
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println(" Not Eligible to vote");
        }
        System.out.println();

        // EVEN OR ODD
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        System.out.println();

        //LEAP YEAR
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400 ==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println(" Not a Leap Year");
        }
    }
}
