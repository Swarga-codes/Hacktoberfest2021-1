import java.util.*;
class Prime{
  public static void main(String args[]){
    int n,i,k=0;
  Scanner ob=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=ob.nextInt();
    for(i=0;i<=n;i++){
      if(n%i==0)
        k++;
    }
    if(k==2)
      System.out.println("Prime Number...");
    else 
      System.out.println("Not a Prime Number...");
  }
}
