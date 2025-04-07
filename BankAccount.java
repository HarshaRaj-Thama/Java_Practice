public class BankAccount {
    private long account_number = 12343232;
    private double account_balance = 23456;
    private String name = "Harsha";
    private String email = "harsharaj2001@gmail.com";
    private long phone_number = 945-265-8335;
    // getter methods
    public long getAccount_number(){
        return account_number;
    }
    public double getAccount_balance(){
        return account_balance;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public long getPhone_number(){
        return phone_number;
    }

    //Setter Methods

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }
    public void deposit_funds(Double deposit){

        this.account_balance += deposit;
        System.out.println("Account Balance is "+ account_balance);

    }

    public void withdraw_funds(double withdraw){
        if((account_balance - withdraw) < 0){
            System.out.println("Insufficient Funds");
        }
        else {
            account_balance -= withdraw;
            System.out.println("Account Balance is "+ account_balance);
        }
    }




}
