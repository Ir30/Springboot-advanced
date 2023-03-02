import java.util.Scanner;

public class fact 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first:");
        int first=sc.nextInt();

        System.out.println("enter the second:");
        int second=sc.nextInt();
        
        int fact1=1;
        for (int i=1;i<=first;i++)
        {
            fact1 = fact1*i;
        }

        int fact2=1;
        int j=1;
        while(j<=second)
        {
            fact2 = fact2 *j;
            j=j++;

        }

        System.out.println(fact1);
        System.out.println(fact2);
    }
}
