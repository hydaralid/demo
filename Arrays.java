public class Arrays {
    public static void main(String[] args) {
        System.out.println("----------Printing Array Elements--------------");
        int num[]={1,2,3,4,5};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);


        char arr[]={'h','y','d','a','r'};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("------------Sum & Average------------------");
        double sum = 0;
        double myList[] = {1.9,2.9,3.4,3.5};
        for(int i=0;i<myList.length;i++){
            System.out.print(myList[i] + ", ");
        }
        for(int i=0;i<myList.length;i++){
            sum += myList[i];
        }
       double avg = sum/myList.length;
        System.out.println();
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);

        System.out.println("------------Maximum Number of Array Elements------------------");
        int arr1[] = {9,7,15,1,2,10};
        int max = arr1[0];
        for(int i=0;i<arr1.length;i++){
                if(arr1[i]>=max){
                    max = arr1[i];
                }
        }
        System.out.println("Largest number is: " + max);

        System.out.println("------------Minimum Number of Array Elements------------------");
        int min = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<=min){
                min = arr1[i];
            }
        }
        System.out.println("Smallest number is: " + min);


    }
}
