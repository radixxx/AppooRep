import java.util.HashMap;

public class KernelFabric {

    private static HashMap<NameOS, Type[]> gethm ()
    {
        if(hm == null){
            hm = new HashMap<NameOS, Type[]>();
            hm.put(NameOS.Ubuntu,new Type[]{Type.UnixKernel,Type.HybridKernel });
            hm.put(NameOS.Mint,new Type[]{Type.UnixKernel,Type.HybridKernel });
            hm.put(NameOS.Android,new Type[]{Type.UnixAndroid,Type.HybridKernel });
        }
        return hm;

    }

    private static  boolean suportsKernel (IKernel kernel,NameOS nameOS){
        for (Type type : gethm().get(nameOS)){
            if(kernel.getKernelType() == type)
                return true;
        }
        return false;

    }

    public static OperationSystem getOSForType(NameOS nameOS, IKernel kernel, int year) throws UnsuportedKernelExeption {
        if(!suportsKernel(kernel,nameOS)){
            String s = "";
            for (Type type: gethm().get(nameOS)) {
                s = s + type.name() + " ";
            } throw new UnsuportedKernelExeption(kernel, s);

        }

        switch (nameOS) {
            case Mint:
                return new Mint(NameOS.Mint, kernel, year);
            case Ubuntu:
                return new Ubuntu(NameOS.Ubuntu, kernel, year);
            case Android:
                return new Android(NameOS.Android, kernel, year);
            default:
                return null;
        }

    }

    public static HashMap<NameOS, Type[]> hm;


 }
