package gr.aueb.cf.ch13;

/**
 * Defines a {@link Account} class.
 */

public class Account {

    private int id;
    private String iban;
    private String ssn;
    private String lastname;
    private String firstname;
    private double balance;

    public Account() {

    }

    public Account(int id, String iban, String ssn,
                   String lastname, String firstname, double balance) {
        this.id = id;
        this.iban = iban;
        this.ssn = ssn;
        this.lastname = lastname;
        this.firstname = firstname;
        this.balance = balance;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    /*
    Public API
     */

    /**
     * Deposits a certain amount of money.
     * @param amount the amount of money to be deposited.
     * @throws Exception if the amount is negative.
     */

    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("The amount must not be negative");
            }
            balance += amount;
            System.out.println("Amount: " + amount + " successfully deposited.");
        } catch (Exception e) {
            System.err.println("Error. Amount " + amount + " can not be negative.");
            throw e;
        }
    }

    /**
     * Withdraws an amount from the {@link Account}
     * based on a valid ssn checked by {@link Account#isSsnValid(String)}
     * @param amount the amount to be withdrawn
     * @param ssn the given ssn
     * @throws Exception if the ssn is not valid or the balance is not
     *                  sufficient or the amount is negative.
     */

    public void withdraw(double amount, String ssn) throws Exception{
        try {
            if(!isSsnValid(ssn)) {
                throw new Exception("Ssn " + ssn + " is not valid.");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance " + balance + " for amount " + amount);
            }

            if (amount < 0) {
                throw new Exception("The amount " + amount + " must not be negative");
            }
            balance -= amount;
            System.out.println("Amount " + amount + " successfully withdrawn.");
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }

    public double getAccountBalance() {
        System.out.println("The amount balance was returned"); //logging
        return getBalance();
    }

    /**
     * Returns a string representation of the {@link Account} state.
     * @return the string-based format of the state of the {@link Account}.
     */
    public String accountToString() {
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ", " + balance + ")";
    }

    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
