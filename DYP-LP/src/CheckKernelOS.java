import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CheckKernelOS {

    Scanner sc = new Scanner(System.in);
    private HashMap<String, ArrayList<OperationSystem>> hm = new HashMap<String, ArrayList<OperationSystem>>();


/*
    public void addOS(Kernel kernel,String UnixKernel,String UnixAndroid, HashMap OperationSystem ){

        if(Type.UnixKernel == HashMap){
            System.out.println("Yes");

        }

    }
*/

    public void addOs1(String Kernel,OperationSystem operationSystem ){
        if(hm.get (Kernel) == null){
            ArrayList<OperationSystem> newList = new ArrayList<OperationSystem>();
            newList.add(operationSystem);
            hm.put(Kernel, newList);
        } else {
            hm.get(Kernel).add(operationSystem);
        }
    }

   /* public String getOsForKernel(Kernel) {
        ArrayList<OperationSystem> operationSystem = hm.get(Kernel);
        if (operationSystem == null) {
            return null;
        } else return operationSystem.get(Kernel);
    }*/

 }
