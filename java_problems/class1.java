class class1 {

    public int x;
    private int y;
    int z;

    int gety() 
    {
        return x;
    }

    void sety(int x)
    {
        this.x = x;
    }
    
}

class class2{
    public static void main(String[] args)
    {
        class1 c1 = new class1();
        c1.x=20;
        c1.z = 30;

        c1.sety(40);
        System.out.println(c1.gety());
    }
}
