package visiteur;

import java.util.ArrayList;

public class VisitVidMP4 implements Visiteur {

    ArrayList<Video> vid = new ArrayList<>() ;
    public VisitVidMP4(){

    }

    public int visit(Album a){
        return 0;
    }
    public int visit(Photo p){
        return 0;
    }

    public ArrayList<Video> visit(Video v) {
        if (v.nomFichier.substring(v.nomFichier.length() - 4).equals(".mp4"))
            vid.add(v);
        return vid;
    }
    public ArrayList<String> visit(Article ar){
        return null;
    }


}
