package edu.kubie.test;

public class ThreadPractice {
	
	public static class PrintChar implements Runnable{

		private char charToPrint;  // the Character that is going to be printed
		private int times;  // The number of times the character will be printed
		
		// Now construct the task with a character and the number of times it will be printed
		public PrintChar(char c, int t){
			charToPrint = c;
			times = t;
		}
		
		
		
		@Override
		public void run() {
			for (int i = 0; i < times; i++){
				System.out.println(charToPrint);
			}
			
		}
		
	}
	
	public static class PrintNum implements Runnable {
		
		private int lastNum; // This will be the last number
		
		// Construct a task for printing from 1 to lastNum
		public PrintNum(int n){
			lastNum = n;
		}

		@Override
		public void run() {
			for (int i = 1; i <= lastNum; i++){
				System.out.println(" " + i);
			}
			
		}
		
	}

}
