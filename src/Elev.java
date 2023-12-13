public class Elev {
    String nume;
    static String diriginte = "Isoscel";

    public Elev(String numa) {
        this.nume = numa;
    }

    public void metodaNonStatica(){
        System.out.println("metoda non statica");
    }
    public static void metodaStatica(){
        System.out.println("metoda statica");
    }
}
