public class Account {


    private String type;
    private String number;
    private Double balance;




    public Account() {

    }

    public Account(String number, String type) {
        this.number = number;
        this.type = type;
        this.balance = 0.00;
        switch (type)   {
            case "checking" :
                this.number = number + "c";
        }






        if(type.equals("Checking")) {
            this.number = number + "c";
        }
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}



