public class VarArgs 
{
    static int sum(int... s)
    {
        int sum=0;
        for(int i:s)
        {
           sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
       System.out.println(sum(12,45));
       System.out.println(sum(22,41,78,65,35,48));
       System.out.println(sum(12,45,87));    
    }
}