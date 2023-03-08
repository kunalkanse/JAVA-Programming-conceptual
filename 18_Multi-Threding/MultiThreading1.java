
// creating thread using Runnable interface
class MyThread2 extends Thread
{

    public MyThread2(String s)
    {
        super(s);   // calling constructor : Thread(String s)
    }
    
    public void run()
    {
        for(int i = 0; i < 10 ; i++)
        {
            System.out.println("i = "+i);
            
            try
            {
                Thread.sleep(1000);     // Checked Exception
                //sleep() method throws InterruptedException exception, when another thread interrupts the current thread while sleep is active.
            }
            catch(InterruptedException ie)
            {
                
            }
        }
    }
}


// creating thread using Runnable interface
class MyThread1 implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 10 ; i++)
        {
            System.out.println("i = "+i);
            
            try
            {
                Thread.sleep(1000);     // Checked Exception
            }
            catch(Exception e)
            {
                
            }
        }
    }

    public static void main(String args[])
    {
        MyThread1 mythread1 = new MyThread1();  // implements runnable
        Thread t1 = new Thread(mythread1 , "Thread_1");  // Thread t1 = new Thread(new MyThread());

        MyThread2 t2 = new MyThread2("Thread_2"); // this class is in another file i.e MultiThreading2.java which extends Thread

        

        t1.start();
        t2.start();

    }
}
