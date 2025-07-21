public class Task6 {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("123ABC");
        acc.setBalance(500.75);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accNum) {
        accountNumber = accNum;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getBalance() {
        return balance;
    }
}
