import java.util.Scanner;

public class Hirurg extends Doctor implements TreatBody {


    public Hirurg(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }

    @Override
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
    }
}
