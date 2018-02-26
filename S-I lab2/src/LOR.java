import java.util.Scanner;

public class LOR extends Doctor implements TreatLOR {

    public LOR(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }

    @Override
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

    }

}


