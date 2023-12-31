public class Main {
    public static void main(String[] args){
        Carte carte1 = new Carte(); //cuvantul cheie new se foloseste la crearea obiectului
        carte1.autor = "Mihai Eminescu";
        carte1.titlu = "Poezii";
        carte1.pret = 35.00;

        Carte carte2 = new Carte();
        carte2.autor = "Ion Creanga";
        carte2.titlu = "Amintiri din copilarie";

        System.out.println(carte1.pret);
        System.out.println(carte2.pret);
        System.out.println(carte1.getPret());
        System.out.println(carte1.afiseaza());

        carte1.titlu="Basme";
        System.out.println(carte1.afiseaza());

        Masina masina1 = new Masina();
        System.out.println(masina1.marca);
        Masina masina2 = new Masina();
        masina2.marca="Dacia";
        System.out.println(masina2.marca);
        System.out.println(masina1.marca);

    //    System.out.println(masina1.anFabricatie);
    //   masina1.anFabricatie = 2019;
    //   System.out.println(masina1.anFabricatie);

        Masina masina3 = new Masina();
        Masina masina4 = new Masina();

        masina3.anFabricatie = 2010;
        masina4.anFabricatie = 2020;

        System.out.println(masina3.anFabricatie);
        System.out.println(masina4.anFabricatie);

        Persoana persoana1 = new Persoana();
        System.out.println(persoana1.nume);
        System.out.println(persoana1.prenume);

        Persoana persoana2 = new Persoana("Ion","Popescu");
        System.out.println(persoana2.varsta+ persoana2.varsta);

        Persoana persoana3 =new Persoana(35,"F", "Pop");
        System.out.println(persoana3.varsta+persoana3.sex+persoana3.nume);

        Masina masina5 = new Masina();
        System.out.println(masina5.marca);

        Masina masina6 = new Masina("Tesla", 2022);
        System.out.println(masina6.marca+" "+masina6.getAnFabricatie());

        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Azorel");
        Animal animal3 = new Animal("Pisi"," Maro");
        Animal animal4 = new Animal("Nemo", " Roscat",true);

        animal1.mananca();
        animal2.doarme();
        animal3.mananca();
        animal4.doarme();

        System.out.println(animal3.afiseaza());

        Elev elev1 = new Elev("Popescu");
        Elev elev2 = new Elev("Ionescu");
        System.out.println(elev1.nume);
        System.out.println(elev2.nume);

        elev1.diriginte = "Isoscel2";
        System.out.println(elev2.diriginte);

        elev1.metodaNonStatica();
        Elev.metodaStatica();

        Film film1 = new Film();
     //   film1.nume = "Titanic";     Nu se poate afisa datorita caraterului private
        film1.setTitlu("Titanic");
        System.out.println(film1.getTitlu());

        Inotator inotator1 = new Inotator("Romania", "Fluture");
        inotator1.seAntreneaza();
        inotator1.seOdihneste();
        System.out.println(inotator1.sport);

        Maratonist maratonist1 = new Maratonist("Nigeria", "100 m");
        maratonist1.seAntreneaza();
        maratonist1.seOdihneste();
        System.out.println(maratonist1.sport);

        Pisica pisica1 = new Pisica();
        pisica1.scoateSunete();

        Caine caine1 = new Caine();
        caine1.scoateSunete();

        Mamifer mamifer1 = new Pisica();
        mamifer1.scoateSunete();

        Pisica pisica2 = new Pisica();
        Mamifer pisica3 = pisica2;

     // Mamifer pisica4 = new Mamifer(); // pisica4 e de tip Mamifer
     // Pisica pisica5 =  (Pisica) pisica4; // pisica5 il facem de tip Pisica

    }
}
