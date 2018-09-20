public class AttaqueCarte implements Effet<Carte>{
    private Carte c, d;
    public AttaqueCarte(Carte c, Carte d){
        this.c = c;
        this.d = d;
    }
    public void executer(){
         d.setPv(5);
    }
    public void notifyObserver(){
        
    }
}