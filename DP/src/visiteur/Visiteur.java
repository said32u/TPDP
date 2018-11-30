package visiteur;

public interface Visiteur {

    public int visit(Album a);
    public int visit(Photo p);
    public int visit(Video v);
    public int visit(Article ar);
}
