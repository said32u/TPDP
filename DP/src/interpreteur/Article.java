package interpreteur;

public class Article extends Media {
    private String texte;
    private String auteur;

    public Article(int d, String nom, String auteur, String newTexte) {
        super(d, nom);
        this.auteur = auteur;
        this.texte = newTexte;
    }

    public int getNombreDePhotos(){return 0;};

    public String getTexteFromAuthor(String auteur){
        String a = "";
        if (this.nom.equals(auteur))
            a = this.texte;
        else
            a = "Not found";
        return a;
    }

}
