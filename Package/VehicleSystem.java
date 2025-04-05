import vehicles.Engine;
import electronics.GPS;
public class VehicleSystem {
public static void main(String[] args) {
Engine v6 = new Engine("V6", 300);
GPS navSystem = new GPS("Garmin");
Car myCar = new Car("Toyota Camry", v6, navSystem);
myCar.displaySpecs();
myCar.driveTo("New York");
}
}
class Car 
{
private String model;
private Engine engine;
private GPS gps;
public Car(String model, Engine engine, GPS gps) {
this.model = model;
this.engine = engine;
this.gps = gps;
}
public void displaySpecs() {
System.out.println("\n=== VEHICLE SPECS ===");
System.out.println("Model: " + model);
System.out.println("Engine: " + engine.getType());
System.out.println("Horsepower: " + engine.getHorsepower() + " HP");
}
public void driveTo(String destination) {
System.out.println("\nStarting journey...");
gps.navigate(destination);
System.out.println("Arrived at " + destination);
}
}