public class JumpingStatements {
    public static void main(String[] args) {

        //BREAK STATEMENT
        System.out.println("------BREAK STATEMENT------");
        for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }

        //CONTINUE STATEMENT
        System.out.println("------CONTINUE STATEMENT------");
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }

    }
}
