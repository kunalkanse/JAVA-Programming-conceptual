
class UserThread extends Thread
{
    public void run()
    {
        System.out.println("Inside run");

    }
}

class ThreadOperations
{
    public static void main(String a[])
    {
        Thread t = Thread.currentThread();
        String tname = t.getName();

        System.out.println("Current Thread name : " + tname);

        t.setName("MyThread");

        System.out.println("Current Thread name : " + t.getName());

        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException IE)
        {}

        //starting thread
        UserThread UT = new UserThread();
        //Thread th = new Thread(UT);

        UT.start();

        try 
        {   
            UT.join();
        }
        catch(InterruptedException IE2)
        {}
        

        System.out.println(UT.getId());
        System.out.println(UT.getName());
        
    }
}