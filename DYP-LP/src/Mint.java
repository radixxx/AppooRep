import java.util.Arrays;

public class Mint extends OperationSystem {
    public Mint(NameOS nameOS, IKernel kernel, int year) {
        super(nameOS, kernel, year);
        supportedTypes = new Type[]{Type.UnixKernel,Type.HybridKernel };
    }

    @Override
    public String toString() {
        return "Mint{" +
                "nameOS=" + nameOS +
                ", year=" + year +
                ", supportedTypes=" + (supportedTypes == null ? null : Arrays.asList(supportedTypes)) +
                '}';
    }
}
