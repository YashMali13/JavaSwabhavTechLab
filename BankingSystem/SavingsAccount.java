package BankingSystem;
public class SavingsAccount implements AccountOperations {
    private double balance;
    private final double withdrawalLimit = 5000;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        try {
            if (amount <= 0) throw new InvalidAmountException("Amount must be positive.");
            balance += amount;
            System.out.println(" Deposited ₹" + amount);
        } catch (InvalidAmountException e) {
            System.out.println(" NO... " + e.getMessage());
        }
    }
    public void withdraw(double amount) {
        try {
            if (amount <= 0) throw new InvalidAmountException("Amount must be positive.");
            if (amount > withdrawalLimit) throw new InvalidAmountException("Exceeds withdrawal limit ₹5000.");
            if (amount > balance) throw new InvalidAmountException("Insufficient balance.");
            balance -= amount;
            System.out.println(" Withdrawn ₹" + amount);
        } catch (InvalidAmountException e) {
            System.out.println(" No... " + e.getMessage());
        }
    }
public void checkBalance() {
        System.out.println("=> Savings Account Balance: ₹" + balance);
    }
}
