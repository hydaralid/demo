import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        int c=a+b;
        System.out.println("Sum of a & b is: " + c);
        sc.nextLine();

        System.out.println("Enter the First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter the Last Name: ");
        String lastName = sc.nextLine();

        System.out.println("Enter the College Name: ");
        String collegeName = sc.nextLine();

        System.out.println("Enter the Branch Name: ");
        String branchName = sc.nextLine();

        System.out.println("Enter the Mobile Number: ");
        long mobileNum = sc.nextLong();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the USN: ");
        String usn = sc.nextLine();


        System.out.println("First Name: " +  firstName);
        System.out.println("Last Name: " +  lastName);
        System.out.println("College Name: " +  collegeName);
        System.out.println("Branch Name: " +  branchName);
        System.out.println("Mobile Number: " +  mobileNum);
        System.out.println("Age: " +  age);
        System.out.println("USN: " +  usn);
    }
}
