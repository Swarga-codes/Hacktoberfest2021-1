import java.util.*;
class Armstrong{
  public static void main(){
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=ob.nextInt();
    int s=0;
    int a=n;
    while(n!=0){
      int d=n%10;
      s=s+(d*d*d);
      n=n/10;
    }
    if(s==a)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not an Armstrong Number");
    }
}
