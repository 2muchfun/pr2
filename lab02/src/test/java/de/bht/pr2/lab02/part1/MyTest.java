//package de.bht.pr2.lab02.part1;

package de.bht.pr2.lab02.part1;
import de.bht.pr2.lab01.Student;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTest {

  @Test
  void testSomething() throws NotPaidTuitionFeeException, RegistrationNumberException,
          WrongCourseOfStudiesException, StudentParseException {

    Student student = new Student("Zoe Zoo,70026,Technische Informatik,312");
    assertEquals("Zoe Zoo", student.getName());
    //assertEquals("Zoe Zoo",  student.);
  }
}
