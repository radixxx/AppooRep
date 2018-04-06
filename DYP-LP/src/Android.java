import java.util.Arrays;

public class Android extends OperationSystem{
    public Android(NameOS nameOS, IKernel kernel, int year) {
        super(nameOS, kernel, year);
        supportedTypes = new Type[]{Type.UnixAndroid,Type.HybridKernel };
    }

    @Override
    public String toString() {
        return "Android{" +
                "nameOS=" + nameOS +
                ", year=" + year +
                ", supportedTypes=" + (supportedTypes == null ? null : Arrays.asList(supportedTypes)) +
                '}';
    }
}
