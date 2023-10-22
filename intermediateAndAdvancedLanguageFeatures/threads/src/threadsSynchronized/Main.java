package threadsSynchronized;

import withThreads.ProgessBar;
import withThreads.ReportGenerator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Client client = new Client(24, "Kaique", "Rua Sorano, 142");
        Account accountClient = new Account(1, 200, 300, client);

        MakeDeposit action = new MakeDeposit(accountClient);
        Thread threadOne = new Thread(action);
        Thread threadTwo = new Thread(action);

        threadOne.start();
        threadTwo.start();

        /* Synced - Adds threads to a single function for synchronization
        It blocks one thread until completion to let the other work */
        threadOne.join();
        threadTwo.join();

        System.out.println(accountClient);

}
}
