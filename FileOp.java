/*Write a java program that reads a file name from the user, displays
information about whether the file exists, whether the file is readable, or
writable, the type of file and the length of the file in bytes.*/

import java.io.File;
import java.util.*;
public class FileOp {
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the File Name:");
String fname=obj.next();
File f=new File(fname);
f.setWritable(true);
System.out.println(f.exists() ? "File Exists" : "File Does not Exist");
System.out.println(f.canWrite() ? "File is Writable" : "File is not Writable");
System.out.println(f.canRead() ? "File is Readable" : "File is not Readable");
String filename=f.toString();
int index=filename.lastIndexOf('.');
if(index>0){
String type=filename.substring(index+1);
System.out.println("File type is: "+type);
}
else
System.out.println("File does not have type");
System.out.println("File Size: "+f.length()+ " Bytes");
}
}