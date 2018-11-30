package interpreteur;

import java.util.ArrayList;

public class Video extends Media {

    private String nomFichier;
    private String auteur;

    public Video(int d, String nom, String auteur, String nomFichier) {
        super(d, nom);
        this.auteur = auteur;
        this.nomFichier = nomFichier;
    }

    public int getNombreDePhotos(){return 0;};


    public ArrayList<Video> getVideoFromFormat(String format){
        ArrayList<Video> vid =new ArrayList<Video>() ;

        if (this.nomFichier.substring(nomFichier.length() - 4).equals(".mp4"))
            vid.add(this);
        return vid;
    }
}
