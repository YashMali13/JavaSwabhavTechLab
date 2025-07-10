package BankingSystem;
public class LoanAccount implements AccountOperations {
    private double loanAmount;

    public LoanAccount(double initialLoan) {
        this.loanAmount = initialLoan;
    }

    public void deposit(double amount) {
        System.out.println(" Deposit not allowed in Loan Account.");
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) throw new InvalidAmountException("Amount must be positive.");
            loanAmount += amount;
            System.out.println(" Loan taken of ₹" + amount);
        } catch (InvalidAmountException e) {
            System.out.println(" No... " + e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("=> Loan Outstanding: ₹" + loanAmount);
    }
}

