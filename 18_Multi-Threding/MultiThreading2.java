

// creating thread using Runnable interface
class MyThread2 extends Thread
{
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
