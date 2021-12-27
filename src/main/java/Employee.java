import java.util.ArrayList;
import java.util.List;

class EmployeeDetails {
    int id;
    String name;
    int salary;

    public EmployeeDetails(int id, String name, int salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void searchStudent(String search, List<EmployeeDetails> EmpList) {
        if (name == search) {
            System.out.println(search +" is present ");
        }
        else {
            System.out.println("");
        }
    }
}
public class Employee {
    public static void main(String[] args) {
        List<EmployeeDetails> EmpList = new ArrayList<>();
        EmpList.add(new EmployeeDetails(1, "Gowthami", 20150));
        EmpList.add(new EmployeeDetails(2, "Sangeetha", 21023));
        EmpList.add(new EmployeeDetails(3, "Rohit", 20012));

        for (EmployeeDetails emp : EmpList) {
            System.out.println(emp.id + " " + emp.name + " " +emp.salary);
        }
        for(EmployeeDetails emp : EmpList) {
            emp.searchStudent("Gowthami",EmpList);
        }
        for(EmployeeDetails emp : EmpList) {
            if (emp.name == "Sangeetha" & emp.salary <=21023 ) {
                System.out.println(emp.name+ " is found");
            }
            else{
                System.out.println(emp.name+ " is not found");
            }
        }
    }
}

