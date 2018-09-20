package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;
import java.util.*;
/**
 * Decrivez votre classe PileVector ici.
 * 
 * @author (votre nom) 
 * @version (un numero de version ou une date)
 */
public class Pile3 implements PileI
{
  private Vector<Object> v;
  private int capacite;

  public Pile3( final int pCapacite ){
    this.capacite = pCapacite;
    if(pCapacite <= 0) this.capacite = CAPACITE_PAR_DEFAUT;
    v = new Vector<Object>();
  } // Pile3(.)
  
  public Pile3(){
    this( 0 );
  } // Pile3()
  
  public void empiler( final Object pO ) throws PilePleineException{
      if(v.size() == capacite) throw new PilePleineException();
      v.add(pO);
  } // empiler(.)
  
  public Object depiler() throws PileVideException{
    int i = v.size();
    if(i == 0) throw new PileVideException();
    Object r = v.elementAt(i-1);
    v.removeElementAt(i-1);
    return r;
  } // depiler()
  
  public Object sommet() throws PileVideException{
    if(v.size() == 0) throw new PileVideException();
    return v.elementAt(v.size()-1);
  } // sommet()
  
  public int taille()
  {
    return v.size();
  } // taille()
  
  public int capacite()
  {
    return this.capacite;
  } // capacite()
  
  public boolean estVide()
  {
    return v.size() == 0;
  } // estVide()
  
  public boolean estPleine()
  {
      return v.size() == this.capacite;
  } // estPleine()
  
  @Override public String toString()
  {
    if(this.taille() == 0) return "[]";
    String s = "[";
    for(int i = this.taille()-1; i >= 0; i--){
        if(i!=0)
            s += v.elementAt(i).toString() + ", " ;
        else s+= v.elementAt(i).toString() + "]";
    }
    return s;
  } // toString()
  
  @Override public boolean equals( final Object pO )
  {
    if(this == pO) return true;
    //if(this.getClass() != pO.getClass()) return false;
    
    Pile3 p2 = (Pile3)pO;
    boolean res = true;
    if(this.taille() != p2.taille()) return false;
    try{
        while(this.taille() > 0){
            if((this.depiler().equals(p2.depiler()))) return true;
        }
        return true;
    }
    catch(PileVideException e){return false;}
} // equals(.)

  // fonction fournie
  @Override public int hashCode()
  {
    return this.toString().hashCode();
  } // hashCode()

  // fonction fournie
  @SuppressWarnings("unchecked")
  @Override public Object clone() throws CloneNotSupportedException
  {
    Pile3 vP = new Pile3( this.capacite() );
    vP.v = (Vector<Object>)this.v.clone();
    return vP;
  }
}
