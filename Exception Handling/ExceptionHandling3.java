import java.util.Scanner;
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
public class ExceptionHandling3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter your age: ");
int age = scanner.nextInt();
if (age < 0) {
throw new InvalidAgeException("Age cannot be negative");
} else if (age > 120) {
throw new InvalidAgeException("Age cannot be more than 120");
}
System.out.println("Valid age entered: " + age);
} catch (InvalidAgeException e) {
System.out.println("Error: " + e.getMessage());
} catch (Exception e) {
System.out.println("Invalid input");
} finally {
scanner.close();
System.out.println("Program completed");
}
}
}