package Basics;

public class thread {

	public static void main(String[] args) {
		//Every program has a one thread, we can use multiple as well.
		//Here a main thread is there and it starts another thread at line 9.
		MyThread t = new MyThread();//Thread initialization
		t.start();//Starting of a new child thread
		//t.run(); run will be executed by main thread only, no new thread will be created
		// this points onward there are 2 threads, 
		//main thread and child thread which is started at start statement
		for(int i=0;i<5;i++)
		{
			System.out.println("In main thread");
		}
		//this for loop is a job for main thread. Executed by main thread
	}
}
// here we are definig a thread
class MyThread extends Thread // extend Thread to create a new thread
{
	// this is a job for child thread and will be executed by child thread.
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}

}


class myRunnable implements Runnable
{
	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class thread {

	public static void main(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("In main thread");
		}		
	}
}

