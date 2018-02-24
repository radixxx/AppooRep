public class Doctor extends People  {

    private String profil;
    private int salary;
    private int rank;


    public Doctor(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age);
        this.profil = profil;
        this.salary = salary;
        this.rank = rank;
    }


}
