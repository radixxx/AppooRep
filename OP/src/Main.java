
public class Main {
    
    public static void main (String args[]){

        System.out.println("--------------------");
        System.out.println("Open/Close Principal");
        System.out.println("--------------------");

        RemoteControl remoteControl = RemoteControl.getInstance();

        TV tv = new TV(1,DeviceType.TV);


        Projector pr = new Projector(2,DeviceType.Projector);


        SurroundSoundSystem srs = new SurroundSoundSystem(3,DeviceType.SurroundSoundSystem);


        PlayStation pl = new PlayStation(4,DeviceType.PlayStaion);


        remoteControl.clickOffButon(DeviceType.TV);
        remoteControl.clickOnButon(DeviceType.SurroundSoundSystem);
    }

}
