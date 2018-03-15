import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {


    private HashMap<String, ArrayList<Doctor>> hm = new  HashMap<String, ArrayList<Doctor>>();
    public HashMap<String, ArrayList<Doctor>> getHm() {
        return hm;
    }

    public void addDoctor(String pain, Doctor doctor){
        if(hm.get (pain) == null){
            ArrayList<Doctor> newList = new ArrayList<Doctor>();
            newList.add(doctor);
            hm.put(pain, newList);
        } else {
            hm.get(pain).add(doctor);
        }
    }


    @Override
    public String toString() {
        String res = " ";

        for (String illness: hm.keySet()) {
            ArrayList<Doctor> doctors = hm.get(illness);
            res += illness + '\n';
            for (Doctor d : doctors) {
                res += "\t" + d;
            }
            res += '\n';
        }

        return res;
    }

}
