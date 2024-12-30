import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter N value");
//        int n = sc.nextInt();
//        for(int i=0;i<=n;i++){
//            System.out.println(i);
//        }
//
//        //SUM OF NUMBERS
//        int sum = 0;
//        for(int i=0;i<=n;i++){
//            sum = sum + i;
//        }
//        System.out.println("sum is: " + sum);

        // PRINTING *(star)
//        for(int i=0;i<=n;i++){
//            for(int j=5;i<=j;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        char[] ch = {'h','y','d','a','r'};
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<5;j++){
                System.out.println(ch[i]);
            }

        }


    }
}
