import java.util.HashMap;
import java.util.Map;

public class RemoteControl {

    private Map<DeviceType, IDevice> devices = new HashMap();
    private static final RemoteControl instance = new RemoteControl();

    public static RemoteControl getInstance() {
        return instance;
    }

    public void connectToDevice(IDevice device) {
        this.devices.put(device.getType(), device);
        System.out.println("\tConnected to : " + device);
    }

    public void clickOnButon(DeviceType type) {
        this.devices.get(type).turnOn();
    }

    public void clickOffButon(DeviceType type) {
        this.devices.get(type).turnOff();

    }

}
