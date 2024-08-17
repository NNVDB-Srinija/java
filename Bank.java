import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(" Deposited " + amount + " successfully.\n New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.\n Withdrawal unsuccessful.");
            return;
        }
        balance -= amount;
        System.out.println(" Withdrawn " + amount + " successfully. \n New balance is " + balance);
    }

    public void calculateInterest() {
        double interest = balance * ((this instanceof SavingAccount) ? 0.03 : 0.07);
        balance += interest;
        System.out.println(" Interest calculated successfully. \n New balance is " + balance);
    }
}

class SavingAccount extends BankAccount {
    public SavingAccount(double balance) {
        super(balance);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        BankAccount account;
        System.out.println("Enter account type \'Savings [s]\' or \'Current [c]\': ");
        char accountType = sc.next().charAt(0);
        if (accountType == 's') {
            account = new SavingAccount(balance);
        } else if (accountType == 'c') {
            account = new CurrentAccount(balance);
        } else {
            System.out.println("Invalid account type. Exiting program.");
            return;
        }
        int ch;
        do {
            System.out.println("\nEnter choice:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Calculate interest");
            System.out.println("0. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance is " + account.getBalance());
                    break;
                case 4:
                    account.calculateInterest();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (ch != 0);
    }
}
