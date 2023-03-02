class GarbageCollection 
{
    static int counter = 0;

    GarbageCollection()
    {
        counter=counter+1;
    }

    protected void finalize()throws Throwable
    {
        counter=counter-1;
    }

    public static void main(String[] args) 
    {
        GarbageCollection t1= new GarbageCollection();
        GarbageCollection t2= new GarbageCollection();    
        GarbageCollection t3= new GarbageCollection();    
        GarbageCollection t4= new GarbageCollection();
        
        t1=null;
        t3=t1;
        System.gc();
        //Runtime.getRuntime().gc();

        System.out.println("Object alive: "+ counter);

    }
}