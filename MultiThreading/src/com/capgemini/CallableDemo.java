package com.capgemini;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) {
		Callable<Integer> task = ()-> {return Thread.currentThread().getPriority();};
		ExecutorService service = Executors.newFixedThreadPool(4);
		Future<Integer> futureValue = service.submit(task);    

	}

}
