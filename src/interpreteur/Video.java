package interpreteur;

public class Video extends Media {

    private String nomFichier;
    private String auteur;

    public Video(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    public int getNombreDePhotos(){return 0;};
}
