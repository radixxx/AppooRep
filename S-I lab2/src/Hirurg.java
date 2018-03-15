import java.util.Scanner;

public class Hirurg extends Doctor implements illness {


    Hirurg(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }

    @Override
    public String Illness(String s) {

        System.out.println("Choose what hurts you !?");
        System.out.println(
                "\t1: Голова \n" +
                        "\t2: Рука\n" +
                        "\t3: Нога\n" +
                        "\t4: Спина\n" +
                        "Все такие душа...!" +
                        "\t6: Invalid-!-Welcome to Hell!");

        Scanner in = new Scanner(System.in);
        int symptom = in.nextInt();
        String symptomString;

        switch (symptom) {
            case 1:
                symptomString = " Голова";
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










   /* // @Override
    public String TreatBody(String b) {
        int num;
        String currentpain;

        System.out.println("Что у вас болит: ?");
        System.out.println("\t1: Голова \n" +
                "\t2: Рука\n" +
                "\t3: Нога\n" +
                "\t4: Спина\n"+
                "\t5: А может Душа...!?\n"
        );

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        switch (num) {
            case 1:
                currentpain = "Голова";
                break;
            case 2:
                currentpain = "Рука";
                break;
            case 3:
                currentpain = "Нога";
                break;
            case 4:
                currentpain = "Спина";
                break;
            case 5:
                currentpain = "Все такие душа...!";
                break;
            default:
                currentpain = "Invalid !";
                break;
        }
        System.out.println(b + currentpain);
        return b + currentpain;
    }*/
}
