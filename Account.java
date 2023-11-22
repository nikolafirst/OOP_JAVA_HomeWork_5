public class Account {
    protected double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен на " + amount + " у.е.");
        } else {
            System.out.println("Ошибка! Некорректная сумма для пополнения");
        }
    }

    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Средства успешно выведены");
        } else {
            System.out.println("Ошибка! Некорректная сумма для списания или недостаточно средств");
        }
    }

    public double getAmount() {
        return balance;
    }
}
