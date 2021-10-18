import java.util.*;
class LeapYear{
  public static void main(String args[]){
    int year;
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the year to be checked:");
    year=ob.nextInt();
    if(year%4==0)
      System.out.println("Leap Year...");
    else
      System.out.println("Not a Leap Year...");
  }
}
