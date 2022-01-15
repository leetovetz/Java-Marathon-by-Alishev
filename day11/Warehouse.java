package day11;

public class Warehouse {
    private int balance;
    private int countOrders;

    @Override
    public String toString() {
        return "Warehouse {" +
                "balance = " + balance +
                ", countOrders = " + countOrders +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrders) {
        this.countOrders = countOrders;
    }
}
