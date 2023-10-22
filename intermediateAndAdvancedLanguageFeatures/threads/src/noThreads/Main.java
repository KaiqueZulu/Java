package noThreads;

public class Main {
    public static void main(String[] args) {
    ProgessBar bar = new ProgessBar();
    bar.execute();

    ReportGenerator generator = new ReportGenerator();
    generator.execute();
    }
}