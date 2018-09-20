package question3;

import question3.tp_pile.PileI;
import question3.tp_pile.PileVideException;
import question3.tp_pile.PilePleineException;

import java.util.Observable;
public class PileModele<T> /* extends a completer */ implements PileI<T>
{
  private PileI<T> pile;

  /* a completer */

  public PileModele( PileI<T> pile )
  {
    this.pile= pile;
  } // PileModele()

  public void empiler( T o ) throws PilePleineException
  {
  } // empiler()

  public T depiler() throws PileVideException
  {
    return null;
  } // depiler()

  public T sommet() throws PileVideException
  {
    return null;
  } // sommet()

  public int taille()
  {
    return pile.taille();
  } // taille()

  public int capacite()
  {
    return pile.capacite();
  } // capacite()

  public boolean estVide()
  {
    return pile.estVide();
  } // estVide()

  public boolean estPleine()
  {
    return pile.estPleine();
  } // estPleine()

  public String toString()
  {
    return pile.toString();
  } // toString()
  
} // PileModele

/** notez qu'un message d'alerte subsiste a la compilation (unsafe ...) 
 *  du a l'emploi de notifyObservers, incontournable et sans consequence ici
 */

