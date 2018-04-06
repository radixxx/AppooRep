import java.util.Arrays;

public class Ubuntu extends OperationSystem {
    public Ubuntu(NameOS nameOS, IKernel kernel, int year) {
        super(nameOS, kernel, year);
        supportedTypes = new Type[]{Type.UnixKernel,Type.HybridKernel };
    }

    @Override
    public String toString() {
        return "Ubuntu{" +
                "nameOS=" + nameOS +
                ", year=" + year +
                ", supportedTypes=" + (supportedTypes == null ? null : Arrays.asList(supportedTypes)) +
                '}';
    }
}
