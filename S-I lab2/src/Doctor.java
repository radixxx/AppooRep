public class Doctor extends People implements Hospital {

    private String profil;
    private int salary;
    private int rank;


    public Doctor(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age);
        this.profil = profil;
        this.salary = salary;
        this.rank = rank;
    }


    @Override
    public void diagnos(String d) {
        System.out.println("БОЛЬНОЙ!");

    }

    @Override
    public void operation(String o) {
        System.out.println("Операция");
    }

    @Override
    public void heal(String h) {
        System.out.println("Лечить!");
    }

    @Override
    public void pain(String p) {
        System.out.println("Головная боль!");
    }

    @Override
    public void recuperate(String r) {
        System.out.println("Теперь Вы Здоровы! УРА!");
    }
}
