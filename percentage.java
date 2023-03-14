import java.util.*;
class percentage
{
 
    public static void main(String args[]) {
     Scanner v=new Scanner(System.in);
     System.out.println("enter value of n");
     int n=v.nextInt();
     int sum=0;
     System.out.println("enter the marks in diff subjects");
     for(int i=0;i<n;i++)
     {
         sum +=v.nextInt();
     }
     System.out.println("the percentage is"+(sum/n)+"%");
     }
     
 }


