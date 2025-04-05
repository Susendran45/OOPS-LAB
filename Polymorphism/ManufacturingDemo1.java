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
void operate(int duration) 
{
System.out.println(machineType + " machine operating at " + productionRate + " units/hour for " + duration + " hours");
}
void operate(String shift) 
{
System.out.println(machineType + " machine operating at " + productionRate + " units/hour during " + shift + " shift");
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
void operateWithMold() 
{
System.out.println("Operating with " + moldType + " mold at " + temperature + "°C");
}
void operateWithMold(int cycles) 
{
System.out.println("Operating " + cycles + " cycles with " + moldType + " mold at " + temperature + "°C");
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
void assemble() 
{
System.out.println("Assembling with precision level " + precisionLevel);
}
void assemble(String component) 
{
System.out.println("Assembling " + component + " with precision level " + precisionLevel);
}
}
public class ManufacturingDemo1 
{
public static void main(String[] args) 
{
System.out.println("=== MANUFACTURING SYSTEM ===");        
ManufacturingMachine machine1 = new ManufacturingMachine();
machine1.operate();
machine1.operate(8);
machine1.operate("night");
ManufacturingMachine machine2 = new ManufacturingMachine("CNC", 75);
machine2.operate();
machine2.operate(12);
System.out.println("\nSpecialized Machines:");
InjectionMolder molder1 = new InjectionMolder();
molder1.operate();
molder1.operateWithMold();
molder1.operateWithMold(50);
AssemblyRobot robot1 = new AssemblyRobot();
robot1.operate();
robot1.assemble();
robot1.assemble("engine block");
}
}