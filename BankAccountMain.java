public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
//        obj.deposit_funds(1000d);
        obj.withdraw_funds(24456);

        System.out.println(obj.getAccount_balance());
    }
}
