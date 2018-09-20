package question1;
import question1.PilePleineException;
import question1.PileVideException;

public interface PileI
{
    public final static int CAPACITE_PAR_DEFAUT = 6;
    // ? utiliser quand le paramètre du constructeur <= 0

    public void empiler(Object o) throws PilePleineException;
    public Object depiler() throws PileVideException;

    public boolean estVide();
    public boolean estPleine();

    public String toString();
} // PileI