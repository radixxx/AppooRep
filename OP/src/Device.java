public abstract class Device implements IDevice{

    int id;
    DeviceType type;

    public Device(int id, DeviceType type) {
        this.id = id;
        this.type = type;

        RemoteControl.getInstance().connectToDevice(this);
    }

    @Override
    public DeviceType getType() {
        return type;
    }

}

