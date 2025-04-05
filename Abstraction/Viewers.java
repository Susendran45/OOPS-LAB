interface Television {
void turnOn();
void turnOff();
}
class SmartTV implements Television {
@Override
public void turnOn() {
System.out.println("Smart TV is turning on...");
}
@Override
public void turnOff() {
System.out.println("Smart TV is turning off...");
}
public void browseInternet() {
System.out.println("Smart TV is browsing the internet");
}
}
class LEDTV implements Television {
@Override
public void turnOn() {
System.out.println("LED TV is turning on...");
}
@Override
public void turnOff() {
System.out.println("LED TV is turning off...");
}
public void adjustBrightness() {
System.out.println("LED TV brightness is being adjusted");
}
}
public class Viewers {
public static void main(String[] args) {
Television smartTv = new SmartTV();
Television ledTv = new LEDTV();
System.out.println("--- Smart TV Activities ---");
smartTv.turnOn();
((SmartTV) smartTv).browseInternet();
smartTv.turnOff();
System.out.println("\n--- LED TV Activities ---");
ledTv.turnOn();
((LEDTV) ledTv).adjustBrightness();
ledTv.turnOff();
}
}
