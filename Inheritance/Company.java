class Employee 
{
String name;
double salary;
Employee(String name, double salary) 
{
this.name = name;
this.salary = salary;
}
void display1() 
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
void display2() 
{
System.out.println("Department: " + department);
}
}
public class Company 
{
public static void main(String[] args) 
{
Manager mgr = new Manager("John", 50000, "HR");
mgr.display1();
mgr.display2();
}
}