import java.util.Arrays;
import java.util.Random;
public class AddEx2 {
public static void main(String[] args){
//Primitive Types
char x='a'; //due to point (1)
char y='b'; //due to point (1)
System.out.println(x); //due to point (4)
System.out.println(x +" " + y); //due to points (2) and (4) 
x=y;//due to points (3)
System.out.println("" + x +" " +y); //due to points (2) and (4) 
//Arrays
char[] myArray1 = {'a', 'b','c','d','e'}; // due to point (1) 
char[] myArray2 = {'f','g','h','i','j'}; // due to point (1)
char[] myArray3=myArray1; // due to point (3)
System.out.println(Arrays.toString(myArray1)); // due to point (4)
System.out.println(Arrays.toString(myArray2)); // due to point (4)
System.out.println(Arrays.toString(myArray3)); // due to point (4)
myArray2=myArray3; // due to point(3)
System.out.println(Arrays.toString(myArray1)); // due to point (4)
System.out.println(Arrays.toString(myArray2)); // due to point (4)
System.out.println(Arrays.toString(myArray3)); // due to point (4)
//Objects
Random r1 = new Random(5); // due to point (5) 
Random r2= new Random(5); // due to point (5) 
Random r3=r1; // due to point (3)
r2=r1; // due to point (3)
String s1= "abc"; // due to point (1)
String s2 = "xyz"; // due to point (1)
String s3= new String("abc"); // due to point (1)
System.out.println(s1+ " "+ s2+ " " + s3); // due to points (2) and (4)

System.out.println("" + (s1==s2?"t":"f") +"
"+ (s1==s3?"t":"f") +" "+ (s2==s3?"t":"f") ); // due to points (2), (4) and (6)

s2="abc"; // due to point (1)
System.out.println(s1+ " "+ s2+ " " + s3); // due to points (2) and (4)

System.out.println("" + (s1==s2?"t":"f") +"
"+ (s1==s3?"t":"f") +" "+ (s2==s3?"t":"f") ); // due to points (2), (4) and (6)

s1=s2; // due to point (3)
System.out.println(s1+ " "+ s2+ " " + s3);  // due to points (2) and (4)

System.out.println("" + (s1==s2?"t":"f") +"
"+ (s1==s3?"t":"f") +" "+ (s2==s3?"t":"f") ); // due to points (2), (4) and (6)

s3= new String("xyz"); // due to point (5)
System.out.println(s1+ " "+ s2+ " " + s3); // due to points (2) and (4)

System.out.println("" + (s1==s2?"t":"f") +"
"+ (s1==s3?"t":"f") +" "+ (s2==s3?"t":"f") ); // due to points (2), (4) and (6)
}}