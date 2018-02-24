
public class LOR extends Doctor implements TreatEar {

    public LOR(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }


    @Override
    public void treatEar(String z) {
        System.out.println("Вылечить Ухо");
    }
}
