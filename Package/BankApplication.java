import banking.Account;
import transactions.Transaction;
public class BankApplication {
public static void main(String[] args) {
Account alice = new Account("ACC1001", 1000);
Account bob = new Account("ACC1002", 500);
System.out.println("Initial Balances:");
System.out.println("Alice: $" + alice.getBalance());
System.out.println("Bob: $" + bob.getBalance());
Transaction.transfer(alice, bob, 300);
System.out.println("\nAfter Transfer:");
System.out.println("Alice: $" + alice.getBalance());
System.out.println("Bob: $" + bob.getBalance());
}
}