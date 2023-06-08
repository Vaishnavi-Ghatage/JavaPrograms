/*Write a program to perform string operations using ArrayList. Write
functions for the following a. Append - add at end b. Insert – add at particular
index c. Search d. List all string starts with given letter.*/

import java.util.*;
public class ArrayL{
ArrayList<String> list=new ArrayList<String>();
public void array_display(){
list.add("CSE");
list.add("ECE");
list.add("MECH");
System.out.println("ArrayList Elements are");
System.out.println(list);
System.out.print("");
}
public void append_at_end(){
System.out.println("Enter the element to append at end");
Scanner inputObj=new Scanner(System.in);
String ele=inputObj.next();
list.add(ele);
System.out.println(list);
System.out.print("");
}
public void insert_at_pos(){
System.out.println("Enter the position and element to be inserted");
Scanner inputObj=new Scanner(System.in);
int posindex=inputObj.nextInt();
String ele=inputObj.next();
list.add(posindex,ele);
System.out.println(list);
System.out.print("");
}
public void search_element(){
System.out.println("Enter the array element to be searched");
Scanner inputObj=new Scanner(System.in);
String ele=inputObj.next();
int index=list.indexOf(ele);
if(index==-1){
System.out.println("Element not found");
}
else{
System.out.println("Element found at index: "+index);
}
}
public void print(){
System.out.println("Enter the starting character to print strings");
Scanner inputObj=new Scanner(System.in);
char input_char=inputObj.next().charAt(0);
String strc=Character.toString(input_char);
System.out.println("String starting with character"+ strc);
for(int i =0;i<list.size();i++){
if(list.get(i).startsWith(strc)){
System.out.println(list.get(i));
}
}
}
public static void main(String args[]){
ArrayL obj=new ArrayL();
obj.array_display();
obj.append_at_end();
obj.insert_at_pos();
obj.search_element();
obj.print();
}
}
