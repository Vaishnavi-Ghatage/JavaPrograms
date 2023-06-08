//Constructor Overloading

public class Student {
//instance variables of the class
int id;
String name;
Student()
{
System.out.println("this a default constructor");
}
Student(int i, String n)
{
id = i;
name = n;
}
public static void main(String[] args)
{
//object creation
Student s1 = new Student();
System.out.println("\nDefault Constructor values:");
System.out.println("Student Id : "+s1.id + "\nStudent Name : "+s1.name);
System.out.println("\nParameterized Constructor values: \n");
Student s2 = new Student(10, "Kalpana");
System.out.println("Student Id : "+s2.id + "\nStudent Name : "+s2.name);
}
}