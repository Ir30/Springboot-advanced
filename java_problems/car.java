class Cars
{
    String name;
    float prize;
    String model;

    public Cars()
    {
        name="maruthi";
        prize=347895;
        model="21lkj23";
    }

    public Cars(String x,float y)
    {
        name=x;
        prize=y;
    }

    public Cars(String x,float y,String z)
    {
        name=x;
        prize=y;
        model=z;
    }

    public void Show()
    {
        System.out.println("name : "+name);
        System.out.println("Prize : "+prize);
        System.out.println("Model : "+model);
        System.out.println(" ");
    }
    

}
public class car 
{
    public static void main(String[] args)
    {
        Cars c1 = new Cars();
        Cars c2 = new Cars("BMW",3658479);
        Cars c3 = new Cars("Benz",3487561,"654jhgfj");

        c1.Show();
        c2.Show();
        c3.Show();
    }
}
