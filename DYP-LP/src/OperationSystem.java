public abstract class OperationSystem  {

    private IKernel kernel;
    NameOS nameOS;
    int year;
    protected Type[] supportedTypes;

    public OperationSystem(NameOS nameOS, IKernel kernel, int year) {

            this.nameOS = nameOS;
            this.kernel = kernel;
            this.year = year;
    }



    @Override
    public String toString() {
        return "OperationSystem: " + nameOS + " typeKernel=> " + kernel.getKernelType() + " year: " + year;
    }
}

enum Type {

    UnixKernel,
    UnixAndroid,
    HybridKernel

}

enum NameOS {

    Ubuntu,
    Mint,
    Android,

}
