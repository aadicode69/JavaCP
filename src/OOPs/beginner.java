package OOPs;
class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }public String getName(){
        return name;
    }public void setName(String newname) {
        name = newname;
    }
}
class CellPhone{
    public void ringing(){
        System.out.println("ringing...");
    }public void vibrating(){
        System.out.println("Vibrating...");
    }public void callFriend(){
        System.out.println("Calling friend...");
    }
}

public class beginner {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        
    }
}
