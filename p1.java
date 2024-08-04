/*Write a Java Program to accept two student details.
Let the student details include Name, Id, Mark 1 and Mark2. 
Also calculate student's average mark.
Use constructor to initialize the instance variables.
Create a student class and instantiate in the main class.*/

import java.util.Scanner;
class Student
{
 String Sname;
 String Sid;
 double mark1;
 double mark2;
 Student()
  {
   Sname=" ";
   Sid= " ";
   mark1=0.0;
   mark2=0.0;
  }
 void acceptd()
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Student name:");
   Sname= sc.nextLine();
   System.out.println("Enter Student id:");
   Sid=sc.nextLine();
   System.out.println("Enter student mark1:");
   mark1=sc.nextDouble();
   System.out.println("Enter student mark2:");
   mark2=sc.nextDouble();
 }
 void out_details()
 {
   System.out.println("Name = " + Sname);
   System.out.println("Id = " + Sid);
   System.out.println("Mark1 = " + mark1);
   System.out.println("Mark2 = " + mark2);
 }
 void calc_avg()
 {
   double avg= (mark1+mark2)/2;
   System.out.println("Average = "+avg);
 }
}
public class p1
{
  public static void main(String [] args)
  {
    Student s1=new Student();
    Student s2=new Student();
    s1.acceptd();
    s1.out_details();
    s1.calc_avg();
    s2.acceptd();
    s2.out_details();
    s2.calc_avg();
   }
}
   