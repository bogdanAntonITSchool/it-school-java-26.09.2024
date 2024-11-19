package recap.model;

public class Transaction {

    private final Account toAccount;
    private final double amount;
    private final String details;

    private Transaction(Account toAccount, double amount, String details) {
        this.toAccount = toAccount;
        this.amount = amount;
        this.details = details;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDetails() {
        return details;
    }

    public static Transaction createPosTransaction(Account toAccount, double amount) {
        return new Transaction(toAccount, amount, "POS transaction to " + toAccount.getIban());
    }

    public static Transaction createTransferTransaction(Account toAccount, double amount, String details) {
        return new Transaction(toAccount, amount, details);
    }

    public static Transaction createWithdrawTransaction(double amount) {
        return new Transaction(null, amount, "Withdraw of " + amount + ".");
    }

    public static Transaction createDepositTransaction(double amount) {
        // hardcoded value for the toAccount parameter
        return new Transaction(null, amount, "Deposit of " + amount + ".");
    }

}
