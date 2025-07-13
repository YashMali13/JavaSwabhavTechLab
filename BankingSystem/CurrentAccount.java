package BankingSystem;
public class CurrentAccount implements AccountOperations {
    private double balance;

    public CurrentAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) throw new InvalidAmountException("Amount must be positive.");
            balance += amount;
            System.out.println(" Deposited ₹" + amount);
        } catch (InvalidAmountException e) {
            System.out.println(" No... " + e.getMessage());
        }
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount <= 0) throw new InvalidAmountException("Amount must be positive.");
            if (amount > balance) throw new InvalidAmountException("Insufficient balance.");
            balance -= amount;
            System.out.println(" Withdrawn ₹" + amount);
        } catch (InvalidAmountException e) {
            System.out.println(" NO... " + e.getMessage());
        }
    }
@Override
    public void checkBalance() {
        System.out.println("=> Current Account Balance: ₹" + balance);
    }
}
