package visiteur;

public class VisitNbPhotos implements Visiteur {

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
}
