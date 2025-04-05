class Vehicle {
private String model;
private int currentMileage;
private int lastServiceMileage;
public Vehicle(String model) {
this.model = model;
this.currentMileage = 0;
this.lastServiceMileage = 0;
}
public void addMiles(int miles) {
if (miles > 0) {
currentMileage += miles;
} else {
System.out.println("Error: Miles must be positive");
}
}
public boolean isServiceDue() {
return (currentMileage - lastServiceMileage) >= 5000;
}
public void servicePerformed() {
lastServiceMileage = currentMileage;
System.out.println("Service recorded at " + currentMileage + " miles");
}
public int getCurrentMileage() {
return currentMileage;
}
public String getModel() {
return model;
}
}
public class OdometerDemo {
public static void main(String[] args) {
Vehicle car = new Vehicle("Toyota Corolla");
car.addMiles(3000);
System.out.println(car.getModel() + " mileage: " + car.getCurrentMileage());
System.out.println("Service due? " + car.isServiceDue());
car.addMiles(2500);
System.out.println("New mileage: " + car.getCurrentMileage());
System.out.println("Service due? " + car.isServiceDue());
car.servicePerformed();
}
}