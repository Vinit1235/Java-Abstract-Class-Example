import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Company {
    abstract void name();
    abstract void salary();
    abstract void department();

    void sal() {
        System.out.println("Fixed Salary Provided");
    }
}

class Empldet extends Company {
    String empName;
    double empSalary;
    String empDept;

    Empldet(String name, double salary, String dept) {
        this.empName = name;
        this.empSalary = salary;
        this.empDept = dept;
    }

    public void name() {
        System.out.println("Employee Name: " + empName);
    }

    public void salary() {
        System.out.println("Salary: " + empSalary);
    }

    public void department() {
        System.out.println("Department: " + empDept);
    }
}

public class Abstcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empldet> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();

            employees.add(new Empldet(name, salary, dept));
        }

        System.out.println("\n=== Employee Details ===");
        for (Empldet e : employees) {
            e.name();
            e.salary();
            e.department();
            e.sal();
            System.out.println();
        }
        sc.close();
    }
}
