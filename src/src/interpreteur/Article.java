package interpreteur;

import java.util.ArrayList;

public class Article extends Media {
    private String texte;
    private String auteur;

    public Article(int d, String nom, String auteur, String newTexte) {
        super(d, nom);
        this.auteur = auteur;
        this.texte = newTexte;
    }

    public int getNombreDePhotos(){return 0;};

    public ArrayList<String> getTexteFromAuthor(String auteur){
        ArrayList<String> texte =new ArrayList<>() ;

        if (this.nom.equals(auteur))
            texte.add(this.texte);
        return texte;
    }

}
