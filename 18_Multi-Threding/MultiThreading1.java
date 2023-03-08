

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
        MyThread1 mythread = new MyThread1();

        MyThread2 t2 = new MyThread2(); // this class is in another file i.e MultiThreading2.java

        Thread t1 = new Thread(mythread);

        t1.start();
        t2.start();

    }
}
