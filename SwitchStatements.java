import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // WEEK DAYS
        System.out.println("Enter the day Value: ");
        int day = sc.nextInt();

        switch (day){

            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Enter valid day number");
        }

        // GRADES
        System.out.println("Enter the Grade: ");
        sc.nextLine();
        String grade = sc.nextLine();

        switch (grade){
            case "a","A":
                System.out.println("Score is >90");
                break;
            case "b","B":
                System.out.println("Score is >80");
                break;
            case "c","C":
                System.out.println("Score is >60");
                break;
            case "d","D":
                System.out.println("Score is >45");
                break;
            case "e","E":
                System.out.println("35");
                break;
            default:
                System.out.println("FAIL");
        }
    }
}
