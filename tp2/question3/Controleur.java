package question3;

import question3.tp_pile.PileI;
import question3.tp_pile.PilePleineException;
import question3.tp_pile.PileVideException;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import static java.lang.System.out;

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
        push.addActionListener(new BoutonPushListener());
        boutons.add( add );
        add.addActionListener(new BoutonPlusListener());
        boutons.add( sub );
        sub.addActionListener(new BoutonMoinsListener());
        boutons.add( mul );
        mul.addActionListener( new BoutonMultListener());
        boutons.add( div );
        div.addActionListener( new BoutonDivListener());
        boutons.add( clear );
        clear.addActionListener( new BoutonClearListener());
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
    class BoutonPushListener implements ActionListener{
        public void actionPerformed(ActionEvent e){       
            try{
                pile.empiler(Integer.parseInt(donnee.getText()));
                System.out.println(pile.taille());
            }
            catch(PilePleineException ex){
                System.out.println("ERREUR");
            }
        }
    }

    class BoutonPlusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(pile.taille()<2) return;
            try{
                pile.empiler(pile.depiler()+pile.depiler());
            }
            catch(Exception ex){
                System.out.println("ERREUR");
            }
        }
    }

    class BoutonMoinsListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(pile.taille()<2) return;
            try{
                pile.empiler(pile.depiler()-pile.depiler());
            }
            catch(Exception ex){
                System.out.println("ERREUR");
            }
        }
    }

    class BoutonMultListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(pile.taille()<2) return;
            try{
                pile.empiler(pile.depiler() * pile.depiler());
            }
            catch(Exception ex){
                System.out.println("ERREUR");
            }
        }
    }

    class BoutonDivListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(pile.taille()<2) return;
            try{
                if(pile.sommet() == 0) return;
                pile.empiler(pile.depiler()/pile.depiler());
            }
            catch(Exception ex){
                System.out.println("ERREUR");
            }
        }
    }

    class BoutonClearListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            pile.vider();
            System.out.println(pile.taille());

        }
    }
} // Controleur
