public class Fan implements IElectronic {
    private boolean on = false;

    @Override
    public void on() {
        if (!this.on) {
            this.on = true;
            System.out.println("I turned on the device!");
        }
    }

    @Override
    public void off() {
        if (this.on){
            this.on = false;
            System.out.println("I turned off the device!");
        }
           
    }

}
