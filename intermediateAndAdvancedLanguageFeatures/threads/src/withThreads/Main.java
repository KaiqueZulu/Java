package withThreads;



public class Main {
    public static void main(String[] args) {
    ProgessBar bar = new ProgessBar();
    Thread  threadProgressbar = new Thread(bar);
    threadProgressbar.start();

    ReportGenerator generator = new ReportGenerator();
    Thread threadReportGenerator = new Thread(generator);
    threadReportGenerator.start();
    }
}