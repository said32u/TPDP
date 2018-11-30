package visiteur;

import java.util.ArrayList;

public abstract class Media {
    protected int annee ;
    protected String nom ;

    protected Media(int a, String nom) {
        this.annee = a;
        this.nom = nom;
    }

    public abstract int accept(Visiteur v);
}
