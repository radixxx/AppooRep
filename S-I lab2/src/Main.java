public class Main {


    public static void main (String[] args){

        System.out.println("\t\t Welcome to Clinic -|- San Hose -|- \n");

        Dantist d = new Dantist("Dandy","Mandy", "Chisinau", 40, "Dantist", 1200, 10);
        d.TreatTeeth("");

        Hirurg h = new Hirurg("Luky","Cmoky", "Chisinau", 45, "Hyrurg", 1000, 8);
        h.TreatBody("");

        LOR l = new LOR ("John","MIller", "Chisinau", 35, "LOR", 8000, 6);
        l.TreatLOR("");

    }

}
