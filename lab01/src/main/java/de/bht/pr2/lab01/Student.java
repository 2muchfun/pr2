package de.bht.pr2.lab01;
import java.util.*;
public class Student {

  //-------------------------------------------
  // Attribute
  public String name = "";

  // Matrikelnummer
  public int registrationNumber = 0;
  private List<String> courses = Arrays.asList("Medieninformatik",
          "Technische Informatik",
          "Druck- und Medientechnik",
          "Screen Based Media");
  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  public String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) throws Exception {

    String temp = dataRow;
    List<String> student_string_list = Arrays.asList(temp.split(","));

    if (student_string_list.size() != 4)
    {
      throw new StudentParseException("Zu wenig Daten");
    }
    try{
      this.registrationNumber = Integer.parseInt(student_string_list.get(1));
    }
    catch(Exception e)
    {
      throw new RegistrationNumberException("Falsche Matrikelnummer");
    }
    this.name = student_string_list.get(0);
    if (Integer.parseInt(student_string_list.get(3)) !=this.TUITION_FEE )
    {
      throw new NotPaidTuitionFeeException("Zu wenig bezahlt");
    }
    boolean foo = this.courses.contains(student_string_list.get(2));
    if (this.courses.contains(student_string_list.get(2)))
      {


        this.courseOfStudies = student_string_list.get(2);
      }
    else
    {
      throw new WrongCourseOfStudiesException("Falscher Studiengang");
    }

    System.out.println(temp);


  }
}
