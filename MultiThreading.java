
class hi extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }
        }
    }
}
class hello extends Thread{
    public void run(){
        for(int i=0;i<=4;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }
        }
    }
}
class CollegeDetails extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }
            System.out.println("Atria Institute of Technology, Bangalore");
        }
    }
}
class IntermediateDetails extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }
            System.out.println("SES Vidyamandir, Ballery");
        }
    }
}
class SchoolDetails extends Thread{
    public void run(){
        for(int i=0;i<=2;i++){
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
            }
            System.out.println("Krupa Nilaya, Ballery");

        }
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        hi obj = new hi();
        hello obj1 = new hello();
        obj.start();
        obj1.start();


        CollegeDetails obj2 = new CollegeDetails();
        IntermediateDetails obj3 = new IntermediateDetails();
        SchoolDetails obj4 = new SchoolDetails();

        obj4.start();
        obj3.start();
        obj2.start();


    }
}
