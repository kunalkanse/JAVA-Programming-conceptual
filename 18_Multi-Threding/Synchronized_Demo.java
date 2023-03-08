

class Sync
{
    public void Display(String str)
    {
        synchronized(this)
        {
            System.out.print(Thread.currentThread().getName() + " : ");

            for(int i = 0; i < str.length(); i++)
            {
                System.out.print(str.charAt(i));

                try
                {
                    Thread.sleep(200);
                }
                catch(InterruptedException ie)
                {
                    System.out.println(ie);
                }
            }
        }

        System.out.println();
    }

/*
    synchronized public void Display(String str)
    {
        synchronized(this)
        {
            System.out.print(Thread.currentThread().getName() + " : ");

            for(int i = 0; i < str.length(); i++)
            {
                System.out.print(str.charAt(i));
            }
        }

        System.out.println();
    }
*/

}

class MyThread1 extends Thread
{
    Sync s;

    public MyThread1(Sync s , String str)
    {
        super(str);
        this.s = s;
    }

    public void run()
    {
        s.Display("Hello There");
    }
}

class MyThread2 extends Thread
{
    Sync s;

    public MyThread2(Sync s , String str)
    {
        super(str);
        this.s = s;
    }

    public void run()
    {
        s.Display("welcome");
    }
}

class Synchronized_Demo 
{
    public static void main(String[] args)
    {
        Sync sc = new Sync();

        MyThread1 m1 = new MyThread1(sc,"Thread_1");
        MyThread2 m2 = new MyThread2(sc,"Thread_2");

        m1.start();
        m2.start();
    }
}
