public class Rexxar extends Carte{
    public Rexxar(){
        Effet e = new AttaqueCarte(this, this);
        this.effets = new Effets(e);
    }
}