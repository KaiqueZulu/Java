public class App {
    public static void main(String[] args) throws Exception {
        Fan fan = new Fan();

        fan.off(); //Must not print anything

        fan.on();

        fan.off();
    }
}
