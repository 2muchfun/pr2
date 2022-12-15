package de.bht.pr2.lab04;

import org.junit.jupiter.api.Test;

class CertificateSerdeTest {



  @Test
  public void test1() {
    /* Uncomment
    final Course prog1 = new Course("Programmierung 1", "Medieninformatik");
    final Student siamak = new Student("Siamak", 12345);
    final Subscription siamakProg1 = new Subscription(siamak, prog1);
    final Grade grade = new Grade(siamakProg1, 2.0);

    final Certificate certificate = new Certificate(siamak);
    certificate.addGrade(grade);

    final String path = "src/test/resources/certificate.txt";
    final ObjectSerde objectSerde = new ObjectSerde();
    objectSerde.serialize(certificate, path);
    Certificate certificate1 = (Certificate) objectSerde.deserialize(path);

    Assertions.assertEquals(certificate, certificate1);
    */
  }
  @Test
  public void example_classes() {
    /* Uncomment
    Kurs: Programmierung 2
    Student: Max Mustermann
    Belegung: Max Mustermann belegt Programmierung 2
    Benotung: Die Belegung von Max Mustermann in Programmierung 2 erhält eine 1.7
    Zeugnisse: Für die Belegung von Max Mustermann
    in Programmierung 2 mit der Benotung von 1.7 wird ein Zeugnisse erstellt

    */
    Student max =  new Student("Max Mustermann","0001");
    Subscription subs = new Subscription(
            max,
            new Course("Programmierung 2","abcde")
            );
    Grade grade = new Grade(1.7);
    Certificate certificate = new Certificate(max);
    certificate.addGrade(grade);
    Grade note = certificate.getGrade();
    final String path = "src/test/resources/certificate.txt";
    final ObjectSerde objectSerde = new ObjectSerde();
    objectSerde.serialize(certificate, path);
    String certificate1 = objectSerde.deserialize(path);
    System.out.println("bla");


  }
}

