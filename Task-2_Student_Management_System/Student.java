import java.io.Serializable;

public class Student implements Serializable 
{
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name,String grade)
    {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }
    public int getRollNumber()
    {
        return this.rollNumber;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public void displayDetails()
    {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", Grade:" + grade);
    }
}
