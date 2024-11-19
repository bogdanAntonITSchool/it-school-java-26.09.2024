package recap.model;

public class Account {

    private final String iban;

    // has-a relationship
    private final Client client;
    private final Transaction[] transactions = new Transaction[100];

    private int transactionCount = 0;
    private double balance; // by default, the balance is 0

    public Account(String iban, Client client) {
        this.iban = iban;
        this.client = client;
    }

    public String getIban() {
        return iban;
    }

    public Client getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void deposit(double amount) {
        // exit early if the amount is negative
        if (amount < 0) {
            System.out.println("The amount to deposit must be positive.");
            return;
        }

        Transaction transaction = Transaction.createDepositTransaction(amount);
        transactions[transactionCount++] = transaction;

        balance += amount;
    }

    public void withdraw(double amount) {
        // exit early if the amount is negative
        if (amount < 0 || amount > balance) {
            System.out.println("The amount to withdraw must be positive " +
                    "and should not exceed the balance.");
            return;
        }

        Transaction transaction = Transaction.createWithdrawTransaction(amount);
        transactions[transactionCount++] = transaction;

        balance -= amount;
    }

    public void transfer(Account toAccount, double amount, String details) {
        if (amount < 0 || amount > balance) {
            System.out.println("The amount to transfer must be positive " +
                    "and should not exceed the balance.");
            return;
        }

        Transaction transaction = Transaction.createTransferTransaction(toAccount, amount, details);
        transactions[transactionCount++] = transaction;

        balance -= amount;
    }

    public void printStatement() {
        System.out.println("--------------------");
        System.out.println("Account statement for " + iban);
        System.out.println("Client: " + client.getName());
        System.out.println("Balance: " + balance);
        System.out.println("Transactions:");
        for (int i = 0; i < transactionCount; i++) {
            Transaction transaction = transactions[i];
            System.out.println("- " + transaction.getDetails() + " (" + transaction.getAmount() + ")");
        }
    }

}
