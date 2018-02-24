
public class Main {


    public static void main (String[] args){

        System.out.println("HELLO");
       /* People p = new People("Alex","Cobra","Chisinau",13);
        p.speak("");*/

//        System.out.println(p);

        //Doctros

        Dantist d = new Dantist("Dandy","Mandy", "Chisinau", 40, "Dantist", 1200, 10);

        d.TreatTeeth("");

        Hirurg h = new Hirurg("Luky","Cmoky", "Chisinau", 45, "Hyrurg", 1000, 8);

        h.TreatArm("");

        LOR l = new LOR ("John","MIller", "Chisinau", 35, "LOR", 8000, 6);

        l.treatEar("");
    }

}
