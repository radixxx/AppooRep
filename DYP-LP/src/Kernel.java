public class Kernel implements IModulesUnix,IModulesAndroid {

    private String naming;
    private int year;
    private double version;
    private String cpu;
    private String ram;
    private int speed;
    private String UnixKernel;
    private String UnixAndroid;


    public Kernel(String naming, int year, double version, String cpu, String ram,
                  int speed, String unixKernel,String unixAndroid) {
        this.naming = naming;
        this.year = year;
        this.version = version;
        this.cpu = cpu;
        this.ram = ram;
        this.speed = speed;
        UnixKernel = unixKernel;
        UnixAndroid = unixAndroid;
    }


    @Override
    public String toString() {
        return "Kernel " +
                "naming='" + naming + '\'' +
                ", year=" + year +
                ", version=" + version +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", speed=" + speed +
                ", UnixKernel" + UnixKernel + '\'' +
                ", UnixAndroid" + UnixAndroid + '\'';
    }

    @Override
    public String UnixKernel() {
        System.out.println("Compatible with + UnixKernel" + UnixKernel);
        return UnixKernel;
    }

    @Override
    public String UnixAndroid() {
        System.out.println("Compatible with + UnixAndroid" + UnixAndroid);
        return  UnixAndroid;
    }

}
