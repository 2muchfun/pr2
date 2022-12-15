package de.bht.pr2.lab03.part2;

import de.bht.pr2.lab03.store.Books;

import java.util.Iterator;
import java.util.List;

import static de.bht.pr2.lab03.store.BookStore.convert_to_obj;

public class Tolino3BookCount {

  public static void main(String[] args) {
    /* Das Ergebnis der Berechnungen sollte sein:

    Anzahl Ebuecher bei Tolino 3: 9

     */
    List<Books> bla = convert_to_obj();
    Iterator<Books> it = bla.iterator();
    double anzahl_Tolino= 0;
    while (it.hasNext()) {
      Books s = it.next();
      if (s.version().equals("3") && s.typeBook().equals("Ebuch"))
      {
        anzahl_Tolino++;
      }
    }
    System.out.println("stop");
    }
  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
      return false;
    }
    try {
      double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

}
