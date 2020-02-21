package com.capgemini;

public class ThreadDemo extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++) {
			
		
		System.out.println(Thread.currentThread().getName()+" " +i);
		try {
			Thread.sleep(1000);
		}
		catch(InterreptedException e)	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
