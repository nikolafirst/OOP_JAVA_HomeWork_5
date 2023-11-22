public class CreditAccount extends Account {
    private static final double COMMISSION_RATE = 0.1;

    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void take(double amount) {
        double commission = amount * COMMISSION_RATE;
        if (amount > 0 && amount + commission <= balance) {
            balance -= amount + commission;
            System.out.println("Средства успешно выведены (с комиссией " + commission + " у.е.)");
        } else {
            System.out.println("Ошибка! Некорректная сумма для списания или недостаточно средств");
        }
    }
}
