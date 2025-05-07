public class Employee{
    String name;
    int id;
    double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;


    }
    public void displayinfo(){
        System.out.println("employee Id:"+id);
        System.out.println("employee name:"+name);
        System.out.println("employee salary:"+salary);
    }
    public static void main(String[] args) {
        Employee emp1=new Employee("ABC",101,10000.0);
        emp1.displayinfo();
    }
}