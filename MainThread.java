/*Write a Java program that implements a multi-thread application that
has three threads. First thread generates a random integer for every 1 second;
second thread computes the square of the number and prints; third thread will
print the value of cube of the number.*/

import java.util.Random;
import java.util.Scanner;
class SquareThread implements Runnable {
int x;
SquareThread(int x) {
this.x = x;
}
public void run() {
System.out.println("Thread Name: Square Thread and Square of"+ x +" is: "+ x * x);
}
}
class CubeThread implements Runnable {
int x;
CubeThread(int x) {
this.x = x;
}
public void run() {
System.out.println("Thread Name: Cube Thread and Cube of "+x+" is: "+ x * x * x);
}
}
class RandomThread implements Runnable {
Random r;
Thread t2, t3;
public void run() {
int num;
r = new Random();
try
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the Number of Random Numbers:");
int n = input.nextInt();
System.out.println();
for(int i=0 ; i<n ; i++)
{
num = r.nextInt(100);
System.out.println("Main Thread and Generated Number is: "+ num);
t2 = new Thread(new SquareThread(num));
t2.start();
t3 = new Thread(new CubeThread(num));
t3.start();
Thread.sleep(1000);
System.out.println("--------------------------------------");
}
}
catch (Exception ex)
{
System.out.println("Interrupted Exception");
}
}
}
public class MainThread
{
public static void main(String[] args)
{
RandomThread thread_obj = new RandomThread();
Thread t1 = new Thread(thread_obj);
t1.start();
}
}