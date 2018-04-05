public class Projector extends Device implements IDevice {

    public Projector(int id, DeviceType type) {
        super(id, type);
    }

    @Override
    public void turnOn() {
        pullUpProjectorScreen();
    }

    @Override
    public void turnOff() {
        pullDownProjectorScreen();
    }

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
