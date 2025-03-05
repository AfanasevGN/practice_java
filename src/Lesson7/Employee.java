package Lesson7;

public class Employee {
    public double salary;

    public void salaryX2(){
        double result = salary*2;
        System.out.println("Salary is up to " + result);
    }

    public Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.salaryX2();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.salaryX2();
    }
}
