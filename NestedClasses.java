
class Tiger1{
    public void physic(){
        System.out.println("Tiger is a Strong Mammal");
    }
    class TigerChild{
        public void habit(){
            System.out.println("Tiger Cubs are cute and mischevious");
        }
    }
}


class DetailsPesonal{
    public void person(String name,int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    class EmployeeDetails{
        public void employee(int id,String name,double salary){
            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }
        public void dept(int id,String name){
            System.out.println("Id: " + id);
            System.out.println("Name: " + name);
        }
        public void hr(String name, String location){
            System.out.println("Name: " + name);
            System.out.println("Location: " + location);
        }
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        Tiger1 obj = new Tiger1();
        Tiger1.TigerChild obj1 = obj.new TigerChild();

        obj.physic();
        obj1.habit();
        System.out.println("---------------------------");

        DetailsPesonal obj2 = new DetailsPesonal();
        DetailsPesonal.EmployeeDetails obj3 = obj2.new EmployeeDetails();

        obj2.person("Hydar", 22);
        obj3.employee(101,"Hydar",40000);
        obj3.dept(1001,"Developer");
        obj3.hr("Ali","Bengaluru");
    }
}
