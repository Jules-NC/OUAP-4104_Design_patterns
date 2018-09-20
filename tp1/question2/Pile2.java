package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;
import java.util.*;

public class Pile2 implements PileI, Cloneable
{
  /** par delegation : utilisation de la class Stack */
  private Stack<Object> stk;

  /** la capacite de la pile */
  private int capacite;
  private int maxCapacite;
  
  /** Creation d'une pile.
   * @param taille la taille de la pile, la taille doit etre > 0
   */
  public Pile2( final int pCapacite ){
    this.maxCapacite = pCapacite;
    if(pCapacite <= 0) this.maxCapacite = CAPACITE_PAR_DEFAUT;
    stk = new Stack();
  } // Pile2(.)

  // constructeur fourni
  public Pile2(){
    this( 0 );
  } // Pile2()

  public void empiler( final Object pO ) throws PilePleineException{
    if(this.capacite == this.maxCapacite) throw new PilePleineException();
    stk.push(pO);
    this.capacite++;
  } // empiler(.)

  public Object depiler() throws PileVideException{
    this.capacite--;
    if(this.capacite < 0) throw new PileVideException();
    return stk.pop();
  } // depiler()

  public Object sommet() throws PileVideException{
    if(this.capacite == 0) throw new PileVideException();
    return stk.peek();
  } // sommet()
  
  /** Effectue un test de l'etat de la pile.
   * @return vrai si la pile est vide, faux autrement
   */
  public boolean estVide(){
      return stk.empty();
  } // estVide()

  /** Effectue un test de l'etat de la pile.
   * @return vrai si la pile est pleine, faux autrement
   */   
  public boolean estPleine(){
    return this.capacite == this.maxCapacite;
  } // estPleine()

  /** Retourne le nombre d'element d'une pile.
   * @return le nombre d'elements presents
   */ 
  public int taille(){
    return capacite;
  } // taille()
  
  /** Retourne la capacite de cette pile.
   * @return le nombre d'elements possibles
   */ 
  public int capacite(){
      return maxCapacite;
  } // capacite()
  
  /** Retourne une representation en String d'une pile, 
   * contenant la representation en String de chaque element.
   * @return une representation en String d'une pile
   */ 
  @Override public String toString(){
    Iterator e = stk.iterator();
    String s = "]";
    boolean first = true;
    while(e.hasNext() == true){
        String p = e.next().toString();
        if(first) first = false;
        else p+= ", ";
        s = p.concat(s);
    }
    String q = "[";
    q =  q.concat(s);
    return q;
  } // toString()
  
  @Override public boolean equals( final Object pO ){
    if(this == pO) return true;
    Pile2 p2 = (Pile2)pO;
    if(this.taille() != p2.taille()) return false;
    try{
        while(!(this.estVide())){
            if(!(this.depiler().equals(p2.depiler()))) return false;
            return true;
        }
    }
    catch (PileVideException e){return false;}
    return false;
  } // equals(.)
  
  // fonction fournie
  @Override public int hashCode(){
    return this.toString().hashCode();
  } // hashCode()
  
  // fonction fournie
  @SuppressWarnings("unchecked")
  @Override public Object clone() throws CloneNotSupportedException{
    Pile2 vP = new Pile2( this.capacite() );
    vP.stk = (Stack<Object>)this.stk.clone();
    return vP;
  }
} // Pile2
