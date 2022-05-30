public class Main {
    public static void main(String[] args) {

        // set the values of the constructor - best method
        Account custAccount = new Account(
                "283924342-9034",
                2000.80,
                "John Doe",
                "jdoe@jhdoe.com",
                "(333) 444-5555"
        );

        //set value for starting account
        // -----> use a constructor to set fields
//        custAccount.setNumber("283924342-9034");
//        custAccount.setBalance(2000.80);
//        custAccount.setCustomerName("John Doe");
//        custAccount.setCustomerEmailAddress("jdoe@jhdoe.com");
//        custAccount.setCustomerPhoneNumber("(333) 444-5555");


        custAccount.withdrawal(100.0);
//        make a deposit
        custAccount.deposit(150.0);
        custAccount.withdrawal(125.0);

        //print the remaining balance
        System.out.println(custAccount.getCustomerName()
                + "'s" + " Account Balance: "
                + custAccount.getBalance());

        //    new account
        Account custAccountTwo = new Account();
        System.out.println(custAccountTwo.getCustomerName());
        System.out.println(custAccountTwo.getCustomerEmailAddress());
        System.out.println(custAccountTwo.getBalance());
    }

}