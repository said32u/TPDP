package visiteur;

import java.util.ArrayList;

public interface Visiteur {

    public int visit(Album a);
    public int visit(Photo p);
    public ArrayList<Video>  visit(Video v);
    public ArrayList<String> visit(Article ar);
}
