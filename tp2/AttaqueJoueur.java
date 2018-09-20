public class AttaqueJoueur implements Effet<Carte>{
    public AttaqueJoueur(Carte c){
    }
    public void executer(){
         Ennemi.getEnnemi().setPv(2);
    }
    public void notifyObserver(){}
}