package visiteur;

import java.util.ArrayList;

public class Video extends Media {
    protected String auteur;
    protected String nomFichier;
    public Video(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "auteur='" + auteur + '\'' +
                ", annee=" + annee +
                ", nom='" + nom + '\'' +
                '}';
    }

    public int accept(Photo p){
        return 0;
    }

    public int accept(Visiteur v){

        return (v.visit(this).size());

    }

}
