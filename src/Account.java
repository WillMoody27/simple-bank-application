public class Account {
    //fields
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

//    // custom constructor
//    public Account() {
//        System.out.println("Empty Constructor");
//    }
    // constructor for default values - special case
    public Account(){
        this(
                "34535",
                2.50,
                "Default Name",
                "Default Email",
                "Default Phone"
        );
        System.out.println("Empty constructor called w/defaults");
    }
    // set field values in constructor
    public Account(String number, double balance, String customerName,
                   String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("Account Constructor w/Parameters Called");
        // allows us to set and save fields values - point where
        // object is being created
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //methods - setters

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // methods - to be called in main
    public void deposit(double depositAmount) {
        this.balance += depositAmount; // add to balance
        System.out.println("Deposit of " + depositAmount +
                " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        // check fund avail - check if negative
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds - Current Balance: "
                    + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of: "
                    + withdrawalAmount + " processed. Remaining balance: "
                    + this.balance);
        }
    }
}


