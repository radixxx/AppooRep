public class Kernel implements IKernel {

    private String naming;
    private int year;
    private double version;
    private String cpu;
    private String ram;
    private int speed;
    private Type kernelType;

    public Kernel(String naming, int year, double version, String cpu, String ram,
                  int speed, Type kernelType) {
        this.naming = naming;
        this.year = year;
        this.version = version;
        this.cpu = cpu;
        this.ram = ram;
        this.speed = speed;
        this.kernelType = kernelType;
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
                ", type" + kernelType + '\'';
    }

    @Override
    public String compatibility() {
        System.out.println("Compatible with " + kernelType.name());
        return null;
    }

    @Override
    public Type getKernelType() {
        return kernelType;
    }
}
