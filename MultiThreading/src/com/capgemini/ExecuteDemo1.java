package com.capgemini;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecuteDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1=()->System.out.println(Thread.currentThread().getName
				());
		//ExecutorService service = Executors.newSingleThreadExecutor();
	int coreCount = Runtime.getRuntime().availableProcessors();
	System.out.println(coreCount);
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
			for(int i=0;i<=10;i++)
			service.execute(task1);
	}

}
class Task implements Runnable{

	@Override 
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName
				());
		
	}
	
}