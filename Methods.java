
class Demo{

    public void Greet(){

        System.out.println("Hello, Good Evening!");

    }

    public void sum(int a,int b){
        System.out.println("Sum is: " + (a+b));
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public void div(int a,int b){
        System.out.println("Div is: " + (a/b));
    }

    //STUDENT DETAILS
    public void s1(String name,int age, String branch){

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Branch: " + branch);
    }

    public void s2(String name,int age, String branch,int rollNo){

        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Branch: " + branch);
        System.out.println("Student Roll Number: " + rollNo);
    }

    public String t1(String name,int age){

        System.out.println("Student Name: " + name);
        return "Student Age: " + age;

    }
}


class Company{

    public void empDetails(String eName,int eId, long eSalary,String eRole){

        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Id: " + eId);
        System.out.println("Employee Salary: " + eSalary);
        System.out.println("Employee Role: " + eRole);
    }

    public void deptDetails(String dName,int dId, int noOfEmp,String phNo){

        System.out.println("Department Name: " + dName);
        System.out.println("Department Id: " + dId);
        System.out.println("Department No of people: " + noOfEmp);
        System.out.println("Department Contact Number: " + phNo);
    }

}



public class Methods {
    public static void main(String args[]){
//        String s = "Hydar";
//        Built-In Methods
//        System.out.println(s.length());
//        System.out.println(Math.max(a,b));

        Demo obj1 = new Demo();
        Company obj2 = new Company();

        obj1.Greet();
        obj1.sum(45,68);
        System.out.println("Sub is: " + obj1.sub(10,5));
        int result = obj1.mul(12,11);
        System.out.println("Mul is: " + result);
        obj1.div(200,40);

        System.out.println();
        System.out.println("-------STUDENT-1 DETAILS-------");
        obj1.s1("hydar",22,"cs");

        System.out.println();
        System.out.println("-------STUDENT-2 DETAILS-------");
        obj1.s2("Ali",22,"CSE",041);

        System.out.println();
        System.out.println("-------TRAINER DETAILS-------");
        System.out.println(obj1.t1("Manjunath",28));
        System.out.println();


        //COMPANY DATABASE
        System.out.println("-------EMPLOYEE DETAILS-------");
        obj2.empDetails("Hydar",214,100000,"Software Dev");
        System.out.println();

        System.out.println("-------DEPARTMENT DETAILS-------");
        obj2.deptDetails("Developer",18,26,"9235647820");

    }
}
