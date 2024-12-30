import java.util.Scanner;
public class ReverseOfAnArray {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50,60};
        int low=0;
        int high=array.length-1;

        while(low<high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + ", ");
        }
    }
}
