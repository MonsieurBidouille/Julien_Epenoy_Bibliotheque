package Librairie;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private int bibli_id;
    private static int cid;
    String nom;
    private List<Livre> booklist = new ArrayList<>();
    private List<Emprunteur> emprunteurs = new ArrayList<>();
    private List<Auteur> auteurs = new ArrayList<>();

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.bibli_id = cid;
        cid++;
    }

    public void addbook(Livre book) {
        booklist.add(book);
        if (!(auteurs.contains(book.getAuteur()))) {
            auteurs.add(book.getAuteur());
        }
    }

    public void removebook(Livre book) {
        booklist.remove(book);
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getAuteur() == book.getAuteur()) {
                auteurs.remove(book.getAuteur());
            }
        }

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addemprunteur(Emprunteur empr) {
        emprunteurs.add(empr);
    }

    public void removeemprunteur(Emprunteur empr) {
        emprunteurs.remove(empr);
    }

    public String showbooks() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < booklist.size(); i++) {
            res.append(booklist.get(i));
            if(i==(booklist.size()-1)) {
                res.append(".");
            }else{
            res.append(" ; ");}
        }
        return res.toString();
    }

    public String showauthors() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < auteurs.size(); i++) {
            res.append(auteurs.get(i).toString());
            if(i==(auteurs.size()-1)) {
                res.append(" .");
            }else{
                res.append(" ; ");}
        }
        return res.toString();
    }

    public String showemprunteurs() {
        String res = "";
        for (int i = 0; i < emprunteurs.size(); i++) {
            res += emprunteurs.get(i).toString();
            if(i==(emprunteurs.size()-1)) {
                res += " .";
            }else{
                res += " ; ";}
        }
        return res;
    }

    public void emprunter(Livre l, Emprunteur emp){
        l.setDispo(false);
        emp.addemprunt(l);
    }

    public void rendre(Livre l, Emprunteur emp){
        l.setDispo(true);
        emp.removeemprunt(l);
    }

}


