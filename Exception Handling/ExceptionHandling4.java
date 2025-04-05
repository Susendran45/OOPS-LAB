import java.util.Scanner;
class InsufficientFundsException extends Exception {
public InsufficientFundsException(String message) {
super(message);
}
}
public class ExceptionHandling4 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double balance = 1000.0;
try {
System.out.print("Enter withdrawal amount: ");
double amount = scanner.nextDouble();
if (amount <= 0) {
throw new IllegalArgumentException("Amount must be positive");
}
if (amount > balance) {
throw new InsufficientFundsException("Not enough money in account");
}
balance -= amount;
System.out.println("Remaining balance: " + balance);
} catch (IllegalArgumentException e) {
System.out.println("Error: " + e.getMessage());
} catch (InsufficientFundsException e) {
System.out.println("Transaction failed: " + e.getMessage());
} catch (Exception e) {
System.out.println("Invalid input");
} finally {
scanner.close();
System.out.println("Transaction completed");
}
}
}