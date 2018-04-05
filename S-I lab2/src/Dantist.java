import java.util.Scanner;

public class Dantist extends Doctor implements illness  {

    public Dantist(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }

    @Override
    public String Illness(String s) {
        System.out.println("Choose what hurts you !?");
        System.out.println(
                "\t1: Чистка зубов \n" +
                        "\t2: Воспаление десен\n" +
                        "\t3: Поставить пломбу\n" +
                        "\t4: Сделать коорекцию\n"
        );

        Scanner in = new Scanner(System.in);
        int symptom = in.nextInt();
        String symptomString;

        switch (symptom) {
            case 1:
                symptomString = "  Чистка зубов";
                break;
            case 2:
                symptomString = " Воспаление десен";
                break;
            case 3:
                symptomString = " Поставить пломбу";
                break;
            case 4:
                symptomString = " Сделать коорекцию";
                break;
            default:
                symptomString = "hitrojoposti";
                break;
        }

        return symptomString;

    }

}
