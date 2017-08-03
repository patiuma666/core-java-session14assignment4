package assignmnet14;

  public class DaemonTest extends Thread
{
	public void run(){
		
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread : " + Thread.currentThread().getName());
		}
		else
		{
			System.out.println("user thread : " + Thread.currentThread().getName());
		}
	}

          public static void main(String[]args)
          {
        	  DaemonTest test1 = new DaemonTest();
        	  test1.setName("Thread 1");
        	  DaemonTest test2 = new DaemonTest();
        	  test2.setName("Thread 2");
        	  
        	  test1.setDaemon(true);
        	  test1.start();
        	  test2.start();
          }
}