package transactions;
import banking.Account;
public class Transaction {
public static void transfer(Account from, Account to, double amount) {
if (from.withdraw(amount)) {
to.deposit(amount);
System.out.println("Transfer successful: $" + amount);
} 
else {
System.out.println("Transfer failed: Insufficient funds");
}
}
}