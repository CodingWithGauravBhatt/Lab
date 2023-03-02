package Today2Mar;

class Customer1 {
    private int accountNumber;
    private String accountName;
    private double accountBalance;

    // constructor
    public Customer1 (int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    // method to create account
    public void createAccount(int accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    // method to set amount
    public void setAmount(double amount) {
        this.accountBalance += amount;
    }

    // method to get amount and print account details
    public void getAmount() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Balance: " + accountBalance);
    }

    // method to withdraw amount
    public void withDrawAmount(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient Balance!");
        } else {
            this.accountBalance -= amount;
        }
    }
}

public class customer {
    public static void main(String[] args) {
        // create two customers
        Customer1 customer11 = new Customer1(101, "John", 5000);
        Customer1 customer21 = new Customer1(102, "Jane", 7000);

        // set amount for customer1
        customer11.setAmount(2000);

        // withdraw amount for customer2
        customer21.withDrawAmount(3000);

        // display customer details
        customer11.getAmount();
        customer21.getAmount();
    }
}
