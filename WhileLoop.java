import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        //PRINTING NUMBERS
        System.out.println("Enter N value");
        int n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }

        //SUM OF NATURAL NUMBERS
        int sum = 0;
        int j=0;
        System.out.println("Enter M value");
        int m = sc.nextInt();
        while(j<=m){
            sum = sum + j;
            j++;
        }
        System.out.println(sum);
    }
}
