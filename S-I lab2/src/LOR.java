import java.util.Scanner;

public class LOR extends Doctor implements illness {


    LOR(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }


    @Override
    public String Illness(String s) {

        System.out.println("Choose what hurts you !?");
        System.out.println(
                "\t1: Горло \n" +
                        "\t2: Ухо\n" +
                        "\t3: Нос\n" +
                        "\t4: Гланды\n"
                        );

        Scanner in = new Scanner(System.in);
        int symptom = in.nextInt();
        String symptomString;

        switch (symptom) {
            case 1:
                symptomString = "  Горло";
                break;
            case 2:
                symptomString = " Ухо";
                break;
            case 3:
                symptomString = " Ноc";
                break;
            case 4:
                symptomString = " Гланды";
                break;
            default:
                symptomString = "hitrojoposti";
                break;
        }

        return symptomString;
    }


}


