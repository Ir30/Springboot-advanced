import java.util.Scanner;

public class average 
{
 public static void main(String[] args) 
 {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the limit");
    int lim = sc.nextInt();
    
    int sum=0;
    
    for(int i=1;i<=lim;i++)
    {
        System.out.println("enter the number");
        int num =sc.nextInt();
        sum = sum+num;
    }

    float avg = (float)sum/lim;

    System.out.println("Average"+avg);
 }   
}
