package visiteur;

import java.util.ArrayList;

public class VisitNbPhotos implements Visiteur {

    ArrayList<String> texte =new ArrayList<>() ;
    ArrayList<Video> vid =new ArrayList<Video>() ;


    public VisitNbPhotos(){

    }

    public int visit(Album a){
        int cpt = 0;
        for (Media m : a){
            cpt += m.accept(this);
        }
        return cpt;
    }
    public int visit(Photo p){
        return 1;
    }

    public ArrayList<Video> visit(Video video){
        return null;
    }

    public ArrayList<String> visit(Article ar) {
        return null;
    }


}
