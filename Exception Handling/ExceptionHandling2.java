import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling2 {
public static void main(String[] args) {
final double MIN_BALANCE = 100.0;
Scanner scanner = new Scanner(System.in);
double balance = 500.0;
try {
System.out.print("Enter withdrawal amount: ");
double amount = scanner.nextDouble();
if (amount <= 0) {
throw new IllegalArgumentException("Amount must be positive");
}
if ((balance - amount) < MIN_BALANCE) {
throw new ArithmeticException("Insufficient funds - cannot go below minimum balance");
}
balance -= amount;
System.out.printf("Withdrawal successful. New balance: %.2f%n", balance);
} catch (InputMismatchException e) {
System.out.println("Error: Please enter a valid number");
} catch (IllegalArgumentException e) {
System.out.println("Error: " + e.getMessage());
} catch (ArithmeticException e) {
System.out.println("Transaction failed: " + e.getMessage());
} finally {
scanner.close();
System.out.println("Thank you for banking with us!");
final String TRANSACTION_COMPLETE = "Transaction processed";
System.out.println(TRANSACTION_COMPLETE);
}
}
}