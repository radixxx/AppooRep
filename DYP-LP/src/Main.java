import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------");
        System.out.println("DYP-LP");
        System.out.println("--------");

        Kernel K = new Kernel("Unix", 2007, 12.3, "intel", "DDR3",2000, "", "");

        K.UnixKernel();
        K.UnixAndroid();
        System.out.println(K);


        System.out.println("\n\t--=Select operating system=-");

        OperationSystem OS1 = new OperationSystem(NameOS.Ubuntu, Type.UnixKernel, 2001);
        OperationSystem OS2 = new OperationSystem(NameOS.Android, Type.UnixAndroid, 2009);
        OperationSystem OS3 = new OperationSystem(NameOS.Mint, Type.UnixKernel, 2007);

        ArrayList<OperationSystem> operationSystems = new ArrayList<>();
        operationSystems.add(OS1);
        operationSystems.add(OS2);
        operationSystems.add(OS3);



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер OS: " +
                "\nOS 0" +
                "\nOS 1" +
                "\nOS 2");

        int id = sc.nextInt();

        Type type = Type.values()[id];
        System.out.println("Выбран тип OS " + id);

        if (OS1.typeKernel == type) {
            System.out.println("Операциона система: " + OS1.nameOS + "-" + "ядро: " + OS1.typeKernel + "=> совместимы");
        } else if (OS2.typeKernel == Type.UnixAndroid)
            System.out.println("Операционаая система: " + OS2.nameOS + "-" + "ядро: " + OS2.typeKernel + "=> совместимы");
        else if (OS3.typeKernel == Type.UnixKernel)
            System.out.println("Операционаая система: " + OS3.nameOS + "-" + "ядро: " + OS3.typeKernel + "=> совместимы");

        /*Block for connection Data
         *
         * если нет интернет-подключения то автоматически подключается локальной ДБ
         *
         * */


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
