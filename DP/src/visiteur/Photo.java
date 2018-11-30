package visiteur;

public class Photo extends Media {
    protected String auteur;
    protected String nomFichier;
    public Photo(int d, String nom, String auteur, String nomFichier) {
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
        return 1;
    }

    public int accept(Visiteur v){
        return v.visit(this);
    }

}
