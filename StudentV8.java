/*
 * @purpose: Creating constructors and methods
 * 
 * @author: Areesha Tariq
 * @version: 12/25/2023
 */
public class StudentV8{

    private int grade1;
    private int grade2;
    private String name;
    private double average;
    private int greater = 0;

    //default constructor
    public StudentV8(){ 

    }

    // one parameter constructor
    public StudentV8(int g1){
        grade1 = g1;
        grade2 = 0;

    }
    // Second constructor
    public StudentV8(int g1, int g2){
        grade1 = g1;
        grade2 = g2;

    }
    // third overloaded constructor
    public StudentV8(int g1, int g2, String Name){
        grade1 = g1;
        grade2 = g2;
        name = Name;
    }

    //getters
    public int getGrade1(){
        return grade1;
    }

    public int getGrade2(){
        return grade2;
    }

    public String getName(){
        return name;
    }

    //setters
    public void setGrade1(int g1){
        grade1 = g1;
    }

    public void setGrade2(int g2){
        grade2 = g2;
    }

    public void setName(String Name){
        name = Name;
    }

    //class method to calculate the average of 2 grades
    public double calcAverage(int grade1, int grade2){
        double average = (double)(grade1 + grade2)/2.0;
        return average;

    }

    // overloaded method without parameters
    public void calcAverage(){
        average = (double)(grade1 + grade2)/ 2.0;

    }

    // method to determine which number is greater
    public int greater (int grade1, int grade2){
        if (grade1 > grade2){
            greater = grade1;
        } else{
            greater = grade2;
        }
    return greater;
    }

    // overloaded method with no constructors
    public int greater (){
        if (grade1 > grade2){
            greater = grade1;
        } else{
            greater = grade2;
        }
    return greater;
    }

    //method to display the object information
    public void display(){
        System.out.println(name +"\t\t " + grade1 + "\t\t " + grade2 + "\t\t " + average + "\t\t " + greater );    }


}