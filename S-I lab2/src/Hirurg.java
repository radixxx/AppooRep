
public class Hirurg extends Doctor implements TreatArm {


    public Hirurg(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }

    @Override
    public void TreatArm(String a) {
        System.out.println("Вылечить руку!");

    }
}
