
public class Main {
    
    public static void main (String args[]){

        System.out.println("--------------------");
        System.out.println("Open/Close Principal");
        System.out.println("--------------------");

        RemoteControl remoteControl = RemoteControl.getInstance();

        TV tv = new TV(1,DeviceType.TV);
        remoteControl.connectToDevice(tv);

        remoteControl.clickOnButon();
        remoteControl.clickOffButon();
        remoteControl.clickHdmiOn();


        Projector pr = new Projector(2,DeviceType.Projector);
        remoteControl.connectToDevice(pr);

        remoteControl.clickOnButon();
        remoteControl.clickOffButon();
        remoteControl.ClickSelectResolution();


        SurroundSoundSystem srs = new SurroundSoundSystem(3,DeviceType.SurroundSoundSystem);
        remoteControl.connectToDevice(srs);

        remoteControl.clickOnButon();
        remoteControl.clickOffButon();
        remoteControl.switchToFavoriteCD();

        PlayStation pl = new PlayStation(4,DeviceType.PlayStaion);
        remoteControl.connectToDevice(pl);

        remoteControl.clickOnButon();
        remoteControl.clickOffButon();
        remoteControl.SelectPlayGames();

        //pl.HelloGamer();


    }

}
