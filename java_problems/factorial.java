
//Finding the factorial of a number using recursion
import java.util.Scanner;

public class factorial 
{

static int fact(int n)
{
    int result;
    if(n==1)
    {
        return 1;
    }

    result = fact(n-1)*n;

    return result;
}
 public static void main(String[] args)
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number to find factorial: ");
    int num = sc.nextInt();

    System.out.println("The factorial of the number "+num+" is: "+fact(num));

    
  }   
}
