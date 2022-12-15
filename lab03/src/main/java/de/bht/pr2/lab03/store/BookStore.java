package de.bht.pr2.lab03.store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BookStore {

  public static List<String> getSoldBooks() {
    List<String> data = new ArrayList<>();
    // Formate:
    // Buch:     Titel ; Typ des Buches ; Preis ; Auflage
    // Ebuch:    Titel ; Typ des Buches ; Preis ; Auflage ; Tolino-Version
    // Hoerbuch: Titel ; Typ des Buches ; Preis ; Auflage ; Abspielmodus

    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;3");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Der Heimweg;Buch;22.99;2016");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Ohne Schuld;Ebuch;21.99;2020;5");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;5");
    data.add("Harry Potter - alle 7 Baende;Hoerbuch;63.99;2018;Streaming");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;3");
    data.add("Funken Mord;Hoerbuch;18.99;2018;Streaming");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2018;Download");
    data.add("QualityLand 2.0;Hoerbuch;12.89;2018;Streaming");
    data.add("Ohne Schuld;Ebuch;21.99;2020;3");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Der Heimweg;Buch;22.99;2016");
    data.add("7 Minuten am Tag;Buch;20.00;2016");
    data.add("Harry Potter - alle 7 Baende;Hoerbuch;63.99;2018;CD");
    data.add("Der Heimweg;Ebuch;14.99;2020;5");
    data.add("Der Heimweg;Ebuch;14.99;2020;2");
    data.add("7 Minuten am Tag;Buch;20.00;2016");
    data.add("Funken Mord;Hoerbuch;18.99;2018;Download");
    data.add("QualityLand 2.0;Hoerbuch;12.89;2019;Streaming");
    data.add("Der Heimweg;Buch;22.99;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2019;Download");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;5");
    data.add("Der Heimweg;Buch;22.99;2016");
    data.add("Der Heimweg;Ebuch;14.99;2020;3");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;2");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Ohne Schuld;Ebuch;21.99;2020;3");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;5");
    data.add("Ohne Schuld;Buch;24.00;2016");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2018;CD");
    data.add("Der Heimweg;Buch;22.99;2020");
    data.add("Harry Potter - alle 7 Baende;Hoerbuch;63.99;2018;Download");
    data.add("7 Minuten am Tag;Buch;20.00;2016");
    data.add("Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;5");
    data.add("Escape Room;Buch;12.99;2020");
    data.add("Ohne Schuld;Buch;24.00;2020");
    data.add("Funken Mord;Hoerbuch;18.99;2019;Download");
    data.add("Zwei Handvoll Leben;Ebuch;4.99;2020;3");
    data.add("Der Heimweg;Ebuch;14.99;2020;5");
    data.add("Ohne Schuld;Buch;24.00;2016");
    data.add("QualityLand 2.0;Hoerbuch;12.89;2019;Streaming");
    data.add("Ohne Schuld;Buch;24.00;2016");
    data.add("7 Minuten am Tag;Buch;20.00;2016");

    return data;
  }
  public static List<Books> convert_to_obj()
  {
    String bal = "Kingsbridge - Der Morgen einer neuen Zeit;Ebuch;19.99;2020;3";
    List<String> bla = getSoldBooks();
    List<Books> list_books = new LinkedList<Books>();
    for (String element : bla) {
      System.out.println(element);
      List<String> student_string_list = Arrays.asList(element.split(";"));
      if (student_string_list.size() > 4)
      {
        Books foo = new Books(student_string_list.get(0),
                student_string_list.get(1),
                Double.parseDouble(student_string_list.get(2)),
                Integer.parseInt(student_string_list.get(3)),
                student_string_list.get(4));
        list_books.add(foo);
      }
      else
      {
        Books foo = new Books(student_string_list.get(0),
                student_string_list.get(1),
                Double.parseDouble(student_string_list.get(2)),
                Integer.parseInt(student_string_list.get(3)),
                null);
        list_books.add(foo);
      }
    }
    return list_books;
  }
}
