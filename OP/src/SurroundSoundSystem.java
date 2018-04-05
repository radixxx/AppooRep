public class SurroundSoundSystem implements IDevice {


    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        switchToFavoriteCD();
        increaseVolume();
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        lowerVolume();
    }

    // below are additional steps that are specific to the device
    private void increaseVolume() {
        System.out.println("Volume has increased to a comfortable level on startup");
    }

    private void switchToFavoriteCD() {
        System.out.println("Red Hot Chili Papers now playing");
    }

    private void lowerVolume() {
        System.out.println("Lowering surround sound volume before closeing system");
    }

    public String toString() {
        return "Sound System";
    }

}
