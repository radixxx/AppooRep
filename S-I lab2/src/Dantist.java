
public class Dantist extends Doctor implements TreatTeeth  {


    public Dantist(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age, profil, salary, rank);
    }

//    Dantist d = new Dantist("Dandy","Mandy", "Chisinau", 40, "Dantist", 1200, 10);


    @Override
    public void TreatTeeth(String t) {

        System.out.println("Выдечить зуб");


    }
}
