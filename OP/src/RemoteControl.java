public class RemoteControl {

    private IDevice device = null;
    private static final RemoteControl instance = new RemoteControl();

    public static RemoteControl getInstance() {
        return instance;
    }

    public void connectToDevice(IDevice device) {
        this.device = device;
        System.out.println("\tConnected to : " + device);
    }

    public void clickOnButon() {
        this.device.turnOn();
    }

    public void clickOffButon() {
        this.device.turnOff();
    }
}
