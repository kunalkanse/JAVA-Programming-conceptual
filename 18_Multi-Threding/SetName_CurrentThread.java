
/**
 *  Thread naming example using Thread class.
 *  @author Kunal kanse
 **/

public class SetName_CurrentThread {
 
     public static void main(final String[] args) {
  
        System.out.println("Thread main started");

        final Thread thread1 = new WorkerThread();
        thread1.setName("WorkerThread1");
  
        final Thread thread2 = new WorkerThread();
        thread2.setName("WorkerThread2");
  
        final Thread thread3 = new WorkerThread();
        thread3.setName("WorkerThread3");
  
        final Thread thread4 = new WorkerThread();
        thread4.setName("WorkerThread4");
  
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
  
        System.out.println("Thread main finished");
    }
}

class WorkerThread extends Thread {

     @Override
     public void run() {
          System.out.println("Thread Name :: " + Thread.currentThread().getName());
     }
}