package threads;
public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	public static void main(String[] args) {
		
			
				tmod(50);
			
	}


static void tmod(int i) {
	if(i>0) {
		
	Thread b = new Thread(()->{
		
		
		
	});
	b.start();
	tmod(i-1);
	
	
	}
	System.out.println("HELLO FROM THREAD: "+i);
}
}

