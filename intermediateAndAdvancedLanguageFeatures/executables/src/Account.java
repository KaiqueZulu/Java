public class Account {
    int number;

    // Encapsulation example - PRIVATE;
    private float balance, limit;

    Client client;

    public Account(int number, float balance, float limit, Client client) {
        this.number = number;
        this.balance = balance;
        this.limit = limit;
        this.client = client;
    }

    public float getBalance() {
        return balance + limit;
    }

    void withdrawMoney(float value) {
        if (value <= this.balance) {
            this.balance = this.balance - value;
        } else if (value <= (this.balance + this.limit)) {
            float difference = this.balance - value;
            if (difference < 0)
                this.balance = 0;
            difference = this.limit + difference;
            this.limit = difference;
        } else {
            System.out.println("Insufficient funds");
        }
        System.out.println("Withdrawal made");
    }

    void cashDeposit(float value) {
        this.balance = this.balance + value;
        System.out.println("Deposit made");
    }
}
