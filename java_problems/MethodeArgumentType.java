
/*
 * demonstrating methode overloding and passing defferant type of argument such as:
 * -primitive type
 * -object type
 * and returning the type as:
 * -primitive type
 * -object type
 */

class Test
{
    int x,y;

    Test(int a,int b)
    {
        x=a;
        y=b;
    }

    public int sum(int x,int y)
    {
        return x+y;
    }

    public int sum(Test m)
    {
        return m.x+m.y;
    }

    public Test sum(int x)
    {
        Test t = new Test(x,x);
        return t;

    }
}
public class MethodeArgumentType
{
    public static void main(String[] args) 
    {
        int result;
        Test mat =new Test(2, 3);

        result= mat.sum(5,9);//passing primitive data type to the methode
        System.out.println(result);

        result=mat.sum(mat);//passing object type as argument to methode
        System.out.println(result);

        result = mat.sum(mat.sum(4));//returning the object as argument and passint the object as argument to methode
        System.out.println(result);
    }
}