package threadsSynchronized;

public class MakeDeposit implements Runnable{
    private Account account;

    public MakeDeposit(Account account){
        this.account = account;
    }

    @Override
    public String toString() {
        return "Make Deposit : {" +
                "account=" + account +
                '}';
    }

    @Override
    public void run(){
        this.account.cashDeposit(100.0f);
    }

}
