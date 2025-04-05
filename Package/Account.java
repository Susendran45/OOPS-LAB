package banking;
public class Account {
private String accountNumber;
private double balance;
public Account(String accountNumber, double initialBalance) {
this.accountNumber = accountNumber;
this.balance = initialBalance;
}
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
}
}
public boolean withdraw(double amount) {
if (amount > 0 && balance >= amount) {
balance -= amount;
return true;
}
return false;
}
public double getBalance() {
return balance;
}
public String getAccountNumber() {
return accountNumber;
}
}