import java.io.File;
import java.io.FileReader;


public class ExceptionHandling {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 2;

        int array[] = new int[4];



        try{
            System.out.println(a/b);
            for(int i=0;i<3;i++){
                System.out.println(array[i+1]);
            }
            File file = new File("E://file.txt");
            FileReader fr = new FileReader(file);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Memory is Full");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block");
        }

    }
}
