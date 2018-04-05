public class Main {
    
    public static void main (String args[]){

        RemoteControl remoteControl = RemoteControl.getInstance();

        TV tv = new TV();
        remoteControl.connectToDevice(tv);
        tv.turnOn();
        tv.turnOff();

        Projector PR = new Projector();
        remoteControl.connectToDevice(PR);
        PR.turnOn();
        PR.turnOff();

        SurroundSoundSystem SRS = new SurroundSoundSystem();
        remoteControl.connectToDevice(SRS);
        SRS.turnOn();
        SRS.turnOff();


    }

}
