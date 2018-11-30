package visiteur;

import java.util.ArrayList;

public class VisitTextes implements Visiteur {

    ArrayList<String> texte =new ArrayList<>() ;
    public String auteur;
    public VisitTextes(String auteur){
        this.auteur = auteur;
    }

    public int visit(Album a){
        return 0;
    }
    public int visit(Photo p){
        return 0;
    }

    public ArrayList<Video> visit(Video v) {
        return null;
    }
    public ArrayList<String> visit(Article ar){
        if (ar.nom.equals(this.auteur)) {
            texte.add(ar.texte);
        }
        return texte;
    }


}
