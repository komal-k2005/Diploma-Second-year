import java.util.*;
public class Switch{
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your first number");
  int  no1= sc.nextInt();
  System.out.println("Enter your second number:");
  int no2=sc.nextInt();
  System.out.println("ENTER YOUR CHOICE");
 int choice = sc.nextInt();
 sc.close();
 switch(choice)     {
 case 1:
    System.out.println("addition ="+(no1+no2));
    break;
case 2:
   System.out.println("substraction="+(no1-no2));
   break;
case 3:
   System.out.println("multiplication="+(no1*no2));
   break;
 case 4:
   System.out.println("division="+(no1/no2));
   break;
default:
System.out.println("WRONG CHOICE");

            
 }
    }
}