import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        System.out.println("-------------");
        System.out.println("OOP Practice");
        System.out.println("-------------");
        System.out.println("\t\t Welcome to Clinic -|- San Hose -|- \n");


        Hospital hospital = new Hospital();
        hospital.addDoctor("toothache",new Doctor("Feodor","Zelensky","Chisinau",45,"Dantist",10500,0) );
        hospital.addDoctor("headache",new Doctor("Dmitri","Coldun","Chisinau",34,"Psyholog",10500,3));
        hospital.addDoctor("the leg hurts",new Doctor("Oleg","Gidelman","Chisinau",50,"Hirurg",10500,2));
        hospital.addDoctor("the eye hurts",new Doctor("Oleg","Gidelman","Chisinau",50,"Hirurg",10500,2));
        hospital.addDoctor("everything hurts",new Doctor("Vasili","Muntean","Chisinau",63,"Terapeut",10500,4));
        hospital.addDoctor("arm hurts",new Doctor("Oleg","Gidelman","Chisinau",50,"Hirurg",10500,2));

        //Array of Pacients
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alex","Keklidze","Chisinau",25, 0));
        patients.add(new Patient("Teodor","Pahom","Kyiv",30, 0));
        patients.add(new Patient("Oleg","Ungurean","Chisinau",34, 0));
        patients.add(new Patient("Petr","Borshevsky","Kiyv",27, 0));
        patients.add(new Patient("Grigoriy","Ejov","Chisinau",20, 0));

        System.out.println(hospital);

        for (Patient patient:patients) {
            patient.setSymptomString(getIllness());
            updateStateAndMoneyFor(patient);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        patients.forEach((Patient p) -> {
            Doctor tmpDoc = hospital.getDoctorForIllness(p.getSymptomString());
            if (tmpDoc == null) {
                System.out.println("No doctor for your illness");
            } else {
                tmpDoc.help(p);
            }
            System.out.println("**************************************************************************************");
        });
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("******************************************************************************************");
    }

    protected static String getIllness() {
        System.out.println("Choose what hurts you !?");
        System.out.println(
                "\t1: toothache \n" +
                "\t2: headache\n" +
                "\t3: the leg hurts\n" +
                "\t4: the eye hurts\n" +
                "\t5: everything hurts\n" +
                "\t6: Invalid-!-Welcome to Hell!");

        Scanner in = new Scanner(System.in);
        int symptom = in.nextInt();
        String symptomString;

        switch (symptom) {
            case 1:
                symptomString = "toothache";
                break;
            case 2:
                symptomString = "headache";
                break;
            case 3:
                symptomString = "the leg hurts";
                break;
            case 4:
                symptomString = "the eye hurts";
                break;
            case 5:
                symptomString = "everything hurts";
                break;
            case 6:
                symptomString = "arm hurts";
                break;
            default:
                symptomString = "hitrojoposti";
                break;
        }

        return symptomString;
    }

    protected static void updateStateAndMoneyFor(Patient p){
        System.out.println("\tEnter please you state: ");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter you money: ");
        p.setMoney(in.nextInt());

        System.out.println("Choose your group: \t1 \t2 \t3 \n");
        int groupIndex = in.nextInt();
        String group;

        switch (groupIndex) {
            case 1:
                group = "major";
                break;
            case 2:
                group = "bomj";
                break;
            case 3:
                group = "student";
                break;
            default:
                group = "Jackie Chan!";
                break;
        }
        p.setGroup(group);
    }
}
