/*Write a java program for Method overloading and Constructor
overloading.*/

import java.io.*;
public class MethodOverloading
{
public static void main(String args[])
{
System.out.println("add() with 2 parameters");
System.out.println(add(4, 6));
System.out.println("add() with 3 parameters");
System.out.println(add(4, 6, 7));
}
static int add(int a, int b)
{
return a + b;
}
static int add(int a, int b, int c)
{
return a + b + c;
}
}