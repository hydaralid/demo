//
//class person2{
//    private String name = "Hydar";
//    private int age = 22;
//
//     public String getName(){ // getters
//        return name;
//    }
//     public int getAge(){ // getters
//         return age;
//    }
//
//    public void setName(String name1){ // setters
//        name = name1;
//    }
//    public void setAge(int age1){ // setters
//        age = age1;
//    }
//}
//public void setName(String name1){ // setters
//    name = name1;
//}
//public void setAge(int age1){ // setters
//    age = age1;
//}


class student{
    private String name = "Hydar";
    private String branch = "CSE";
    private int rollNo = 041;
    private String address = "Bangalore";
    private int age = 22;

    public String getName(){ // getters
        return name;
    }
    public String getBranch(){ // getters
        return branch;
    }
    public int getRollNo(){ // getters
        return rollNo;
    }
    public String getAddress(){ // getters
        return address;
    }
    public int getAge(){ // getters
        return age;
    }


    public void setName(String name1){ // setters
        name = name1;
    }
    public void setBranch(String branch1){ // setters
        branch = branch1;
    }
    public void setRollNo(int rollNo1){ // setters
        rollNo = rollNo1;
    }
    public void setAddress(String address1){ // setters
        address = address1;
    }
    public void setAge(int age1){ // setters
        age = age1;
    }

}

public class Encapsulation {
    public static void main(String args[]){
//        person2 obj = new person2();
//        System.out.println("-------Before Setting Values-------");
//        System.out.println("Name: " + obj.getName());
//        System.out.println("Age: " + obj.getAge());
//
//        obj.setName("Ali");
//        obj.setAge(23);
//
//        System.out.println("-------After Setting Values-------");
//        System.out.println("Name: " + obj.getName());
//        System.out.println("Age: " + obj.getAge());

        student obj1 = new student();

        System.out.println("-------Before Setting Values-------");
        System.out.println("Name: " + obj1.getName());
        System.out.println("Branch: " + obj1.getBranch());
        System.out.println("Roll No: " + obj1.getRollNo());
        System.out.println("Address: " + obj1.getAddress());
        System.out.println("Age: " + obj1.getAge());

        obj1.setName("Ali");
        obj1.setBranch("ECE");
        obj1.setRollNo(001);
        obj1.setAddress("Mysore");
        obj1.setAge(17);

        System.out.println("-------After Setting Values-------");
        System.out.println("Name: " + obj1.getName());
        System.out.println("Branch: " + obj1.getBranch());
        System.out.println("Roll No: " + obj1.getRollNo());
        System.out.println("Address: " + obj1.getAddress());
        System.out.println("Age: " + obj1.getAge());


    }
}
