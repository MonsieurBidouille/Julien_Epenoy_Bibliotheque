package Librairie;

public class Auteur {

    private String name = "";
    private String birth_date = "";
    private String nationality = "";


    public Auteur(String name , String birth_date , String nationality){
        this.name = name;
        this.birth_date = birth_date;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String toString() {
        return "Auteur{" +
                "name='" + name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
