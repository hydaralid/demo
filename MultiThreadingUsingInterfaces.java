class College implements Runnable{
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
class Intermediate implements Runnable{
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


public class MultiThreadingUsingInterfaces {
    public static void main(String[] args) {

        College obj2 = new College();
        Intermediate obj3 = new Intermediate();
        Thread t1 = new Thread(obj2);
        Thread t2 = new Thread(obj3);
        
        t1.start();
        t2.start();

    }
}

