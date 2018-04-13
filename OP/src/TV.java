public class TV extends Device implements IDevice{

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
        TurnOnHdmiPort();
    }


    private void SwitchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

    private void turnOnTVAlarm() {
        System.out.println("TV Alarm set! Hike at 6:00 AM");
    }

    private void TurnOnHdmiPort() {
        System.out.println("Turned the HDMI port");
    }


    private void Turn4kMode(){
        System.out.println("Turned 4K Mode");
    }


    public String toString() {
        return "Television";
    }


}
