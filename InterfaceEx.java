/*Write a program to generate the resume. Create 2 Java classes Teacher
(data: personal information, qualification, experience, achievements) and
Student (data: personal information, result, discipline) which implements the
java interface Resume with the method biodata().*/

interface Resume {
void bioData ();
}
class Teacher implements Resume {
String name,Qualification,achievements;
float experience;
public void bioData () {
name="Prasanna Patil";
Qualification="M.Tech";
achievements="Android Developer";
experience=9.6f;
System.out.println("Teacher Resume");
System.out.println("Name: "+name);
System.out.println("Qualification: "+Qualification);
System.out.println("Achievements: "+achievements);
System.out.println("Experience: "+experience);
}
}
class Student implements Resume {
String name, Discipline;
float result;
public void biodata(){
name="Mahendra Singh Dhoni";
Discipline="CSE";
result=8.7f;
System.out.println("STUDENT Resume");
System.out.println("Name: "+name);
System.out.println("Discipline: "+Discipline);
System.out.println("Result: "+result+"CGPA");
}
}
public class InterfaceEx{
public static void main(String[] args){
Teacher T1=new Teacher();
T1.bioData();
Student S1=new Student();
S1.biodata();
}
}
