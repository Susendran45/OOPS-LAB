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
class Developer extends Employee
{
String programmingLanguage;
Developer(String name, double salary, String programmingLanguage)
{
super(name, salary);
this.programmingLanguage = programmingLanguage;
}
void displayDeveloper()
{
System.out.println("Programming Language: " + programmingLanguage);
}
}
class TechLead extends Developer
{
String team;
TechLead(String name, double salary, String programmingLanguage, String team)
{
super(name, salary, programmingLanguage);
this.team = team;
}
void displayTechLead()
{
System.out.println("Team: " + team);
}
}
public class Company3
{
public static void main(String[] args)
{
Manager mgr = new Manager("Sarah", 80000, "IT");
Developer dev = new Developer("Alex", 70000, "Java");
TechLead tl = new TechLead("Mark", 90000, "Python", "AI Team");
System.out.println("Manager Details:");
mgr.displayEmployee();
mgr.displayManager();
System.out.println("\nDeveloper Details:");
dev.displayEmployee();
dev.displayDeveloper();
System.out.println("\nTechLead Details:");
tl.displayEmployee();
tl.displayDeveloper();
tl.displayTechLead();
}
}