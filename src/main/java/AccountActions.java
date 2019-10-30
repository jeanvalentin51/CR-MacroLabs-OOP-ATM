


public class AccountActions {



    public Double getBalance(Account account) {
        return account.getBalance();
    }

    public Double withdraw(Account account, Double withdrawal)    {
        Double balance = account.getBalance();
        Double newBalance = balance - withdrawal;
        return newBalance;
    }

    public Double deposit(Account account, Double deposit)  {
        Double balance = account.getBalance();
        Double newBalance = balance + deposit;
        return newBalance;
    }

    public Double checkCurrentBalance(Account account)  {
        return account.getBalance();
    }





}





