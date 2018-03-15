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





/*
    public String TreatLOR(String l) {
         int num;
         String currentpain;

        System.out.println("Что у  вас болит: ?");
        System.out.println("\t1: Ухо \n" +
                "\t2: Горло\n" +
                "\t3: Нос\n"
        );

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        switch (num) {
            case 1:
                currentpain = "Ухо";
                break;
            case 2:
                currentpain = "Горло";
                break;
            case 3:
                currentpain = "Нос";
                break;
            default:
                currentpain = "Invalid !";
                break;
        }
        System.out.println(l + currentpain);
        return l + currentpain;

    }*/

}


