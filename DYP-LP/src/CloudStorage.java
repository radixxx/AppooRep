import java.net.URL;
import java.net.URLConnection;

public class CloudStorage implements IConection {

    StorageName storagename;
    private int volume;
    private int price;


    public CloudStorage(StorageName storagename, int volume, int price) {
        this.storagename = storagename;
        this.volume = volume;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CloudStoragename " +
                       storagename +
                ", volume=" + volume + "GB" +
                ", price=" + price + "$" + "\n";
    }


    @Override
    public void getInternet() {

        try {
            URL url = new URL("http://www.google.com");

            URLConnection connection = url.openConnection();
            connection.connect();
            System.out.println("Internet Connected");
            System.out.println("Using CloudStorage");

        } catch (Exception e) {
            System.out.println("Sorry, No Internet Connection");

        }

    }


    @Override
    public void changeDataConection() {
        }
}

enum StorageName{

    Azure,
    DropBox,
    GoogleDrive

}
