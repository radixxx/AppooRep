import java.net.URL;
import java.net.URLConnection;

public class DataBase implements IConection {

    NameDB name;
    TypeDB type;
    boolean dataAvilable;

    public DataBase(NameDB name, TypeDB type, boolean conection) {
        this.name = name;
        this.type = type;
        this.dataAvilable = conection;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "name=" + name +
                ", type=" + type +
                ", dataAvilable=" + dataAvilable +
                '}';
    }


    @Override
    public void getInternet() {

    }

    @Override
    public void changeDataConection() {

        try {
            URL url = new URL("http://www.google.com");

            URLConnection connection = url.openConnection();
            connection.connect();


        } catch (Exception e) {
            System.out.println("Sorry, No Internet Connection");
            System.out.println("Using local Database: ");

        }

        //if(CS1.getInternet(false))
        //  System.out.println("Change data storage connection to DataBase:" + dataBases);
    }
}

enum NameDB {

    MySQL,
    Mongo,
    MsSQL,
    Cassandra

}

enum TypeDB {
    NoSql,
    Sql

}
