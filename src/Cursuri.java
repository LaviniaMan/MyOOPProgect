import java.util.ArrayList;

public class Cursuri {

    public static void main(String[] args) {

        ArrayList<String> cursuri = new ArrayList<>();
        cursuri.add("Testare Manuala");
        cursuri.add("Testare Automata");
        cursuri.add("Front-end");
        cursuri.add("Java");

        System.out.println("Elementul de pe a doua pozitie este "+cursuri.get(1));

        System.out.println("Lungimea listei este "+cursuri.size());

        for (String element:cursuri){
            System.out.println("Elementele cursului sunt "+element);
        }

    }

}
