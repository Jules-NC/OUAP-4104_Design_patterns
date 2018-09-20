public class Ennemi extends Joueur{
    
    private Ennemi(){}
    
    private static Ennemi ENNEMI = new Ennemi();
    
    public static Ennemi getEnnemi(){
        return ENNEMI;
    }
}