package com.capgemini;

public class Admission extends Thread
{
	
	int seats = 1;
	
	public synchronized void run() 
	{
		if(seats>0) 
		{
		System.out.println("Seat is alloted to " +Thread.currentThread().getName());
		}
		else
		{
			System.err.println("try next year");
		}
		seats--;
		System.out.println(" number of seats after "+seats);
		
		}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Admission obj = new Admission();
		Thread t1 = new Thread(obj,"nagasri");
		Thread t2 = new Thread(obj,"pavani");
		t1.start();
		t2.start();
		System.out.println("Available number of seats before"+obj.seats);

	}

}

