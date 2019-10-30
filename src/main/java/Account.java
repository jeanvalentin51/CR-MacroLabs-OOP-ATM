public class Account {


    private String type;
    private Integer number;
    private Double balance;




    public Account() {
        this.number = generateAccountNumer();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer generateAccountNumer() {
        Integer max = 99999;
        Integer min = 10000;
        Integer range = max - min + 1;

        return (int)(Math.random() * range) + min;
    }
}



