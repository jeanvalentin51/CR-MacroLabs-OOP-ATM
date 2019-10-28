public class Account {


    private String type;
    private String number;
    private Integer Balance;


    public Account(String type, String number, Integer balance) {
        this.type = type;
        this.number = number;
        Balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getBalance() {
        return Balance;
    }

    public void setBalance(Integer balance) {
        Balance = balance;
    }
}
