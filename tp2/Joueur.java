import java.util.*;
public abstract class Joueur extends Acteur{
    protected ArrayList<Carte> cartes;
    protected int pv = 10;
    
    public void jouerCarte(Carte c){
    }
    
    public int getPv(){
        return this.pv;
    }
    
    public void setPv(int i){
        assert i > 0;
        this.pv = i;
    }
}