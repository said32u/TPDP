package visiteur;

import java.util.ArrayList;

public class Article extends Media {
    protected String auteur;
    protected String texte;
    public Article(int d, String nom, String auteur, String newTexte) {
        super(d, nom);
        this.auteur = auteur;
        this.texte = newTexte;
    }

    @Override
    public String toString() {
        return "Article{" +
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
