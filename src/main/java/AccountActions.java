


public class AccountActions {
Account account = new Account();


    public Double getBalance() {
        return account.getBalance();
    }

    public Double withdraw(Double withdrawal)    {
        Double balance = account.getBalance();
        Double newBalance = balance - withdrawal;
        return newBalance;
    }



}





