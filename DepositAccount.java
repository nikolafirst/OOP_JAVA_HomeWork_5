import java.time.LocalDate;
public class DepositAccount extends Account {
    private LocalDate lastWithdrawalDate;

    public DepositAccount(double initialBalance) {
        super(initialBalance);
        this.lastWithdrawalDate = LocalDate.now().minusMonths(1);
    }

    @Override
    public void take(double amount) {
        if (amount > 0 && amount <= balance && LocalDate.now().isAfter(lastWithdrawalDate.plusMonths(1))) {
            balance -= amount;
            lastWithdrawalDate = LocalDate.now();
            System.out.println("Средства успешно выведены");
        } else {
            System.out.println("Ошибка! Некорректная сумма для списания или недостаточно средств или снятие не возможно в настоящий момент");
        }
    }
}
