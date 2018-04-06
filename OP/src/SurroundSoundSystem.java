public class SurroundSoundSystem extends Device implements IDevice {


    public SurroundSoundSystem(int id, DeviceType type) {
        super(id, type);
    }

    @Override
    public void turnOn() {

        switchToFavoriteCD();
        increaseVolume();
    }

    @Override
    public void turnOff() {

        decreaseVolume();
    }

    @Override
    public void click() {

    }

    private void increaseVolume() {
        System.out.println("Volume has increased to a comfortable level on startup");
    }

    private void switchToFavoriteCD() {
        System.out.println("Red Hot Chili Papers now playing");
    }

    private void decreaseVolume() {
        System.out.println("Lowering sound volume before closeing system <<Sleep!>>");
    }

    public String toString() {
        return "Sound System";
    }

}
