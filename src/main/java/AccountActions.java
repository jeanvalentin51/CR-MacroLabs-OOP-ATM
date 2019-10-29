


public class AccountActions {

    Account account = new Account();

    private double withdrawalAmount;
    private double depositAmount;
    private double balance;

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
        if (withdrawalAmount > balance) {
            System.out.println("Withdrawal request cannot be processed due to insufficent funds. Please request an amount less than your current balance.");
        }  if (withdrawalAmount < 0) {
            System.out.println("Please enter an amount greater than $0.00");
        }
            return balance - withdrawalAmount;
    }



    public double deposit(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Please enter an amount greater than $0.00");
        }
        return balance + depositAmount;
    }
}





