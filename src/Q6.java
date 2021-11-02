class Employee {
    String Name;
    int EmployeeNumber;
    double Salary;
    public Employee(String name, int empNo, double salary)
    {
        Name = name;
        EmployeeNumber = empNo;
        Salary = salary;
    }
    public void Display()
    {
        System.out.println("\nEmployee Name = " + Name + "\nEmployee Number = " + EmployeeNumber + "\nSalary = " + Salary);
    }
}
class Department extends Employee {
    String DepartmentName;
    String DepartmentHead;

    public Department(String name, int empNo, double salary, String depName, String depHead) {
        super(name, empNo, salary);
        DepartmentName = depName;
        DepartmentHead = depHead;
    }

    public void Display() {
        System.out.println("\n  Department Details   ");
        super.Display();
        System.out.println("Department Name = " + DepartmentName + "\nDepartment Head = " + DepartmentHead);
    }

}
class SalaryEnhancement extends Employee
{
    double salaryEnhancement;
    public SalaryEnhancement(String name, int empNo, double salary, double sal)
    {
        super(name, empNo, salary);
        salaryEnhancement = sal;
    }
    public void Display()
    {
        System.out.println("\n   Salary Enhancement   ");
        super.Display();
        System.out.println("Annual Salary Enhancement = " + salaryEnhancement);
    }
}
class EmployeeMain
{
    public static void main(String args[])
    {
        Employee e = new Employee("Rhea",35, 17500 );
        System.out.println("  Employee Details   ");
        e.Display();
        Department d = new Department("Blessy ", 240, 20000, "Seas", ""+e.Name);
        d.Display();
        SalaryEnhancement s = new SalaryEnhancement(""+d.Name,+d.EmployeeNumber, d.Salary, 10000 + d.Salary);
        s.Display();
    }
}
