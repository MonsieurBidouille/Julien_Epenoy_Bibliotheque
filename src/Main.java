import Librairie.Auteur;
import Librairie.Bibliotheque;
import Librairie.Emprunteur;
import Librairie.Livre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bibliotheque bib1 = new Bibliotheque("La bibli super");
        Auteur aut1 = new Auteur("Jean-michel Poultreu", "04/05/1974", "néérlandais");
        Auteur aut2 = new Auteur("Louise Michalon", "02/05/1841","Suisse");
        Livre liv1 = new Livre("Le temps des pruneaux","03/06/1862",aut2,true);
        Livre liv2 = new Livre("Les aventure de débileman","03/12/1996",aut1,true);
        Emprunteur emp1 = new Emprunteur("Paul","4 rue des trucs 45784 Jeansac","0647841236");
        bib1.addbook(liv1);
        bib1.addbook(liv2);
        bib1.addemprunteur(emp1);
        System.out.println(bib1.showbooks());
        System.out.println(bib1.showauthors());
        System.out.println(bib1.showemprunteurs());
        bib1.emprunter(liv1,emp1);
        System.out.println(bib1.showbooks());
    }
}