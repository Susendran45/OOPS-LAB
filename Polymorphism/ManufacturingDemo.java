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
System.out.println("Injection molding with " + moldType + " mold at " + temperature + "°C");
super.operate();
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
super.operate();
}
}
public class ManufacturingDemo 
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
InjectionMolder molder2 = new InjectionMolder("Plastic Molder", 120, "Complex", 250);
molder1.operate();
molder2.operate();
AssemblyRobot robot1 = new AssemblyRobot();
AssemblyRobot robot2 = new AssemblyRobot(8);
robot1.operate();
robot2.operate();
}
} 