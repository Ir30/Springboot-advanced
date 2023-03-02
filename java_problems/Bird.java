import java.net.Socket;

abstract class Bird
{
    abstract void swim();
    abstract void fly();
    abstract void eat();
    void walk()
    {
        System.out.println("walking....");
    }
}

abstract class peacoak extends Bird
{
    @Override
    void fly() {
        // TODO Auto-generated method stub
       System.out.println("flying...."); 

    }
    void eat()
    {
        System.out.println("eating");
    }
    abstract void swim();

}

class white_peacoak extends peacoak
{
    void swim()
    {
        System.out.println("swimming");
    }

    public static void main(String[] args)
    {
        
    }
}
