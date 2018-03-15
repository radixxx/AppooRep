import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class FamilyDoc implements illness {


    public void setHospitalData(Hospital hospitalData) {
        this.hm = hospitalData.getHm();//получаем данные из hospital
    }

    private HashMap<String, ArrayList<Doctor>> hm;

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
    public String Illness(String s) {
        ArrayList<Doctor> doctors = hm.get(s);
        if (doctors == null) {
            return null;
        } else{
            Random rnd = new Random(System.currentTimeMillis());
            int index = Math.abs(rnd.nextInt() % doctors.size());
            return "Обратитесь к:  " + doctors.get(index).toString();//возращаем данные доктора
        }
    }
}
