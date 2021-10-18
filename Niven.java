import java.util.*;

public class NivenNumber
{
    public static void main(String[] args)
    {
        int n, a, r, sum = 0;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number=");
        n = ob.nextInt();
        a = n;
        while (a > 0)
        {
            r = a % 10;
            sum = sum + r;
            a = a / 10;
        }
        if (n % sum == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not a Niven Number");
        }
    }
}
