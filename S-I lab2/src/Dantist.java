import java.util.Scanner;

public class Dantist extends Doctor implements TreatTeeth  {


    public Dantist(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }


    @Override
    public String TreatTeeth(String t) {

        int num;
        String currentpain;

        System.out.println("Что у  вас болит: ?");
        System.out.println("\t1: Все зубы \n" +
                "\t2: Мне нужна пломба\n" +
                "\t3: Мне нужен новый зуб\n"
        );

        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        switch (num) {
            case 1:
                currentpain = "Все зубы";
                break;
            case 2:
                currentpain = " Мне нужна пломба";
                break;
            case 3:
                currentpain = " Мне нужен новый зуб";
                break;
            default:
                currentpain = "Invalid !";
                break;
        }
        System.out.println(t + currentpain);
        return t + currentpain;
    }
}
