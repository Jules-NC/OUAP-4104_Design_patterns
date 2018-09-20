import java.util.*;
public class Effets{
    private Vector<Effet> effets;
    public Effets(Effet e){
        this.effets = new Vector<Effet>();
        effets.add(e);
    }
    
    public Effet peek(){
        return effets.elementAt(effets.size()-1);
    }
    public void executer(){
        for(Effet e : effets){
            e.executer();
        }
    }
}