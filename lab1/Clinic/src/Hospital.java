import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;

public class Hospital {
    private HashMap<String, ArrayList<Doctor>> hm = new  HashMap<String, ArrayList<Doctor>>();

    public void addDoctor(String pain, Doctor doctor){
        if(hm.get (pain) == null){
            ArrayList<Doctor> newList = new ArrayList<Doctor>();
            newList.add(doctor);
            hm.put(pain, newList);
        } else {
            hm.get(pain).add(doctor);
        }
    }

    public Doctor getDoctorForIllness(String illness) {
        ArrayList<Doctor> doctors = hm.get(illness);
        if (doctors == null) {
            return null;
        } else{
            Random rnd = new Random(System.currentTimeMillis());
            int index = Math.abs(rnd.nextInt() % doctors.size());
            return doctors.get(index);
        }
    }

    @Override
    public String toString() {
        String res = "";

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
