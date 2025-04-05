class TempConverter {
private double celsius;
public TempConverter() {
this.celsius = 0;
}
public void setCelsius(double celsius) {
this.celsius = celsius;
}
public void setFahrenheit(double fahrenheit) {
this.celsius = (fahrenheit - 32) * 5 / 9;
}
public double getCelsius() {
return celsius;
}
public double getFahrenheit() {
return celsius * 9 / 5 + 32;
}
}
public class TempConverterDemo {
public static void main(String[] args) {
TempConverter temp = new TempConverter();
temp.setCelsius(25);
System.out.println("25°C is " + temp.getFahrenheit() + "°F");
temp.setFahrenheit(77);
System.out.println("77°F is " + temp.getCelsius() + "°C");
}
}