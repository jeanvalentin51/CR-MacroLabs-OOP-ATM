import java.util.ArrayList;
import java.util.Arrays;

public class Account {
    private String type;
    private String number;
    private Integer balance;



    public Account(String type, String number, Integer balance) {
        this.type = type;
        this.number = number;
        this.balance = balance;

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
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
