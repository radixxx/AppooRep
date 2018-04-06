public class UnsuportedKernelExeption extends Exception {

    public UnsuportedKernelExeption(IKernel kernel, String supportedTypes) {
        super("Kernel " + kernel.getKernelType() + " is not supported. Supported types are: " + supportedTypes);
    }
}
