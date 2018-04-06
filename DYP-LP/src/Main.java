import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------");
        System.out.println("DYP-LP");
        System.out.println("--------");

        IKernel hybrid = new Kernel("Unix", 2007, 12.3, "intel", "DDR3",2000, Type.HybridKernel);
        System.out.println(hybrid);


        System.out.println("\n\t--=Select operating system=-");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select number OS: " +
                "\nOS 0 Ubuntu" +
                "\nOS 1 Mint " +
                "\nOS 2 Android");

        int id = sc.nextInt();
        System.out.println("Insert year of OS: ");

        int year = sc.nextInt();
        NameOS type = NameOS.values()[id];
        OperationSystem OS = null;
        try {
            OS = KernelFabric.getOSForType(type,hybrid,year);
        } catch (UnsuportedKernelExeption unsuportedKernelExeption) {
          System.out.println("No Supported kernel");
        }


        System.out.println("Selected OS " + id);
        System.out.println("OS: " + OS);



        CloudStorage CS1 = new CloudStorage(StorageName.Azure, 2000, 100);
        CloudStorage CS2 = new CloudStorage(StorageName.DropBox, 4000, 150);

        //нужно сделать применение для всей коллекции
        CS1.getInternet();

        ArrayList<CloudStorage> cloudStorage = new ArrayList<>();
        cloudStorage.add(CS1);
        cloudStorage.add(CS2);

        System.out.printf("В списке %d элементов \n", cloudStorage.size());
        System.out.println("\t"+ cloudStorage +"\n");
        for(CloudStorage cloudStorage1 : cloudStorage){}


        DataBase DB1 = new DataBase(NameDB.MySQL, TypeDB.Sql, true);
        //DataBase DB2 = new DataBase(NameDB.Mongo, TypeDB.NoSql, true);
        DB1.changeDataConection();

        ArrayList<DataBase> dataBases = new ArrayList<>();
        dataBases.add(DB1);
        //dataBases.add(DB2);

        System.out.printf("В списке %d элементов \n", dataBases.size());
        System.out.println(dataBases);
        for(DataBase dataBases1 : dataBases){}


    }

}
