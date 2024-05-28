package lab;

// Employee_Bean class represents an employee entity with properties such as id, name, and salary.
public class Employee_Bean 
{
    int eid; // Declaring integer variable to store employee ID.
    String ename; // Declaring string variable to store employee name.
    double esalary; // Declaring double variable to store employee salary.

    // Constructor of Employee_Bean class.
    public Employee_Bean() 
    {
        // TODO Auto-generated constructor stub
        // Initializing the class variables eid, ename, and esalary.
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    // Getter method for retrieving employee ID.
    public int getEid()
    {
        return eid;
    }

    // Setter method for setting employee ID.
    public void setEid(int eid)
    {
        this.eid = eid;
    }

    // Getter method for retrieving employee name.
    public String getEname()
    {
        return ename;
    }

    // Setter method for setting employee name.
    public void setEname(String ename) 
    {
        this.ename = ename;
    }

    // Getter method for retrieving employee salary.
    public double getEsalary() 
    {
        return esalary;
    }

    // Setter method for setting employee salary.
    public void setEsalary(double esalary) 
    {
        this.esalary = esalary;
    }

    // Main method to test the Employee_Bean class.
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // Creating an instance of Employee_Bean class.
        Employee_Bean e = new Employee_Bean();

        // Setting values for employee ID, name, and salary.
        e.setEid(45);
        e.setEname("Lavanya");
        e.setEsalary(100000);

        // Printing employee details.
        System.out.println("Employee Id is " + e.getEid());
        System.out.println("Employee name is " + e.getEname());
        System.out.println("Employee Salary is " + e.getEsalary());
    }
}
