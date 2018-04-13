public class PlayStation extends Device implements IDevice {

    public PlayStation(int id, DeviceType type) {
        super(id, type);
    }


    public void SelectPlayGames(){
        System.out.println("Selected GTA 4");
    }

    public void HelloGamer(){
        System.out.println("Hi player, Let's play!");
    }

    public void StopGame(){
        System.out.println("You need to do homework!");

    }

    @Override
    public void turnOn() {
        HelloGamer();
    }

    @Override
    public void turnOff() {
        StopGame();
    }

    @Override
    public void click() {
        SelectPlayGames();
    }

    @Override
    public String toString() {
        return "PlayStation";
    }
}
