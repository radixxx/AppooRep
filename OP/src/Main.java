public class Main {
    
    public static void main (String args[]){

        RemoteControl remoteControl = RemoteControl.getInstance();

        TV tv = new TV(1,DeviceType.TV);
        remoteControl.connectToDevice(tv);
        tv.turnOn();
        tv.turnOff();

        Projector pr = new Projector(2,DeviceType.Projector);
        remoteControl.connectToDevice(pr);
        pr.turnOn();
        pr.turnOff();

        SurroundSoundSystem srs = new SurroundSoundSystem(3,DeviceType.SurroundSoundSystem);
        remoteControl.connectToDevice(srs);
        srs.turnOn();
        srs.turnOff();
        
    }

}
