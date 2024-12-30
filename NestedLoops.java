import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int row = sc.nextInt();
//        System.out.println("Enter columns: ");
//        int column = sc.nextInt();
//
//        for (int i=0; i<=row; i++){
//            for(int j=0; j<=column; j++){
//                System.out.print(i +""+ j +" ");
//            }
//            System.out.println();
//        }s

        //PRINTING STARS IN A PYRAMID FASHION 1
        for (int i=0; i<=row; i++){
            for(int j=0; i>=j; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //PRINTING STARS IN A PYRAMID FASHION 2
        for (int i=0; i<=row; i++){
            for(int j=row; i<=j; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //PRINTING STARS IN A PYRAMID FASHION 3
        for (int i=0; i<row; i++){
            for(int j=0; j<row-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //PRINTING STARS IN A PYRAMID FASHION 4
        for (int i=0; i<row; i++){
            for(int j=0; j<row-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
