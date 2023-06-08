/*Develop a java application to implement currency converter (Dollar
to INR, EURO to INR, Yen to INR and vice versa), distance converter (meter
to KM, miles to KM and vice versa), time converter (hours to minutes,
seconds and vice versa) using packages.*/

//Dollar.java
package converter;
import java.util.*;
public class Dollar {
public void CurrencyConvert(){
double inr,USD_RATE,EURO_RATE,YEN_RATE,DOLLAR,EURO,YEN;
System.out.println("\nDOLLAR TO INR");
Scanner in=new Scanner(System.in);
System.out.print("Enter INR to convert into USD, EURO and YEN: ");
inr =in.nextDouble();
System.out.print("Enter Current USD rate : ");
USD_RATE=in.nextDouble();
System.out.print("Enter Current EURO rate : ");
EURO_RATE=in.nextDouble();
System.out.print("Enter Current YEN rate : ");
YEN_RATE=in.nextDouble();
DOLLAR=inr/USD_RATE;
EURO=inr/EURO_RATE;
YEN=inr/YEN_RATE;
System.out.println("\nINR = "+inr+"\n in Dollars = "+DOLLAR);
System.out.println("\nINR = "+inr+"\n in EURO = "+EURO);
System.out.println("\nINR = "+inr+"\n in YEN = "+YEN);
}
public void DistanceConvert(){
double km,meters,miles;
System.out.println("Distance converter");
Scanner in=new Scanner(System.in);
System.out.print("Enter the distance in meters: ");
meters=in.nextDouble();
km=meters/1000;
miles=meters/1600;
System.out.println("\nMeters = "+meters+"\nKM = "+km+"\tMiles = "+miles);
}
public void TimeConvert(){
double min,hour,sec;
System.out.println("Time COnverter");
Scanner in=new Scanner(System.in);
System.out.println("Enter the time in hours : ");
hour=in.nextDouble();
min=hour*60;
sec=hour*3600;
System.out.println("\nHours = "+hour+"\nMinutes = "+min+"\nSeconds =
"+sec);
}
}
// Compute.java
import converter.Dollar;
public class Compute {
public static void main(String s[]){
Dollar d=new Dollar();
d.CurrencyConvert();
d.DistanceConvert();
d.TimeConvert();
}
}