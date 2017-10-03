package edu.kubie.test;

import java.util.concurrent.*;

public class TaskThread extends ThreadPractice{

	public static void main(String[] args) {
		
		// Create a fixed size ThreadPool
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		// Submit tasks to the executor, which is also the pool?
		executor.execute(new PrintChar('a', 100));
		executor.execute(new PrintChar('b', 100));
		executor.execute(new PrintNum(100));
		
		// Shutdown the executor
		executor.shutdown();
		
	}

}
