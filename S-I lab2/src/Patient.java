import java.util.Scanner;
public class Patient extends People implements RefuseTreatment {

    public Patient(String name, String lastname, String city, int age, int money) {
        super(name, lastname, city, age);
        this.money = money;
    }

    private int money;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    private String group;
    private String symptomString;

    public String getSymptomString() {
        return symptomString;
    }

    public void setSymptomString(String symptomString) {
        this.symptomString = symptomString;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Patient {" + "money=" + money +  '\'' + ", name='" + getName() + '\'' + ", last name='"
                + getLastname() + "', city='" + getCity() + "', age=" + getAge() + '}';
    }

    @Override
    public void speak(String text1) {
        super.speak(text1);
        System.out.println("I need help Doctor");
    }


    @Override
    public String refusetretament(String s) {
        System.out.println("I refuse treatment");
        return null;
    }
}
