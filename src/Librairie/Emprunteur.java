package Librairie;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {

    private int emp_id = 0;

    private static int cid = 0;
    private String nom = "";
    private String adresse = "";
    private String phone = "";
    private List<Livre> emprunt_en_cours = new ArrayList<>();

    public Emprunteur(String nom, String adresse, String phone) {
        this.nom = nom;
        this.adresse = adresse;
        this.phone = phone;
        this.emp_id = cid;
        cid++;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public static int getCid() {
        return cid;
    }

    public static void setCid(int cid) {
        Emprunteur.cid = cid;
    }

    public List<Livre> getEmprunt_en_cours() {
        return emprunt_en_cours;
    }

    public void setEmprunt_en_cours(List<Livre> emprunt_en_cours) {
        this.emprunt_en_cours = emprunt_en_cours;
    }

    public String toString() {
        return "Emprunteur{" +
                "emp_id=" + emp_id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void addemprunt(Livre l){
        emprunt_en_cours.add(l);
    }

    public void removeemprunt(Livre l){
        emprunt_en_cours.remove(l);
    }
}
