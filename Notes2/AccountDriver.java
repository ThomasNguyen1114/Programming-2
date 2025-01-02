public class AccountDriver {
    public static void main(String[] args) {
        Account account1 = new Account("111", "Tom", 23.0);

        account1.deposit(10);
        account1.withdraw(23);

        account1.displayAccountInfo();
    }
}
