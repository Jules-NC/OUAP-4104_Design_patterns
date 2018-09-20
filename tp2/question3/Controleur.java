package question3;

import question3.tp_pile.PileI;
import question3.tp_pile.PilePleineException;
import question3.tp_pile.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Decrivez votre classe Controleur ici.
 * 
 * @author (votre nom) 
 * @version (un numero de version ou une date)
 */
public class Controleur extends JPanel
{
  private JButton push, add, sub, mul, div, clear;
  private PileModele<Integer> pile;
  private JTextField donnee;

  public Controleur( PileModele<Integer> pile )
  {
    super();
    this.pile= pile;
    this.donnee= new JTextField( 8 );

    this.push= new JButton( "push" );
    this.add= new JButton( "+" );
    this.sub= new JButton( "-" );
    this.mul= new JButton( "*" );
    this.div= new JButton( "/" );
    this.clear= new JButton( "[]" );

    setLayout( new GridLayout( 2, 1 ) );
    add( donnee );
    donnee.addActionListener( null /* null est a remplacer */);
    JPanel boutons= new JPanel();
    boutons.setLayout( new FlowLayout() );
    boutons.add( push );
    push.addActionListener( null /* null est a remplacer */);
    boutons.add( add );
    add.addActionListener( null /* null est a remplacer */);
    boutons.add( sub );
    sub.addActionListener( null /* null est a remplacer */);
    boutons.add( mul );
    mul.addActionListener( null /* null est a remplacer */);
    boutons.add( div );
    div.addActionListener( null /* null est a remplacer */);
    boutons.add( clear );
    clear.addActionListener( null /* null est a remplacer */);
    add( boutons );
    boutons.setBackground( Color.red );
    actualiserInterface();
  } // Controleur()

  public void actualiserInterface()
  {
    // a completer
  } // actualiserInterface()

  private Integer operande() throws NumberFormatException
  {
    return Integer.parseInt( donnee.getText() );
  } // operande()

  // a completer
  // en cas d'exception comme division par zero, mauvais format de nombre
  // la pile doit rester en l'etat (intacte)

} // Controleur
