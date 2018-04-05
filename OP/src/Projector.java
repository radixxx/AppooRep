public class Projector implements IDevice {

    @Override
    public void turnOn() {
        pullUpProjectorScreen();
    }

    @Override
    public void turnOff() {
        pullDownProjectorScreen();
    }

    // below are additional steps that may be required for you to operate your device
    private void pullDownProjectorScreen(){
        System.out.println("Screen has been lowered for viewing");
    }

    private void pullUpProjectorScreen(){
        System.out.println("Screen raised back up to close");
    }

    public String toString(){
        return "Projector";
    }

}
