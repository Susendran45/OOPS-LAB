class ManufacturingMachine 
{
String machineType;
int productionRate;
ManufacturingMachine() 
{
this.machineType = "General Purpose";
this.productionRate = 100;
System.out.println("Basic manufacturing machine created");
}
ManufacturingMachine(String type, int rate) 
{
this.machineType = type;
this.productionRate = rate;
System.out.println("Custom " + type + " machine created with rate: " + rate);
}
void operate() 
{
System.out.println(machineType + " machine operating at " + productionRate + " units/hour");
}
}
class InjectionMolder extends ManufacturingMachine 
{
String moldType;
int temperature;
InjectionMolder() 
{
super();
this.moldType = "Standard";
this.temperature = 200;
}
InjectionMolder(String type, int rate, String mold, int temp) 
{
super(type, rate); 
this.moldType = mold;
this.temperature = temp;
}
@Override
void operate() 
{
System.out.println("Injection molding machine operating with " + moldType + " mold at " + temperature + "°C");
System.out.println("Production rate: " + productionRate + " units/hour");
}
}
class AssemblyRobot extends ManufacturingMachine 
{
int precisionLevel;
AssemblyRobot() 
{
super("Assembly Robot", 50); 
this.precisionLevel = 5;
}
AssemblyRobot(int precision) 
{
super("High-Precision Robot", 30);
this.precisionLevel = precision;
}
@Override
void operate() 
{
System.out.println("Robot assembling with precision level " + precisionLevel);
System.out.println("Production rate: " + productionRate + " units/hour");
}
}
public class ManufacturingDemo2
{
public static void main(String[] args) 
{
System.out.println("=== MANUFACTURING SYSTEM ===");        
ManufacturingMachine machine1 = new ManufacturingMachine();
machine1.operate();
ManufacturingMachine machine2 = new ManufacturingMachine("CNC", 75);
machine2.operate();
System.out.println("\nSpecialized Machines:");
InjectionMolder molder1 = new InjectionMolder();
molder1.operate();
AssemblyRobot robot1 = new AssemblyRobot();
robot1.operate();
AssemblyRobot robot2 = new AssemblyRobot(8);
robot2.operate();
}
}