public class Doctor extends People {
    private String profil;
    private int salary;
    private int rank;

    Doctor(String name, String lastname, String city, int age, String profil, int salary, int rank) {
        super(name, lastname, city, age);
        this.profil = profil;
        this.salary = salary;
        this.rank = rank;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    //incapsulation - 1
    @Override
    public String toString() {
        return "Doctor:  " + getName() + " " + getLastname() + " profil: " +  profil + "  " + "city: "
                + getCity() + " " + "rank: " + rank +" " + "salary " + salary  + "$ " + "age "  + getAge() + " years";
    }

    //methods
    public void help (Patient p){
       System.out.println(p.getName() + ", ты здоров! Встань и иди!");
    }

    @Override
    public void speak(String text1) {
        super.speak(text1);
        System.out.println("\tHello dear Patient! Am the you Doctor!");
    }
}
