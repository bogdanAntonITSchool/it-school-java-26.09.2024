package recap;

import recap.model.Account;
import recap.model.Client;
import recap.model.CompanyClient;
import recap.model.IndividualClient;

/**
 * We would like to develop a banking system that works with both individuals and companies.
 * The system should be able to perform the following operations:
 * - create an account
 * - deposit money
 * - withdraw money
 * - transfer money
 * - print the account balance
 * - print the account statement
 * <p>
 * The models involved in the system are:
 * - Account
 * - Client (Individual, Company)
 * - Transaction
 */
public class Main {

    public static void main(String[] args) {
        // create clients
        Client individualClient = new IndividualClient("John Doe", "Bucharest",
                "john@doe.com", "1234567890123");
        Client companyClient = new CompanyClient("ACME", "New York",
                "acme@newyork.com", "12345678");

        // print the client details
        individualClient.printClientDetails();
        companyClient.printClientDetails();

        // create accounts
        Account individualAccount = new Account("RO01BANK1234567890123", individualClient);
        Account companyAccount = new Account("RO02BANK12345678", companyClient);

        // deposit money
        individualAccount.deposit(1000);
        companyAccount.deposit(2000);

        // withdraw money
        individualAccount.withdraw(500);
        companyAccount.withdraw(1000);

        // transfer money
        individualAccount.transfer(companyAccount, 200, "Payment for services");
        companyAccount.transfer(individualAccount, 300, "Refund for services");

        // print the statement for each account
        individualAccount.printStatement();
        companyAccount.printStatement();
    }

}
