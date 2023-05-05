package Librairie;

public class Livre {

    private int livre_id =0;
    private static int ai = 0;
    private String titre = "";
    private String date_publication = "";
    private Auteur auteur;
    private boolean dispo = true;



    public Livre(String titre, String date_publication, Auteur auteur, boolean dispo){
        this.titre = titre;
        this.date_publication = date_publication;
        this.auteur = auteur;
        this.dispo = dispo;
        this.livre_id = ai;
        ai++;
    }


    public int getLivre_id() {
        return livre_id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public String toString() {
        return "Livre{" +
                "livre_id=" + livre_id +
                ", titre='" + titre + '\'' +
                ", date_publication='" + date_publication + '\'' +
                ", auteur=" + auteur +
                ", dispo=" + dispo +
                '}';
    }
}

