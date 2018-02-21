public class Main {


    public static void main (String[] args){

        System.out.println("HELLO");

        People p = new People("Alex","Cobra","Chisinau",13);

        p.speak("");

        System.out.println(p);

        Doctor house = new Doctor("Feodor","Zelensky","Chisinau",45,"Dantist",10500,0);

        house.diagnos("");
        house.heal("");
        house.operation("");
        house.pain("");
        house.recuperate("");

    }

}
