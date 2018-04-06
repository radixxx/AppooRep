public class TV extends Device implements IDevice {

    public TV(int id, DeviceType type) {
        super(id, type);
    }

    @Override
    public void turnOn() {
        SwitchToFavoriteChannel();
    }

    @Override
    public void turnOff() {
        turnOnTVAlarm();
    }

    @Override
    public void click() {

    }


    private void SwitchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

    private void turnOnTVAlarm() {
        System.out.println("TV Alarm set! Hike at 6:00 AM");
    }

    public String toString() {
        return "Television";
    }

}
