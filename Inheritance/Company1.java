class Employee 
{
    String name;
    double salary;
    
    Employee(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }
    
    void displayEmployee() 
    {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee 
{
    String department;
    
    Manager(String name, double salary, String department) 
    {
        super(name, salary); 
        this.department = department;
    }
    
    void displayManager() 
    {
        System.out.println("Department: " + department);
    }
}

class CEO extends Manager 
{
    String company;
    
    CEO(String name, double salary, String department, String company) 
    {
        super(name, salary, department); 
        this.company = company;
    }
    
    void displayCEO() 
    {
        System.out.println("Company: " + company);
    }
}

public class Company1
{
    public static void main(String[] args) 
    {
        CEO ceo = new CEO("John", 500000, "Executive", "Tech Corp");
        ceo.displayEmployee();  // From Employee
        ceo.displayManager();   // From Manager
        ceo.displayCEO();       // From CEO
    }
}