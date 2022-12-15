package de.bht.pr2.lab03.part1;

import de.bht.pr2.lab03.store.Books;

import java.util.Iterator;
import java.util.List;

import static de.bht.pr2.lab03.store.BookStore.*;

public class SumPrices {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Summe Buch:     € 381.88
    Summe Ebuch:    € 255.82
    Summe Hoerbuch: € 344.58
    Summe Alle:     € 982.28
   */
    //List<String> bla = getSoldBooks();
    List<Books> bla = convert_to_obj();
    Iterator<Books> it = bla.iterator();
    double Summe_Buch= 0;
    double Summe_Ebuch= 0;
    double Summe_Hoerbuch= 0;
    double Summe_Alle= 0;
    while (it.hasNext()){ // Verfuegbarkeit des naechsten Elements pruefen
      Books s = it.next();
      Summe_Alle +=s.preis();
      if (s.typeBook().equals("Ebuch"))
      {
        Summe_Ebuch += s.preis();
      }
      else if (s.typeBook().equals("Buch"))
      {
        Summe_Buch += s.preis();
      }
      else if (s.typeBook().equals("Hoerbuch"))
      {
        Summe_Hoerbuch += s.preis();
      }


    }
    System.out.println("stop");

  }
}
