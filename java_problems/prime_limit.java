import java.util.Scanner;

public class prime_limit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        for(int j=2;j<limit;j++)
        {
            int count = 0;

            for(int i=2;i<= j/2;i++)
                {
                    if (j%i == 0)
                    {
                        count = count+1;
                        break;
                    }
                }

                if (count == 0)
                {
                    System.out.println(j);
                }
        }  
    }    
}
