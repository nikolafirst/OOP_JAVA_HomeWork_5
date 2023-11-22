public class Bank {
    public static void main(String[] args) {
        Account testObjectAccount = new Account(10000);
        // account.put(3500);
        testObjectAccount.take(-200);
        System.out.println("Текущий баланс: " + testObjectAccount.getAmount());

        System.out.println();

        CreditAccount creditAccount = new CreditAccount(10000);
        creditAccount.put(5000);
        creditAccount.take(2500);
        System.out.println("Текущий баланс: " + creditAccount.getAmount());

        System.out.println();

        DepositAccount depositAccount = new DepositAccount(10000);
        depositAccount.put(3600);
        // depositAccount.take(2100);
        System.out.println("Текущий баланс: " + depositAccount.getAmount());
    }
}
