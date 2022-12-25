

public class ThreadPriority 
{
     public static void main(final String[] args)
    {
          final Runnable runnable = () -> {
               System.out.println("Running thread name : " + Thread.currentThread().getName() +  
               " and it's priority : " + Thread.currentThread().getPriority());
   
          };
  
          final Thread thread1 = new Thread(runnable);
          final Thread thread2 = new Thread(runnable);
          final Thread thread3 = new Thread(runnable);
          final Thread thread4 = new Thread(runnable);
          thread1.setPriority(Thread.MIN_PRIORITY);
          thread2.setPriority(Thread.NORM_PRIORITY);
          thread3.setPriority(Thread.MAX_PRIORITY);
          thread4.setPriority(2);
  
          thread1.start();
          thread2.start();
          thread3.start();
          thread4.start();
     }
}