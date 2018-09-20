public abstract class Carte extends Acteur{
    protected Effets effets;
    protected int attaque;
    protected int pv = 30;
    public int getAttaque(){return this.attaque;}
    public int getPv(){return this.pv;}
    public void setPv(int i){this.pv = i;}
    
    public void interragir(){
        this.effets.executer();
    }
}