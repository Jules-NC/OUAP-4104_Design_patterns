/**/ package question1; // classe de test
                        // devrait s'appeler PatternObservateurTest

/**/ public class PatternObservateurTest extends junit.framework.TestCase
/**/ {

/**/   public void testNotify()
/**/   {
/**/     ConcreteSubject list;
/**/     ConcreteObserver observer;

/**/     list= new ConcreteSubject();
/**/     observer= new ConcreteObserver();
/**/     list.addObserver( observer );
/**/     list.insert( "il fait beau, ce matin" );

/**/     assertEquals( list, observer.senders().pop() );
/**/     assertEquals( "il fait beau, ce matin", observer.arguments().pop() );
/**/     list.insert( "super !!, je prends mon impermeable" );
/**/   } // testNotify()

       // une liste, 2 observateurs
       // Attention !  Les emetteurs sont des Observable, pas des String
/**/   public void test1()
/**/   {
/**/     question1.ConcreteSubject list1= new question1.ConcreteSubject();
/**/     question1.ConcreteObserver o1= new question1.ConcreteObserver();
/**/     question1.ConcreteObserver o2= new question1.ConcreteObserver();
/**/     list1.addObserver( o1 );
/**/     list1.addObserver( o2 );
/**/     list1.insert( "test" );
/**/     list1.insert( " un " );

    // a completer a partir de la ligne 36
    // verifier que les deux observateurs ont bien ete notifies avec les bons param�tres

    fail( "a completer !!" );
    
    
    
    
    
    

    // ne pas modifier ces lignes, dernieres assertions vraies de cette methode
    // elles echouent si le code a ete mal complete ci-dessus
    assertTrue( "Pile des emetteurs de o1 non vide !", o1.senders().empty() );
    assertTrue( "Pile des arguments de o1 non vide !", o1.arguments().empty() );
    assertTrue( "Pile des emetteurs de o2 non vide !", o2.senders().empty() );
    assertTrue( "Pile des arguments de o2 non vide !", o2.arguments().empty() );
  } // test1()

  // deux listes, 1 observateur
  public void test2()
  {
    question1.ConcreteSubject list1= new question1.ConcreteSubject();
    question1.ConcreteSubject list2= new question1.ConcreteSubject();

    question1.ConcreteObserver o= new question1.ConcreteObserver();
    list1.addObserver( o );
    list2.addObserver( o );
    list1.insert( "testA" );
    list1.insert( " A " );
    list2.insert( "testB" );
    list2.insert( " B " );

    // a completer a partir de la ligne 69
    // verifier que l'observateur a bien ete notifie par les deux listes

    fail( "a completer !!" );
    
    

    // ne pas modifier ces lignes, dernieres assertions vraies de cette methode
    // elles echouent si le code a ete mal complete ci-dessus
    assertTrue( "Pile des emetteurs de o non vide !", o.senders().empty() );
    assertTrue( "Pile des arguments de o non vide !", o.arguments().empty() );
  } // test2()

  // deux listes, 2 observateurs
  public void test3()
  {
    question1.ConcreteSubject list1= new question1.ConcreteSubject();
    question1.ConcreteSubject list2= new question1.ConcreteSubject();
    question1.ConcreteObserver o1= new question1.ConcreteObserver();
    question1.ConcreteObserver o2= new question1.ConcreteObserver();
    list1.addObserver( o1 );
    list1.addObserver( o2 );
    list2.addObserver( o1 );
    list2.addObserver( o2 );

    // a completer a partir de la ligne 94
    // verifier le bon fonctionnement de countObservers(), de deleteObserver et deleteObservers()

    fail( "a completer !!" );
    
    
    
    
    
    

    // ne pas modifier ces lignes, dernieres assertions vraies de cette methode
    // elles echouent si le code a ete mal complete ci-dessus
    assertTrue( "Pile des emetteurs de o1 non vide !", o1.senders().empty() );
    assertTrue( "Pile des emetteurs de o2 non vide !", o2.senders().empty() );
    assertEquals( "Nombre d'observateurs de list1", 0, list1.countObservers() );
    assertEquals( "Nombre d'observateurs de list2", 0, list2.countObservers() );
  } // test3()

} // PatternObservateurTest
