class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Sonali Bank";

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("-----------------------------");
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("=============================");
    }
}

    class MainClass {
    public static void main(String[] args) {
        BankAccount.showBankName();
        BankAccount acc1 = new BankAccount("ACC123", "Abir", 5000.00);
        BankAccount acc2 = new BankAccount("ACC124", "Nitol", 7000.00);

        acc1.displayInfo();
        acc2.displayInfo();
    }
}
