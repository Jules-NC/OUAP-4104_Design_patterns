package question3;

import question1.PolygoneRegulier;

public class UneUtilisation
{
  public static void main( final String[] pArgs ) throws Exception
  {
    // declarer p1   // une pile de polygones reguliers PolygoneRegulier.java
    // declarer p2  //  une pile de pile de polygones reguliers 
    Pile2 p1 = new Pile2<PolygoneRegulier>(9);
    Pile2 p2 = new Pile2<Pile2<PolygoneRegulier>>(6);
    
    // p1 est ici une pile de polygones reguliers PolygoneRegulier.java
    p1.empiler( new PolygoneRegulier(4,100) );
    p1.empiler( new PolygoneRegulier(5,100) );

    System.out.println( " la pile p1 = " + p1 ); // Quel est le resultat ?
                                          
    p2.empiler( p1 );
    System.out.println( " la pile p2 = " + p2 ); 

    try {
      p1.empiler( new PolygoneRegulier(5,100) ); 
      Boolean vB = (Boolean)p1.depiler();  
    } catch( final Exception pE ) {
        pE.printStackTrace();
    }
  } // main()
} // UneUtilisation