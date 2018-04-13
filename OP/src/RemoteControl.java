
public class RemoteControl implements IDevice {

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

    public void clickHdmiOn(){
        this.device.click();
    }

    public void ClickSelectResolution(){
        this.device.click();
    }

    public void switchToFavoriteCD(){
        this.device.click();
    }

    public void  SelectPlayGames(){
        this.device.click();

    }


    @Override
    public void click() {

    }

    @Override
    public void turnOn() {


    }

    @Override
    public void turnOff() {

    }



}
