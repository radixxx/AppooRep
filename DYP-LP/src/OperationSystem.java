public class OperationSystem  {

    NameOS nameOS;
    Type typeKernel;
    int year;

    public OperationSystem(NameOS nameOS, Type typeKernel, int year) {
        this.nameOS = nameOS;
        this.typeKernel = typeKernel;
        this.year = year;
    }

    @Override
    public String toString() {
        return "OperationSystem: " + nameOS + " typeKernel=> " + typeKernel + " year: " + year;
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
    Windows

}
