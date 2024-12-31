/*
 * @purpose: To create an instance of the object and use its methods
 * 
 * @author: Areesha Tariq
 * @version: 12/25/2023
 */

public class StudentTesterV8 {

// method to display the code in a user friendy way
 public static void printHeader(){

    System.out.println("\t\t\t\t  Grades:");
    System.out.println("Student:\t Grade 1:\t Grade 2:\t Average:\t Highest Grade:");
    System.out.println("===============================================================================");
}

// main method - create an object, using its methods, and creating variables for it
public static void main(String []args){

  
    printHeader();  
    //String door, String whiteboard, String windows, int rent

    //object creations
    StudentV8 student1 = new StudentV8();
    student1.setGrade1(68);
    student1.setGrade2(99);
    student1.setName("Sara");
    student1.calcAverage();
    student1.greater();

    StudentV8 student2 = new StudentV8(99, 95);
    student2.setName("Aisha");
    student2.calcAverage();
    student2.greater();
    
    StudentV8 student3 = new StudentV8(88, 92, "Layla");
    student3.calcAverage();
    student3.greater();

    //printing result
    student1.display();
    student2.display();
    student3.display();


    //String door, String whiteboard, String windows, int rent
}

}
