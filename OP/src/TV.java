public class TV implements IDevice {

    @Override
    public void turnOn() {
        SwitchToFavoriteChannel();
    }

    @Override
    public void turnOff() {
        turnOnTVAlarm();
    }

    // below are additional steps that may be required for you to operate your
    // device
    private void SwitchToFavoriteChannel() {
        System.out.println("Switched to your favorite Channel");
    }

    private void turnOnTVAlarm() {
        System.out.println("TV Alarm set for you to wake up in the morning");
    }

    public String toString() {
        return "Television";
    }
}
